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
public class TipServlet extends HttpServlet {
   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        request.setAttribute("Tip1", "<b></b>Tags make things bold");
        request.setAttribute("Tip2", "&ltb&gt &lt/b&gt Tags make things bold");

        RequestDispatcher rd = request.getRequestDispatcher("TipServlet/tipServlet.jsp");
        rd.forward(request, response);

    } 


}
