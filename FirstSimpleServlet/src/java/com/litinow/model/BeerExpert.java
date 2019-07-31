/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.litinow.model;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class BeerExpert {

    public List getBrands(String color) {
        List brands = new ArrayList();

        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Red Ale");
            brands.add("13");
        } else if (color.equals("brown")){
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
            brands.add("Antartica");
            brands.add("Hoengarden");
        } else if (color.equals("dark")){
            brands.add("Guinnes");
            brands.add("Colorado");
            brands.add("Exelsior");
            brands.add("Franciscaner");
        } else { // light
            brands.add("Kaiser");
            brands.add("Bavaria");
            brands.add("Sub-zero");
            brands.add("Conti Zero");
        }
        return brands;
    }
}
