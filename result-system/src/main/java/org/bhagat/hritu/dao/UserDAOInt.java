package org.bhagat.hritu.dao;

import org.bhagat.hritu.dto.UserDTO;
import org.bhagat.hritu.exception.DatabaseException;

public interface UserDAOInt {
	public UserDTO findByLogin(String login) throws DatabaseException;
	public void update(UserDTO dto) throws DatabaseException;
}
