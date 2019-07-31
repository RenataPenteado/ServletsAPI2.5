/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.tags;

import java.io.IOException;
import java.util.List;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Administrator
 */
public class SelectTagHandler extends SimpleTagSupport {

    private List optionsList;
    private String name;
    private String size;

    public void setOptionsList(List value) {
        this.optionsList = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setSize(String value) {
        this.size = value;
    }
    @Override
    public void doTag() throws JspException, IOException {
        PageContext pagecontext = (PageContext)getJspContext();
        JspWriter out = pagecontext.getOut();

        out.print("<select ");
//        out.print(String.format(ATTR_TEMPLATE,"name", this.name));
//        out.print(String.format(ATTR_TEMPLATE,"size", this.size));

        out.print("name='" + this.name + "' ");
        out.print("size='" + this.size + "'");

        out.println(">");

        for (Object option: this.optionsList){
//            String optionTag = String.format(OPTION_TEMPLATE, option.toString());
            String optionTag = " <option value = '" + option.toString() + "'> " +option.toString()+ "</option>";
            out.println(optionTag);
        }

        out.println("</select>");
       
    }
    private static final String ATTR_TEMPLATE = "%s='%s'";
    private static final String OPTION_TEMPLATE = " <option value = '%1$s'> %1$s </option>";
}
