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

public class MyIteratorTag extends TagSupport {
    String [] movies = new String[] {"Spiderman", "Saved", "Amelie"};
    int movieCounter;


    @Override
    public int doStartTag() throws JspException {
        movieCounter = 0;

        pageContext.setAttribute("movie", movies[movieCounter]);
        movieCounter++;
        return EVAL_BODY_INCLUDE;
    }

    @Override
    public int doAfterBody() throws JspException {
        if (movieCounter < movies.length){
            pageContext.setAttribute("movie", movies[movieCounter]);
            movieCounter++;
            return EVAL_BODY_AGAIN;
        }else
        return SKIP_BODY;
    }

    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
    
    
}
