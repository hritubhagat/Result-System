package org.bhagat.hritu.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Base class of all the DTOs in the project. It has all the common attributes
 * 
 * @author hritu
 * @version 1.0
 *
 */
public abstract class BaseDTO implements Serializable, DropdownList, Comparable<BaseDTO> {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -939508542733202837L;
	/**
	 * Non Business Primary key
	 */
	protected long id;
	/**
	 * Contains user ID who created this database record
	 */
	protected String createdBy;
	/**
	 * Contains user ID who modified this database record
	 */
	protected String modifiedBy;
	/**
	 * Contains created Timestamp of database record
	 */
	protected Timestamp createdDateTime;
	/**
	 * Contains modified Timestamp of database record
	 */
	protected Timestamp modifiedDateTime;

	/**
	 * Getter method to get id
	 * 
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Setter method to set id
	 * 
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * Getter method to get name of user who created this database record
	 * 
	 * @return : name of user
	 */
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

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public int compareTo(BaseDTO next) {
		return getValue().compareTo(next.getValue());
	}
}
