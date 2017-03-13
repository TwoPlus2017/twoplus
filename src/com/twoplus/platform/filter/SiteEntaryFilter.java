/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  NicheSiteEntaryFilter.java
 * Purpose:   xxx
 * Classes:   NicheSiteEntaryFilter
 */
package com.twoplus.platform.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * This is used for xxx <BR>
 *
 * <PRE>
 *
 * <B>History:</B>
 * Developer			Date			  	 Change Reason		  Change
 * ----------------     ----------------     ----------------     ---------------
 * Gavin.Zhang			Sep 18, 2016         Initial version      0.1
 *
 * </PRE>
 *
 * @author Gavin.Zhang - GYG
 *
 * @version 01.00.00
 *
 */

public class SiteEntaryFilter extends OncePerRequestFilter {
	
	/** Represents the charter field */
	private String charter = null;
	
	/** Represents the forwardPath field */
	private String forwardPath = null;

	/**
	 * @param charter the charter to set
	 */
	public void setCharter(String charter) {
		this.charter = charter;
	}

	/**
	 * @param forwardPath the forwardPath to set
	 */
	public void setForwardPath(String forwardPath) {
		this.forwardPath = forwardPath;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		
		/*String webSiteShowName = request.getParameter("webSite");
		String returnDirect = Constants.NO;
		
		Map<String,String[]> map = new HashMap<String,String[]>(request.getParameterMap());
		
		map.put("webSiteShowName", new String[]{webSiteShowName});
		//map.put("webSiteUrl", new String[]{Constants.DOMAIN_PREFIX_NAME + webSiteName + Constants.DOMAIN_SUFFIX_NAME});
		//map.put("returnPage", new String[]{CMSConstants.PAGE_NICHE_404});
		map.put("returnPage", new String[]{webSiteShowName + Constants.SLASH + CMSConstants.NICHE_LANDING_PAGE_404});
		map.put("returnDirect", new String[]{returnDirect});
		
		request = new ParameterRequestWrapper(request, map);
		
		filterChain.doFilter(request, response);*/
		
	}
}
