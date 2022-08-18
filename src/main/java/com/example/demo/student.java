package com.example.demo;

import java.util.List;

public class student {
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;
    public student(){
        id=239458559;
        name="Mike Kraft";
        add=new Address();
        ph=List.of(new Phone());
    }
    public void printInfo(){
        System.out.println(id +" "+name+","+ph.get(0).getMob()+","+add);
    }
}

