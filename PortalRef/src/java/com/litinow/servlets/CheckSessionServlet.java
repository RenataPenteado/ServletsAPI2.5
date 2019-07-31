/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class CheckSessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        long diff = session.getLastAccessedTime() - session.getCreationTime();
        long diffSeconds = diff / 1000;
        if( session.getMaxInactiveInterval() > diffSeconds ){
            response.setHeader("SessionCurrentTime", String.valueOf(diffSeconds));
        } else {
            response.setHeader("SessionCurrentTime", "expirated");
        }        
    } 

}
