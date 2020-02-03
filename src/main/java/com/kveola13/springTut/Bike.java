package com.kveola13.springTut;

import org.springframework.stereotype.Component;

@Component
public class Bike extends Vehicle {
    public void drive(){
        System.out.println("You are riding");
    }
}
