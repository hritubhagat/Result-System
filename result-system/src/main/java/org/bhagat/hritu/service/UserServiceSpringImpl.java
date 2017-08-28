package org.bhagat.hritu.service;

import java.sql.Timestamp;
import java.util.Date;

import org.bhagat.hritu.dao.UserDAOInt;
import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.exception.ApplicationException;
import org.bhagat.hritu.exception.DatabaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceSpringImpl implements UserServiceInt{

	private static Logger log=LoggerFactory.getLogger(UserServiceSpringImpl.class);
	
	@Autowired
	private UserDAOInt userDao;
	
	public UserDTO findByLogin(String login) throws ApplicationException {
		log.debug("Service findByLogin Started");
		UserDTO dto=null;
		try{
			dto = userDao.findByLogin(login);
			
		}catch(DatabaseException e){
			log.error("Application Exception::{}",e);
			throw new ApplicationException("Database Exception");
		}
		log.debug("Service findByLogin Ended");
		return dto;
	}

	public UserDTO authenticate(UserDTO dto) throws ApplicationException {
		try{
			UserDTO dtoExists = userDao.findByLogin(dto.getLogin());
			if(dtoExists !=null && dtoExists.getPassword().equals(dto.getPassword())){
				dtoExists.setLastLogin(new Timestamp(new Date().getTime()));
				dtoExists.setLastLoginIP(dto.getLastLoginIP());
				userDao.update(dtoExists);
				return dtoExists;
			}else{
				throw new ApplicationException("Invalid Username or Password");
			}
		}catch(DatabaseException e){
			log.error("Application Exception....{}",e);
			throw new ApplicationException("DataBaseException");
		}
	}
	
	

}
