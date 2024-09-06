/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.smartcity.struts.action;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.smart.struts.dao.StateInfoDao;
import com.smartcity.struts.form.AddState1InfoForm;
import com.smartcity.struts.form.StateForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-16-2011
 * 
 * XDoclet definition:
 * @struts.action path="/addState1Info" name="addState1InfoForm" input="/form/addState1Info.jsp" scope="request" validate="true"
 * @struts.action-forward name="success" path="/state_info.jsp"
 * @struts.action-forward name="failure" path="/state_info.jsp"
 */
public class AddState1InfoAction extends Action {
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
		StateForm add = (StateForm) form;
		StateInfoDao sd=new StateInfoDao();
	    boolean flag=sd.state_info(add);
		if(flag)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		}
	
}