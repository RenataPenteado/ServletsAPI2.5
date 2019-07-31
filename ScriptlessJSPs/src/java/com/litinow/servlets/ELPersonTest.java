/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import com.litinow.utils.Dog;
import com.litinow.utils.Person;
import com.litinow.utils.Toy;
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
public class ELPersonTest extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        Person p = new Person();
        p.setName("Leelu");

        Dog d = new Dog();
        d.setName("Clyde");

        Toy t1 = new Toy();
        t1.setName("stick");

        Toy t2 = new Toy();
        t2.setName("neighbor's cat");

        Toy t3 = new Toy();
        t3.setName("Barbie doll head");

        d.setToys(new Toy[]{t1, t2, t3});

        p.setDog(d);

        request.setAttribute("person", p);
        RequestDispatcher view = request.getRequestDispatcher("ELNestedExpressions/person.jsp");
        view.forward(request, response);
    }
}
