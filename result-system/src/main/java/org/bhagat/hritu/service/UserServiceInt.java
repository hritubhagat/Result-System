package org.bhagat.hritu.service;

import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.exception.ApplicationException;

public interface UserServiceInt {
	
	public UserDTO findByLogin(String login) throws ApplicationException;
	public UserDTO authenticate(UserDTO dto) throws ApplicationException;
}
