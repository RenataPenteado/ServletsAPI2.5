/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.filters;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class SessionTimeoutCookieFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpServletResponse httpResp = (HttpServletResponse) response;
        HttpServletRequest httpReq = (HttpServletRequest) request;
        String path = httpReq.getServletPath();
        if (path.equals("/LoginServlet")
                || path.equals("/LogoutServlet")
                || path.equals("/index.html")) {
            chain.doFilter(request, response);
        } else {
            HttpSession session = httpReq.getSession(false);
            long currTime = System.currentTimeMillis();
            long expiryTime = currTime + session.getMaxInactiveInterval() * 1000;
            Cookie cookie = new Cookie("serverTime", "" + currTime);
            cookie.setPath("/");
            httpResp.addCookie(cookie);
            //if (httpReq.getRemoteUser() != null) {
                cookie = new Cookie("sessionExpiry", "" + expiryTime);
//            } else {
//                cookie = new Cookie("sessionExpiry", "" + currTime);
//            }
            cookie.setPath("/");
            httpResp.addCookie(cookie);
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
    }

    public void init(FilterConfig filterConfig) {
    }
}
