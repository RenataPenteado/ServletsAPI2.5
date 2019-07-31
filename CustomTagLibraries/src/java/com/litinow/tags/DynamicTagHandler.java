/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.tags;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Administrator
 */
public class DynamicTagHandler extends SimpleTagSupport implements DynamicAttributes {

    @Override
    public void doTag() throws JspException, IOException {
        PageContext pagecontext = (PageContext)getJspContext();
        JspWriter out = pagecontext.getOut();

        out.print("<table  border=\"1\">");
        for( String attrName : tagAttrs.keySet()){
            out.print("<tr><td>"+attrName+"</td><td>"+tagAttrs.get(attrName)+"</td></tr>");
        }
        out.print("</table>");
    }

    public void setDynamicAttribute(String uri, String name, Object value) throws JspException {
        tagAttrs.put(name, value);
    }

    private Map<String,Object> tagAttrs = new TreeMap<String,Object>();

}
