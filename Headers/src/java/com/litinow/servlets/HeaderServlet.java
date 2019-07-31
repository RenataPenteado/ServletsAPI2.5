/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class HeaderServlet extends HttpServlet {
   
    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String operation = request.getHeader("operation");

        if( operation.equals("SOMA")){
            String op1 = request.getParameter("op1");
        }else if( operation.equals("SUBTRACAO")){
            // subtracao
        }else{
//            throw new ServletException();
        }
        
//        PrintWriter out = response.getWriter();
//        out.print(operation);

        response.setHeader("status", "TUDO CERTO");
        response.setHeader("vegetable", "CHUCHU");

    } 

    
}
