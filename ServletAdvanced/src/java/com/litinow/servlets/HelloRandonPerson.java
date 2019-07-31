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
public class HelloRandonPerson extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Integer rand = (int)((Math.random()*4)+1);

        try {
            //TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloRandonPerson</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello Randon Person</h1>");
            switch(rand){
                case 1:
                   out.println("<h4>Hello Mauricio</h4>");
                   break;
                case 2:
                    out.println("<h4>Hello Renata</h4>");
                   break;
                case 3:
                   out.println("<h4>Hello Joao</h4>");
                   break;
                case 4:
                    out.println("<h4>Hello Maria</h4>");
                   break;
            }
            out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }

    }

}
