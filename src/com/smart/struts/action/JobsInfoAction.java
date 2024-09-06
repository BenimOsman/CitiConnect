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

import com.smart.struts.dao.JobsDao;
import com.smart.struts.form.JobsInfoForm;
import com.smart.struts.form.JobsInfosForm;

/** 
 * MyEclipse Struts
 * Creation date: 09-21-2011
 * 
 * XDoclet definition:
 * @struts.action path="/jobsInfo" name="jobsInfoForm" input="/form/jobsInfo.jsp" scope="request" validate="true"
 */
public class JobsInfoAction extends Action {
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
		JobsInfosForm ab = (JobsInfosForm) form;// TODO Auto-generated method stub
		JobsDao sd=new JobsDao();
	    boolean flag=sd.jobs_info(ab);
		if(flag)
			return mapping.findForward("success");
		else
			return mapping.findForward("failure");
		}
	}
