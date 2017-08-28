package org.bhagat.hritu.exception;

/**
 * Custom DatabaseException, which is generated and propagated by DAO
 * classes when a database exception occurs
 * 
 * @author hritu
 *
 */
public class DatabaseException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3738722965738332445L;

	/**
	 * DatabaseException constructor
	 * @param msg : provides the description of exception
	 */
	public DatabaseException(String msg) {
		super(msg);
	}
}
