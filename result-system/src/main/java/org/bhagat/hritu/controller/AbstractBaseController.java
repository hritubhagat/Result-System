package org.bhagat.hritu.controller;

/**
 * Base controller class of the project. It contains Generic constants, operations and work flow.
 * 
 * @author hritu
 * @version 1.0
 *
 */
public class AbstractBaseController {

	/**
	 * Operation Constants
	 */
	protected static final String OP_SAVE="Save";
	protected static final String OP_NEW="New";
	protected static final String OP_DELETE="Delete";
	protected static final String OP_CANCEL="Cancel";
	protected static final String OP_ERROR="Error";
	protected static final String OP_NEXT="Next";
	protected static final String OP_PREVIOUS="Previous";
	protected static final String OP_SIGNIN="Sign In";
	protected static final String OP_SIGNUP="Sign Up";
	protected static final String OP_LOGOUT="Logout";
	protected static final String OP_GO="Go";
	
	protected String operation;
	
	protected long id;
	protected String createdBy;
	protected String modifiedBy;
	protected long createdDateTime;
	protected long modifiedDateTime;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public long getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	public long getModifiedDateTime() {
		return modifiedDateTime;
	}
	public void setModifiedDateTime(long modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}
	
	
}
