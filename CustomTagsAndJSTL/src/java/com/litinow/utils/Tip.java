/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.utils;

/**
 *
 * @author Administrator
 */
public class Tip {

    String[] Tips = {
        "<h1></h1> tags for the main header of your webpage",
        "<b></b> tags make things bold",
        "<a></a> tags for hyperlink", 
        "<em></em> tags for emphasized text"
    };
    String currentTip = "Hola";

    public Tip() {
       int index = (int) Math.round(Math.random() * 3);
        currentTip = Tips[index];
    }


    public String getCurrentTip() {        
        return currentTip;
    }
}

