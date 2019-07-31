/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class TestEl extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        java.util.ArrayList nums = new java.util.ArrayList();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        request.setAttribute("number", nums);

        String[] favoriteMusic = {"Zero 7", "Tahiti 80", "BT", "Frou frou"};
        request.setAttribute("musicList", favoriteMusic);
        RequestDispatcher view = request.getRequestDispatcher("TestEl/musicEl.jsp");
        view.forward(request, response);

    }
}
