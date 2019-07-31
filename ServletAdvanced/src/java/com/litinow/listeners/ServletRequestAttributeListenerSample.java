/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.listeners;

import com.litinow.utils.Horse;
import com.litinow.utils.Rabbit;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Web application lifecycle listener.
 * @author Administrator
 */
public class ServletRequestAttributeListenerSample implements ServletRequestAttributeListener {

    public void attributeAdded(ServletRequestAttributeEvent srae) {
        ServletContext sc = srae.getServletContext();

        if (((HttpServletRequest)srae.getServletRequest()).getServletPath().equals("/RabbitServlet")){
            Object obj =  srae.getServletRequest().getAttribute("rabbit");
            if(obj != null){
                Rabbit rabbit = (Rabbit) obj;
                sc.log("The Rabbit is: "+ rabbit.getName());
            }
        }else if(((HttpServletRequest)srae.getServletRequest()).getServletPath().equals("/HorseServlet")){
            Object obj =  srae.getServletRequest().getAttribute("horse");
            if(obj != null){
                Horse horse = (Horse) obj;
                sc.log("The Horse is: " + horse.getName());
            }
        }       
    }

    public void attributeRemoved(ServletRequestAttributeEvent srae) {

    }

    public void attributeReplaced(ServletRequestAttributeEvent srae) {

    }
}
