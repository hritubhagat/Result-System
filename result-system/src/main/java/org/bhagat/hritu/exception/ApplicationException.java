package org.bhagat.hritu.exception;

/**
 * Custom ApplicationException, which is generated and propagated by service
 * classes when a business logic exception occurs
 * 
 * @author hritu
 *
 */
public class ApplicationException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5070924666894569189L;

	/**
	 * ApplicatonException constructor
	 * @param msg : provides the description of exception
	 */
	public ApplicationException(String msg) {
		super(msg);
	}
}
