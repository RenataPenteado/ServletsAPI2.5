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

/**
 *
 * @author Administrator
 */
public class CustomTagServlet extends HttpServlet {
   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        request.setAttribute("userName", name);
        RequestDispatcher rd = request.getRequestDispatcher("CustomTag/CustomTag.jsp");
        rd.forward(request, response);
    }

}
