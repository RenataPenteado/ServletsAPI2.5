/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.servlets;

//import java.awt.Color;
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
public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Integer rand = (int) ((Math.random() * 4) + 1);

//        int red = (int) (Math.random() * 256);
//        int green = (int) (Math.random() * 256);
//        int blue = (int) (Math.random() * 256);
//        Color color = new Color(red, green, blue);

        //Color color = new Color((int) (Math.random() * 0x1000000));

        try {
            //TODO output your page here

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloRandonPerson</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Randon Color</h1>");
            //out.println("<div style= \"background-color:rgb(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "); width:120px; height:120px; margin:5px; border:1px solid rgba(0, 0, 0, .2);\">");
            out.println("<div style= \"background-color:rgb(" + ((int) (Math.random() * 256)) + "," + ((int) (Math.random() * 256)) + "," + ((int) (Math.random() * 256)) + "); width:120px; height:120px; margin:5px; border:1px solid rgba(0, 0, 0, .2);\">");
            out.println("</div>");
            out.println("<br>");
            out.println("<hr>");
            out.println("<br>");
            switch (rand) {
                case 1:
                    out.println("<div style= \"background-color:black; width:120px; height:120px; margin:5px; border:1px solid rgba(0, 0, 0, .2);\">");
                    break;
                case 2:
                    out.println("<div style= \"background-color:red;  width:120px; height:120px; margin:5px; border:1px solid rgba(0, 0, 0, .2);\">");
                    break;
                case 3:
                    out.println("<div style= \"background-color:blue;  width:120px; height:120px; margin:5px; border:1px solid rgba(0, 0, 0, .2);\">");
                    break;
                case 4:
                    out.println("<div style= \"background-color:orange; width:120px; height:120px; margin:5px; border:1px solid rgba(0, 0, 0, .2);\">");
                    break;
            }
            out.println("</div>");
            out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }
    }
}
