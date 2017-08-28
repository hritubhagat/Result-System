package org.bhagat.hritu.exception;

/**
 * Custom DuplicateRecordException, which is generated and propagated by service
 * classes when an exception exception occurs because duplicate records are
 * added
 * 
 * @author hritu
 *
 */
public class DuplicateRecordException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6092044433826316264L;

	/**
	 * DuplicateRecordException constructor
	 * 
	 * @param msg
	 *            : provides the description of exception
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}
}
