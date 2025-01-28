package com.theta.designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder("Alex","alex@gmail.com")
                .address("Banani 11")
                .telephone("01601723414")
                .build();
        System.out.println(user.toString());
    }
}
