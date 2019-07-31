/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.custom.tag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Administrator
 */
public class AdvisorTagHandler extends SimpleTagSupport {
    private String user;
    private String identity;

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().write("Hello " + user + " <br>");
        getJspContext().getOut().write("Your identity is " + identity + " <br>");
        getJspContext().getOut().write("Your advice is: " + getAdvice());
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
    

    String getAdvice() {
        String[] adviceStrings = {
            "That color’s not working for you.",
            "You should call in sick.",
            "You might want to rethink that haircut."};
        int random = (int) (Math.random() * adviceStrings.length);
        return adviceStrings[random];
    }
}
