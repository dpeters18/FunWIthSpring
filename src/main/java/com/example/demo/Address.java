package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;
    private String state;
    private String country;
    private String zipcode;
    @Autowired
    public Address(){
        this.city="Kalamazoo";
        this.state="MI";
        this.country="USA";
        this.zipcode="49006";
    }
    public Address(String city,String state,String country,String zipcode){
        this.city=city;
        this.state=state;
        this.country=country;
        this.zipcode=zipcode;
    }

    public String toString(){
        return city+","+state+","+country+" "+zipcode;
    }
}
