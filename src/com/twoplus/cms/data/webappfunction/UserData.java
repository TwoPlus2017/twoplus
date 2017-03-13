/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  UserData.java
 * Purpose:   xxx
 * Classes:   UserData
 */
package com.twoplus.cms.data.webappfunction;

import com.twoplus.espider.constant.Constants;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer            Date                 Change Reason        Change
 * ----------------     ----------------     ----------------     ----------------
 * Gavin.Zhang          Jan 24, 2017         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - YG Studio
 *
 * @version 01.00.00
 *
 */

public class UserData {

	private String id;
	
	private String name;
	
	private String password;
	
	private String headImagePath;
	
	private String roleId;
	
	private String createDate;
	
	private String createBy;
	
	private String lastUpdateDate;
	
	private String lastUpdateBy;
	
	private String enabled;
	
	private String returnPage;
	
	public UserData() {
		id = Constants.EMPTY_STRING;
		name = Constants.EMPTY_STRING;
		password = Constants.EMPTY_STRING;
		headImagePath = Constants.EMPTY_STRING;
		roleId = Constants.EMPTY_STRING;
		createDate = Constants.EMPTY_STRING;
		createBy = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		lastUpdateBy = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
		returnPage = Constants.EMPTY_STRING;
	}

	/**
	 * Getter for the property id.
	 * 
	 * @return The value for the id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter for property id.
	 *
	 * @param id new value of property id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Getter for the property name.
	 * 
	 * @return The value for the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for property name.
	 *
	 * @param name new value of property name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the property password.
	 * 
	 * @return The value for the password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Setter for property password.
	 *
	 * @param password new value of property password.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Getter for the property headImagePath.
	 * 
	 * @return The value for the headImagePath.
	 */
	public String getHeadImagePath() {
		return headImagePath;
	}

	/**
	 * Setter for property headImagePath.
	 *
	 * @param headImagePath new value of property headImagePath.
	 */
	public void setHeadImagePath(String headImagePath) {
		this.headImagePath = headImagePath;
	}

	/**
	 * Getter for the property roleId.
	 * 
	 * @return The value for the roleId.
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * Setter for property roleId.
	 *
	 * @param roleId new value of property roleId.
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * Getter for the property createDate.
	 * 
	 * @return The value for the createDate.
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * Setter for property createDate.
	 *
	 * @param createDate new value of property createDate.
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * Getter for the property createBy.
	 * 
	 * @return The value for the createBy.
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * Setter for property createBy.
	 *
	 * @param createBy new value of property createBy.
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * Getter for the property lastUpdateDate.
	 * 
	 * @return The value for the lastUpdateDate.
	 */
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * Setter for property lastUpdateDate.
	 *
	 * @param lastUpdateDate new value of property lastUpdateDate.
	 */
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * Getter for the property lastUpdateBy.
	 * 
	 * @return The value for the lastUpdateBy.
	 */
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	/**
	 * Setter for property lastUpdateBy.
	 *
	 * @param lastUpdateBy new value of property lastUpdateBy.
	 */
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	/**
	 * Getter for the property enabled.
	 * 
	 * @return The value for the enabled.
	 */
	public String getEnabled() {
		return enabled;
	}

	/**
	 * Setter for property enabled.
	 *
	 * @param enabled new value of property enabled.
	 */
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	/**
	 * Getter for the property returnPage.
	 * 
	 * @return The value for the returnPage.
	 */
	public String getReturnPage() {
		return returnPage;
	}

	/**
	 * Setter for property returnPage.
	 *
	 * @param returnPage new value of property returnPage.
	 */
	public void setReturnPage(String returnPage) {
		this.returnPage = returnPage;
	}
	
	
}
