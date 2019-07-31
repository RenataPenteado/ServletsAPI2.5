/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.servlets;

import com.litinow.utils.CompanyIdentity;
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
public class CompanyIdentityServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        ServletContext sc = getServletContext();
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>First Example</h1>");
        out.println("<h3>Name: "+sc.getInitParameter("name")+"</h3>");
        out.println("<h3>Address1: "+sc.getInitParameter("address1")+"</h3>");
        out.println("<h3>Address2: "+sc.getInitParameter("address2")+"</h3>");
        out.println("<h3>Phone1: "+sc.getInitParameter("phone1")+"</h3>");
        out.println("<h3>Phone2: "+sc.getInitParameter("phone2")+"</h3>");
        out.println("<h3>CNPJ: "+sc.getInitParameter("cnpj")+"</h3>");
        out.println("<h3>City: "+sc.getInitParameter("city")+"</h3>");
        out.println("<h3>County: "+sc.getInitParameter("county")+"</h3>");
        out.println("<h3>Country: "+sc.getInitParameter("country")+"</h3>");
        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");

        CompanyIdentity companyIdentity = (CompanyIdentity)
                sc.getAttribute("companyDetails");

        out.println("<hr>");
        out.println("<h1>Secound Example</h1>");
        out.println("<h3>Name: "+companyIdentity.getName()+"</h3>");
        out.println("<h3>Address1: "+companyIdentity.getAddress1()+"</h3>");
        out.println("<h3>Address2: "+companyIdentity.getAddress2()+"</h3>");
        out.println("<h3>Phone1: "+companyIdentity.getPhone1()+"</h3>");
        out.println("<h3>Phone2: "+companyIdentity.getPhone2()+"</h3>");
        out.println("<h3>CNPJ: "+companyIdentity.getCnpj()+"</h3>");
        out.println("<h3>City: "+companyIdentity.getCity()+"</h3>");
        out.println("<h3>County: "+companyIdentity.getCounty()+"</h3>");
        out.println("<h3>Country: "+companyIdentity.getCountry()+"</h3>");
        out.println("<br>");
        out.println("<a href=\"http://localhost:8084/ServletAdvanced\">Calling the index html page</a>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    } 

}
