/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import com.litinow.listeners.utils.Dog;
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
public class ListenerTester extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("test context attributes set by listener<br>");
        out.println("<br>");

        Dog dog = (Dog) getServletContext().getAttribute("dog");
        out.println("<br>");

        out.println("Dog's breed is: " + dog.getBreed());

    } 

}