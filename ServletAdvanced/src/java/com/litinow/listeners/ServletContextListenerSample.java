/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.listeners;

import com.litinow.utils.CompanyIdentity;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 * @author Administrator
 */
public class ServletContextListenerSample implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        sc.log("The ServletContextListener was estimulated. ServletContext initialized.");

        CompanyIdentity companyIdentity = new CompanyIdentity(
                sc.getInitParameter("name"),
                sc.getInitParameter("address1"),
                sc.getInitParameter("address2"),
                sc.getInitParameter("phone1"),
                sc.getInitParameter("phone2"),
                sc.getInitParameter("cnpj"),
                sc.getInitParameter("city"),
                sc.getInitParameter("county"),
                sc.getInitParameter("country"));
        sc.setAttribute("companyDetails", companyIdentity);
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
