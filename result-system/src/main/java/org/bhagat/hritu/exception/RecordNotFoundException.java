package org.bhagat.hritu.exception;

/**
 * Custom RecordNotFoundException, which is generated and propagated by service
 * classes when a record is not found in the database
 * 
 * @author hritu
 *
 */
public class RecordNotFoundException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1817981291324673845L;

	/**
	 * RecordNotFoundException constructor
	 * 
	 * @param msg
	 *            : provides the description of exception
	 */
	public RecordNotFoundException(String msg) {
		super(msg);
	}
}
