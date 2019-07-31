/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.listeners;

import com.litinow.utils.Rabbit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Web application lifecycle listener.
 * @author Administrator
 */
public class ServletRequestListenerSample implements ServletRequestListener {

    public void requestInitialized(ServletRequestEvent sre) {
        ServletContext sc = sre.getServletContext();
//        sc.log("====== ServletRequestListenerSample Initialized method Executed ==== ");
//        sc.log("The client browser's encode: "+ ((HttpServletRequest)sre.getServletRequest()).getHeaders("accept-language").nextElement().toString() );
//        sc.log("The client browser's is: "+ ((HttpServletRequest)sre.getServletRequest()).getHeaders("user-agent").nextElement().toString() );
        
        if(((HttpServletRequest)sre.getServletRequest()).getServletPath().equals("/RabbitServlet")){
            sc.log("====== ServletRequestListenerSample Initialized method Executed ==== ");
            sc.log("ContextPath identified: "+ ((HttpServletRequest)sre.getServletRequest()).getServletPath());
            Rabbit rabbit = new Rabbit("Bugs Bunny");
            sc.log("Rabbit created: "+rabbit.getName());
            sre.getServletRequest().setAttribute("rabbit", rabbit);
        }
    }

    public void requestDestroyed(ServletRequestEvent sre) {
        ServletContext sc = sre.getServletContext();
        if(((HttpServletRequest)sre.getServletRequest()).getServletPath().equals("/RabbitServlet")){
            sc.log("====== ServletRequestListenerSample Destroyed method Executed ==== ");
        }
    }

}
