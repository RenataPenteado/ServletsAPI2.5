/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import com.litinow.model.BeerExpert;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
/**
 *
 * @author Administrator
 */
public class BeerSelect extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       
        
        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        out.print("Beer Selection Advice<br>");

//        Iterator it = result.iterator();
//        while(it.hasNext()){
//           out.print("<br>try: "+ it.next());
//    }
          request.setAttribute("styles", result);

          RequestDispatcher view = request.getRequestDispatcher("result.jsp");
          view.forward(request, response);
      
//        out.print("<br><br>");
//        out.println("<a href=\"http://localhost:8084/FirstSimpleServlet/form.html\">Calling the form html page</a>");
     }

}
