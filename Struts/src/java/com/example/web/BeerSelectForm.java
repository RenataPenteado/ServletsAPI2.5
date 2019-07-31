/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Administrator
 */
public class BeerSelectForm extends org.apache.struts.action.ActionForm {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private static final String VALID_COLORS = "amber,dark,light";
   
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (VALID_COLORS.indexOf(color) == -1) {
            errors.add("color", new ActionMessage("error.colorField.notValid"));
        }
        return errors;
    }
}
