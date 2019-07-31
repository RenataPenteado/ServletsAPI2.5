/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import com.litinow.utils.Dog;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class DogServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext sc = getServletContext();
        PrintWriter out = response.getWriter();

        String actionValue = request.getParameter("action");
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Dog Servlet</h1>");
        out.println("<br>");
        out.println("<h3>The action chosen was: "+ actionValue +" the Dog</h3>");

        if(actionValue.equals("add")){
            Object obj = sc.getAttribute("dog");
            if (obj == null){
                out.println("<h5>The Dog does not exist yet on ServletContext</h5>");
                Dog dog = new Dog("Madona");
                sc.setAttribute("dog", dog);
                out.println("<h5>One Dog was added. Dog name: "+ dog.getName() +"</h5>");
            }else{
                out.println("<h5>The Dog already exist on ServletContext</h5>");
                Dog dog = (Dog) sc.getAttribute("dog");
                out.println("<h5>Its name is: "+ dog.getName() +"</h5>");
            }
        }else if(actionValue.equals("remove")){
            sc.setAttribute("dog", null);
            out.println("<h5>The Dog remotion was performed.</h5>");
        }else if(actionValue.equals("replace")){
            Object obj = sc.getAttribute("dog");
            if (obj == null){
                out.println("<h5>The Dog does not exist yet on ServletContext</h5>");
                Dog dog = new Dog("Boris");
                sc.setAttribute("dog", dog);
                out.println("<h5>One Dog was added. Dog name: "+ dog.getName() +"</h5>");
            }else{
                out.println("<h5>The Dog already exist on ServletContext</h5>");
                Dog scDog = (Dog) sc.getAttribute("dog");
                if(scDog.getName().equals("Madona")){
                    Dog dog = new Dog("Boris");
                    sc.setAttribute("dog", dog);
                    out.println("<h5>One Dog was replaced. Dog name: "+ dog.getName() +"</h5>");
                }else if(scDog.getName().equals("Boris")){
                    Dog dog = new Dog("Madona");
                    sc.setAttribute("dog", dog);
                    out.println("<h5>One Dog was replaced. Dog name: "+ dog.getName() +"</h5>");
                }
            }
        }

        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
