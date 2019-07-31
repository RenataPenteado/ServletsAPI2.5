/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class TestInitParams extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("test init parameters<br>");

        java.util.Enumeration e = getServletConfig().getInitParameterNames();
        while(e.hasMoreElements()){
            out.print("<br>param name = " + e.nextElement()+ "<br>");
        }
        out.println("<br>");
        out.println("main email is "+ getServletConfig().getInitParameter("mainEmail"));
        out.println("<br>");
        out.println("admin email is "+ getServletConfig().getInitParameter("adminEmail"));
        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/FirstSimpleServlet\">Calling the index html page</a>");
        
    
    } 

   
}
