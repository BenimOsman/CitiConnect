/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.smart.struts.action;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.smart.struts.dao.CityHistory;
import com.smart.struts.form.CityHistoryForm;

/** 
 * MyEclipse Struts
 * Creation date: 09-23-2011
 * 
 * XDoclet definition:
 * @struts.action path="/cityHistory" name="cityHistoryForm" input="/form/cityHistory.jsp" scope="request" validate="true"
 */
public class CityHistoryAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, SQLException {
		com.smartcity.struts.form.CityHistoryForm ch= (com.smartcity.struts.form.CityHistoryForm) form;// TODO Auto-generated method stub
		boolean flag=new CityHistory().city_info(ch);
		
	   
		if(flag)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
	
		
	}
}