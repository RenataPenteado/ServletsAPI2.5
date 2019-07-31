/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.listeners;

import com.litinow.utils.Dog;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Web application lifecycle listener.
 * @author Administrator
 */
public class ServletContextAttributeListenerSample implements ServletContextAttributeListener {
    static boolean companyDetailsNotLoggedYet = true;

    public void attributeAdded(ServletContextAttributeEvent event) {
        ServletContext sc = event.getServletContext();
        sc.log("The ServletContextAttributeListener was estimulated.");
        sc.log("" +event.getName()+ "");
        if(companyDetailsNotLoggedYet){
            Object obj = sc.getAttribute("companyDetails");
            if ( obj != null ){
                sc.log("One object CompanyDetails was added to ServletContext.");
                companyDetailsNotLoggedYet = false;
            }
        }

        Object obj = sc.getAttribute("dog");
        if ( obj != null ){
            Dog dog = (Dog) obj;
            sc.log("One object Dog called "+dog.getName()+" was added to ServletContext.");
        }
    }

    public void attributeRemoved(ServletContextAttributeEvent event) {
        ServletContext sc = event.getServletContext();
        sc.log("The object Dog called was removed from ServletContext.");
    }

    public void attributeReplaced(ServletContextAttributeEvent event) {
        ServletContext sc = event.getServletContext();
        sc.log("The object Dog called was replaced on ServletContext.");
    }
}
