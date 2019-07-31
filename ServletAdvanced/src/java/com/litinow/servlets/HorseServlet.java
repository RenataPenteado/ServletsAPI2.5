/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import com.litinow.utils.Horse;
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
public class HorseServlet extends HttpServlet {
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Horse Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<br>");
        out.println("<h1>Horse Servlet</h1>");
        Horse horse = new Horse("Sugar Foot");
        request.setAttribute("horse", horse);
        out.println("<h3>The Horse name set as attribute on Request is: "+ horse.getName() +"</h3>");
        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
        out.println("</body>");
        out.println("</html>");
    } 
    
}
