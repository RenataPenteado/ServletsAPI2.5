/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.litinow.utils;

/**
 *
 * @author Administrator
 */
public class CompanyIdentity {
    private String name;
    private String address1;
    private String address2;
    private String phone1;
    private String phone2;
    private String cnpj;
    private String city;
    private String county;
    private String country;

    public CompanyIdentity(String name, String address1, String address2, String phone1, String phone2, String cnpj, String city, String county, String country) {
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.cnpj = cnpj;
        this.city = city;
        this.county = county;
        this.country = country;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCountry() {
        return country;
    }

    public String getCounty() {
        return county;
    }

    public String getName() {
        return name;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

}
