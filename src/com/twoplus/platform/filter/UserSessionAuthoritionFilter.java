/**
 * Copyright (C) 2016 - 2017 YG Studio. All rights reserved.
 * Filename:  UserSessionAuthoritionFilter.java
 * Purpose:   xxx
 * Classes:   UserSessionAuthoritionFilter
 */
package com.twoplus.platform.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.twoplus.cms.data.webappfunction.UserData;

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

public class UserSessionAuthoritionFilter extends OncePerRequestFilter {
	
	private final String[] notFilter = new String[] {
			// User section
			"/twoplus/cms/user/dologin.do",
			"/twoplus/cms/user/dologout.do"
	};

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		
		if (uri.indexOf("cms") != -1 && uri.endsWith(".do")) {
			
			boolean doFilter = true;
			
			for (String s : notFilter) {
				if (uri.indexOf(s) != -1) {
					doFilter = false;
					
					break;
				}
			}
			
			if (doFilter) {
				UserData user = (UserData)request.getSession().getAttribute("authorisedUser");
				
				if (user == null) {
					response.sendRedirect("/twoplus/");
				}
			}
		}
		
		filterChain.doFilter(request, response);
	}

}
