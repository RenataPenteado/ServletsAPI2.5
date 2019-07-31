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
public class OperatorsTest extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        list.add("true");
        list.add("false");
        list.add("2");
        list.add("10");
        request.setAttribute("bar", list);
        RequestDispatcher view = request.getRequestDispatcher("ELNull/operators.jsp");
        view.forward(request, response);
    }
}
