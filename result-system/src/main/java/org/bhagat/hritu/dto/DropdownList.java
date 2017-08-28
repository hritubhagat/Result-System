package org.bhagat.hritu.dto;

/**
 * DropdownList interface is implemented by all the DTOs which are used to
 * create drop down list on JSP pages
 * 
 * @author hritu
 *
 */
public interface DropdownList {
	/**
	 * This method returns key of the dropdown list element
	 * 
	 * @return : key
	 */
	public String getKey();

	/**
	 * This method returns text displayed for dropdown list element
	 * 
	 * @return : value
	 */
	public String getValue();
}
