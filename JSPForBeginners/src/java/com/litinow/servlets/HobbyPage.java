/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class HobbyPage extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Melchor");
        nameList.add("Gazpar");
        nameList.add("Baltazar");
        request.setAttribute("names", nameList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Hobbies/YourHobby.jsp");
        dispatcher.forward(request, response);

    }
}
