package org.bhagat.hritu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.exception.ApplicationException;
import org.bhagat.hritu.service.UserServiceInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application Login functionality.
 */
@Controller
@RequestMapping(value = "/auth")
public class LoginController extends AbstractBaseController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserServiceInt userService;
	/**
	 * Simply selects the login view to render by returning its name.
	 */
	@RequestMapping(value = "/d_login", method = RequestMethod.GET)
	public String displayLogin() {
		log.info("displayLogin method called");
		return "login";
	}

	@RequestMapping(value = "/s_login", method = RequestMethod.POST)
	public ModelAndView authenticate(UserDTO userDto,HttpServletRequest request) {
		log.debug("authenticate method called");
		ModelAndView mav=new ModelAndView("home");
		UserDTO dto = new UserDTO();
		dto.setLogin(userDto.getLogin());
		dto.setPassword(userDto.getPassword());
		dto.setLastLoginIP(request.getRemoteAddr());
		
		try{
			HttpSession session = request.getSession();
			log.debug("Session is ::{}",session);
			if(session.getAttribute("user")==null){
				log.debug("Going inside if condition");
				dto = userService.authenticate(dto);
				session = request.getSession();
				session.setAttribute("user", dto);
				mav.addObject("msg", dto.getFirstName()+" "+dto.getLastName());
			}else{
				log.debug("Going inside else condition because previous user has not logged out");
				dto = (UserDTO)session.getAttribute("user");
				mav.addObject("msg", dto.getFirstName()+" "+dto.getLastName());
			}
		}catch(ApplicationException e){
			log.error("Critical Issue::{}",e);
			mav=new ModelAndView("login");
			mav.addObject("error", "Invalid Username and Password");
			return mav;
		}
		return mav;
	}

}
