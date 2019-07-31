/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class ServletConfigSample extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        ServletConfig servletConfig = getServletConfig();
        String email = servletConfig.getInitParameter("email");
//        ServletContext servletContext = getServletContext();
//        String applspec = servletContext.getInitParameter("applspec");


        PrintWriter out = response.getWriter();
        out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletConfigSample</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br>");
            out.println("<h1>ServletConfig Sample</h1>");
            out.println("<h3>Your email set on D.D. is: " +email+ "</h3>");
            out.println("<br>");
            out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
            out.println("</body>");
            out.println("</html>");
    } 

}
