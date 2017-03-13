/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  WebSiteNginxLogData.java
 * Purpose:   xxx
 * Classes:   WebSiteNginxLogData
 */
package com.twoplus.cms.data.webappfunction;

import com.twoplus.espider.constant.Constants;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer			Date			  	 Change Reason		  Change
 * ----------------     ----------------     ----------------     ---------------
 * Gavin.Zhang			Oct 24, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GYG
 *
 * @version 01.00.00
 *
 */

public class WebSiteNginxLogData {
	
	/** Represents the webSiteShowName field */
	private String webSiteShowName;
	
	/**
	* Creates a new WebSiteNginxLogData object.
	*/
	public WebSiteNginxLogData() {
		webSiteShowName = Constants.EMPTY_STRING;
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

}
