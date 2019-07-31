/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import com.litinow.utils.Dog;
import com.litinow.utils.Person;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class OpenSessionServlet extends HttpServlet {
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

//        HttpSession session = request.getSession();
//
//        Person personSample1 = new Person();
//        personSample1.setName(request.getParameter("name"));
//        personSample1.setAddress(request.getParameter("address"));
//        personSample1.setPhone(request.getParameter("phone"));
//
//        session.setAttribute("personSample1", personSample1);

        Dog madona = new Dog();
        madona.setName("Madona");
        request.setAttribute("dog", madona);

        RequestDispatcher rd = request.getRequestDispatcher("useBeanSample1/useBeanSample1.jsp");
        rd.forward(request, response);

    }

}
