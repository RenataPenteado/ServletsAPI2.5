/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.tags;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Administrator
 */
public class Menu extends TagSupport {
    private ArrayList items;
    
    void addMenuItem(String itemValue) {
        items.add(itemValue);
    }

    @Override
    public int doStartTag() throws JspException {
        items = new ArrayList();
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doEndTag() throws JspException {
        try {
            pageContext.getOut().println("Menu items are: " + items);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return EVAL_PAGE;
    }

}
