/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class CookieMake extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        Cookie cookie = new Cookie("username", name);
        cookie.setMaxAge(30 * 60);
        response.addCookie(cookie);
        RequestDispatcher view = request.getRequestDispatcher("ELImplicitObjects/food.jsp");
        view.forward(request, response);
    }
}
