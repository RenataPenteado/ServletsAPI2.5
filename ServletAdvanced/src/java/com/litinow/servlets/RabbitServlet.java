/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import com.litinow.utils.Rabbit;
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
public class RabbitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Rabbit Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<br>");
        out.println("<h1>Rabbit Servlet</h1>");
        Rabbit rabbit = (Rabbit) request.getAttribute("rabbit");
        out.println("<h3>The Rabbit name set as attribute on Request is: "+ rabbit.getName() +"</h3>");
        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
