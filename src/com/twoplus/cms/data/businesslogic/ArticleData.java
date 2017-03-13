/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  ArticleData.java
 * Purpose:   xxx
 * Classes:   ArticleData
 */
package com.twoplus.cms.data.businesslogic;

import com.twoplus.espider.constant.Constants;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer			Date			  	 Change Reason		  Change
 * ----------------     ----------------     ----------------     ---------------
 * Gavin.Zhang			Oct 21, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GYG
 *
 * @version 01.00.00
 *
 */

public class ArticleData {

	/** Represents the id field */
	private String id;
	
	/** Represents the name field */
	private String name;
	
	/** Represents the url field */
	private String url;
	
	/** Represents the desc field */
	private String desc;
	
	/** Represents the title field */
	private String title;
	
	/** Represents the titleCounter field */
	private String titleCounter;
	
	/** Represents the levels field */
	private String levels;
	
	/** Represents the webSiteId field */
	private String webSiteId;
	
	/** Represents the matched field */
	private String matched;
	
	/** Represents the createBy field */
	private String createBy;
	
	/** Represents the createDate field */
	private String createDate;
	
	/** Represents the lastUpdateBy field */
	private String lastUpdateBy;
	
	/** Represents the lastUpdateDate field */
	private String lastUpdateDate;
	
	/** Represents the enabled field */
	private String enabled;
	
	/** Represents the postTableName field */
	private String postTableName;
	
	/** Represents the keyWordTableName field */
	private String keyWordTableName;
	
	/** Represents the webSiteShowName field */
	private String webSiteShowName;
	
	/** Represents the returnDirect field */
	private String returnDirect;
	
	/** Represents the returnPage field */
	private String returnPage;
	
	/** Represents the bufferStartCounter field */
	private String bufferStartCounter;
	
	/** Represents the bufferEndCounter field */
	private String bufferEndCounter;
	
	/** Represents the catId field */
	private String catId;
	
	/** Represents the postUrl field */
	private String postUrl;
	
	/**
	* Creates a new ArticleData object.
	*/
	public ArticleData() {
		id = Constants.EMPTY_STRING;
		name = Constants.EMPTY_STRING;
		url = Constants.EMPTY_STRING;
		desc = Constants.EMPTY_STRING;
		levels = Constants.EMPTY_STRING;
		webSiteId = Constants.EMPTY_STRING;
		matched = Constants.EMPTY_STRING;
		createBy = Constants.EMPTY_STRING;
		createDate = Constants.EMPTY_STRING;
		lastUpdateBy = Constants.EMPTY_STRING;
		lastUpdateDate = Constants.EMPTY_STRING;
		enabled = Constants.EMPTY_STRING;
		postTableName = Constants.EMPTY_STRING;
		returnPage = Constants.EMPTY_STRING;
		webSiteShowName = Constants.EMPTY_STRING;
		returnDirect = Constants.EMPTY_STRING;
		keyWordTableName = Constants.EMPTY_STRING;
		title = Constants.EMPTY_STRING;
		titleCounter = Constants.EMPTY_STRING;
		bufferStartCounter = Constants.EMPTY_STRING;
		bufferEndCounter = Constants.EMPTY_STRING;
		catId = Constants.EMPTY_STRING;
		postUrl = Constants.EMPTY_STRING;
	}

	/**
	 * Getter for the property postUrl.
	 * 
	 * @return The value for the postUrl.
	 */
	public String getPostUrl() {
		return postUrl;
	}

	/**
	 * Setter for property postUrl.
	 *
	 * @param postUrl new value of property postUrl.
	 */
	public void setPostUrl(String postUrl) {
		this.postUrl = postUrl;
	}

	/**
	 * Getter for the property catId.
	 * 
	 * @return The value for the catId.
	 */
	public String getCatId() {
		return catId;
	}

	/**
	 * Setter for property catId.
	 *
	 * @param catId new value of property catId.
	 */
	public void setCatId(String catId) {
		this.catId = catId;
	}

	/**
	 * Getter for the property bufferStartCounter.
	 * 
	 * @return The value for the bufferStartCounter.
	 */
	public String getBufferStartCounter() {
		return bufferStartCounter;
	}

	/**
	 * Setter for property bufferStartCounter.
	 *
	 * @param bufferStartCounter new value of property bufferStartCounter.
	 */
	public void setBufferStartCounter(String bufferStartCounter) {
		this.bufferStartCounter = bufferStartCounter;
	}

	/**
	 * Getter for the property bufferEndCounter.
	 * 
	 * @return The value for the bufferEndCounter.
	 */
	public String getBufferEndCounter() {
		return bufferEndCounter;
	}

	/**
	 * Setter for property bufferEndCounter.
	 *
	 * @param bufferEndCounter new value of property bufferEndCounter.
	 */
	public void setBufferEndCounter(String bufferEndCounter) {
		this.bufferEndCounter = bufferEndCounter;
	}

	/**
	 * Getter for the property title.
	 * 
	 * @return The value for the title.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Setter for property title.
	 *
	 * @param title new value of property title.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Getter for the property titleCounter.
	 * 
	 * @return The value for the titleCounter.
	 */
	public String getTitleCounter() {
		return titleCounter;
	}

	/**
	 * Setter for property titleCounter.
	 *
	 * @param titleCounter new value of property titleCounter.
	 */
	public void setTitleCounter(String titleCounter) {
		this.titleCounter = titleCounter;
	}

	/**
	 * Getter for the property keyWordTableName.
	 * 
	 * @return The value for the keyWordTableName.
	 */
	public String getKeyWordTableName() {
		return keyWordTableName;
	}

	/**
	 * Setter for property keyWordTableName.
	 *
	 * @param keyWordTableName new value of property keyWordTableName.
	 */
	public void setKeyWordTableName(String keyWordTableName) {
		this.keyWordTableName = keyWordTableName;
	}

	/**
	 * Getter for the property returnDirect.
	 * 
	 * @return The value for the returnDirect.
	 */
	public String getReturnDirect() {
		return returnDirect;
	}

	/**
	 * Setter for property returnDirect.
	 *
	 * @param returnDirect new value of property returnDirect.
	 */
	public void setReturnDirect(String returnDirect) {
		this.returnDirect = returnDirect;
	}

	/**
	 * Getter for the property webSiteShowName.
	 * 
	 * @return The value for the webSiteShowName.
	 */
	public String getWebSiteShowName() {
		return webSiteShowName;
	}

	/**
	 * Setter for property webSiteShowName.
	 *
	 * @param webSiteShowName new value of property webSiteShowName.
	 */
	public void setWebSiteShowName(String webSiteShowName) {
		this.webSiteShowName = webSiteShowName;
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
	 * Getter for the property url.
	 * 
	 * @return The value for the url.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter for property url.
	 *
	 * @param url new value of property url.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Getter for the property desc.
	 * 
	 * @return The value for the desc.
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * Setter for property desc.
	 *
	 * @param desc new value of property desc.
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * Getter for the property levels.
	 * 
	 * @return The value for the levels.
	 */
	public String getLevels() {
		return levels;
	}

	/**
	 * Setter for property levels.
	 *
	 * @param levels new value of property levels.
	 */
	public void setLevels(String levels) {
		this.levels = levels;
	}

	/**
	 * Getter for the property webSiteId.
	 * 
	 * @return The value for the webSiteId.
	 */
	public String getWebSiteId() {
		return webSiteId;
	}

	/**
	 * Setter for property webSiteId.
	 *
	 * @param webSiteId new value of property webSiteId.
	 */
	public void setWebSiteId(String webSiteId) {
		this.webSiteId = webSiteId;
	}

	/**
	 * Getter for the property matched.
	 * 
	 * @return The value for the matched.
	 */
	public String getMatched() {
		return matched;
	}

	/**
	 * Setter for property matched.
	 *
	 * @param matched new value of property matched.
	 */
	public void setMatched(String matched) {
		this.matched = matched;
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
	 * Getter for the property postTableName.
	 * 
	 * @return The value for the postTableName.
	 */
	public String getPostTableName() {
		return postTableName;
	}

	/**
	 * Setter for property postTableName.
	 *
	 * @param postTableName new value of property postTableName.
	 */
	public void setPostTableName(String postTableName) {
		this.postTableName = postTableName;
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
