/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class ServletContextSample extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        String litinowMsg = servletContext.getInitParameter("litinowMsg");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ServletContextSample</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<br>");
        out.println("<h1>ServletContext Sample</h1>");
        out.println("<br>");
        out.println("<h3>Your litinow message set on D.D. is: " + litinowMsg + "</h3>");
        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
        out.println("</body>");
        out.println("</html>");
    }

}
