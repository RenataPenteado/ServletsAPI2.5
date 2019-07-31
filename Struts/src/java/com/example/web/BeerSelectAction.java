/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.web;

import com.example.model.BeerExpert;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Administrator
 */
public class BeerSelectAction extends org.apache.struts.action.Action {
    
    private static final String SHOW_RESULTS = "show_results";
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        BeerSelectForm myForm = (BeerSelectForm) form;
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(myForm.getColor());

        request.setAttribute("styles", result);
        
        return mapping.findForward(SHOW_RESULTS);
    }
}
