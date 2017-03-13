/**
 * Copyright (C) 2016 GYG. All rights reserved.
 * Filename:  ParameterRequestWrapper.java
 * Purpose:   xxx
 * Classes:   ParameterRequestWrapper
 */
package com.twoplus.platform.filter;

import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

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
public class ParameterRequestWrapper extends HttpServletRequestWrapper {

	/** Represents the params field */
	private Map<String, String[]> params;  
	  
    public ParameterRequestWrapper(HttpServletRequest request, Map<String, String[]> newParams) {  
        super(request);  
          
        this.params = newParams;  
    }  
  
    @Override  
    public String getParameter(String name) {  
        String result = "";  
          
        Object v = params.get(name);  
        if (v == null) {  
            result = null;  
        } else if (v instanceof String[]) {  
            String[] strArr = (String[]) v;  
            if (strArr.length > 0) {  
                result =  strArr[0];  
            } else {  
                result = null;  
            }  
        } else if (v instanceof String) {  
            result = (String) v;  
        } else {  
            result =  v.toString();  
        }  
          
        return result;  
    }  
    
	@Override  
    public Map getParameterMap() {  
        return params;  
    }  
  
    @Override  
    public Enumeration getParameterNames() {  
        return new Vector(params.keySet()).elements();  
    }  
  
    @Override  
    public String[] getParameterValues(String name) {  
        String[] result = null;  
          
        Object v = params.get(name);  
        if (v == null) {  
            result =  null;  
        } else if (v instanceof String[]) {  
            result =  (String[]) v;  
        } else if (v instanceof String) {  
            result =  new String[] { (String) v };  
        } else {  
            result =  new String[] { v.toString() };  
        }  
          
        return result;  
    }

}
