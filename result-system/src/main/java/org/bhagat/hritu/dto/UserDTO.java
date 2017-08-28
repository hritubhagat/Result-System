package org.bhagat.hritu.dto;

import java.sql.Timestamp;
import java.util.Date;

/**
 * This class represents java bean for user which include all the user related
 * attributes.
 * 
 * @author hritu
 *
 */
public class UserDTO extends BaseDTO {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -8978465186383017455L;
	/**
	 * Constant to show if user account lock is Active
	 */
	public static final String ACTIVE = "Active";
	/**
	 * Constant to show if user account lock is Inactive
	 */
	public static final String INACTIVE = "Inactive";

	/**
	 * First name of the user
	 */
	private String firstName;
	/**
	 * Last name of the user
	 */
	private String lastName;
	/**
	 * Login id of the user
	 */
	private String login;
	/**
	 * Password of the user
	 */
	private String password;
	/**
	 * Date of birth of the user
	 */
	private Date dob;
	/**
	 * Mobile number of the user
	 */
	private String mobileNo;
	/**
	 * Role ID of the user
	 */
	private long roleId;
	/**
	 * Number of unsuccessful login of the user
	 */
	private int unsuccessfulLogin;
	/**
	 * Gender of the user
	 */
	private String gender;
	/**
	 * Last login Timestamp of user
	 */
	private Timestamp lastLogin;
	/**
	 * Variable to show if user account is locked or not
	 */
	private String lock = INACTIVE;
	/**
	 * IP Address of machine from where user was registered
	 */
	private String registeredIP;
	/**
	 * IP Address of machine from where user logged in last time
	 */
	private String lastLoginIP;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public int getUnsuccessfulLogin() {
		return unsuccessfulLogin;
	}

	public void setUnsuccessfulLogin(int unsuccessfulLogin) {
		this.unsuccessfulLogin = unsuccessfulLogin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Timestamp lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLock() {
		return lock;
	}

	public void setLock(String lock) {
		this.lock = lock;
	}

	public String getRegisteredIP() {
		return registeredIP;
	}

	public void setRegisteredIP(String registeredIP) {
		this.registeredIP = registeredIP;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public static String getActive() {
		return ACTIVE;
	}

	public static String getInactive() {
		return INACTIVE;
	}

	public String getKey() {
		return Long.toString(id);
	}

	public String getValue() {
		return firstName + " " + lastName;
	}

}
