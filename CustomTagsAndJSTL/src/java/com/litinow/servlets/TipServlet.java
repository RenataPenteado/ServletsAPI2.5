/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import com.litinow.utils.Tip;
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
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Tip t = new Tip();

        request.setAttribute("pageContent", t);
        RequestDispatcher rd = request.getRequestDispatcher("TipOfTheDay/TipByDay.jsp");
        rd.forward(request, response);
    }
}
