/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
package com.litinow.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Administrator
 */

public class MenuItem extends TagSupport {
    private String itemValue;

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    @Override
    public int doStartTag() throws JspException {

        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        Menu menu = (Menu) getParent();
        menu.addMenuItem(itemValue);
        return EVAL_PAGE;
    }
       
}
