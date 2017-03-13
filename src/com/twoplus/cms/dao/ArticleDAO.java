/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  ArticleDAO.java
 * Purpose:   xxx
 * Classes:   ArticleDAO
 */
package com.twoplus.cms.dao;

import java.util.List;

import com.twoplus.cms.data.webappfunction.WebSiteData;

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

public interface ArticleDAO {
	
	public List<String> getAllArticlesURL(WebSiteData webSite) throws Exception;

}
