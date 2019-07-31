/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.utils;

/**
 *
 * @author Administrator
 */
public class Person {
    private String name;
    private String address;
    private String phone;
    private Dog dog;

    public Person() {
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }


}
