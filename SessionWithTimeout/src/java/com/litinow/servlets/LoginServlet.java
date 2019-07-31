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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpServletResponse httpResp = (HttpServletResponse) response;
        HttpServletRequest httpReq = (HttpServletRequest) request;

        HttpSession session = httpReq.getSession(false);
        if(session == null){
            session = httpReq.getSession(true);
        }
        long currTime = System.currentTimeMillis();
        long expiryTime = currTime + session.getMaxInactiveInterval() * 1000;
        Cookie cookie = new Cookie("serverTime", "" + currTime);
        cookie.setPath("/");
        httpResp.addCookie(cookie);
        cookie = new Cookie("sessionExpiry", "" + expiryTime);

        cookie.setPath("/");
        httpResp.addCookie(cookie);

        session.setAttribute("uname", request.getParameter("uname"));

        RequestDispatcher view = request.getRequestDispatcher("session.jsp");
        view.forward(request, response);
    }
}
