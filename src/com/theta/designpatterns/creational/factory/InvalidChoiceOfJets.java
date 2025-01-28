package com.theta.designpatterns.creational.factory;

public class InvalidChoiceOfJets extends RuntimeException{
    static String message = "please choose a valid choice";
    public String getMessage() {
        return message;
    }
}
