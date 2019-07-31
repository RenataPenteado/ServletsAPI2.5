/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import com.litinow.utils3.Person;
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
public class PersonTest extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String name = request.getParameter("username");
        request.setAttribute("name", name);

        Person p = new Person();
        p.setName(name);
        request.setAttribute("person", p);
        RequestDispatcher view = request.getRequestDispatcher("Person/personresult.jsp");
        view.forward(request, response);
        
    }
}
