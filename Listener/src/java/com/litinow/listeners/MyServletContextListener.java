/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.listeners;

import com.litinow.listeners.utils.Dog;
import javax.servlet.*;


/**
 *
 * @author Administrator
 */
public class MyServletContextListener implements ServletContextListener{
 
    public void contextInitialized(ServletContextEvent event) {

        ServletContext sc = event.getServletContext();
        String dogBreed = sc.getInitParameter("breed");
        Dog d = new Dog(dogBreed);
        sc.setAttribute("dog", d);
    }

    public void contextDestroyed(ServletContextEvent sce) {
       
    }

}
