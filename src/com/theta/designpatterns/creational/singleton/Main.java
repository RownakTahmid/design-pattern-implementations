package com.theta.designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Clipboard c1 = Clipboard.getInstance();
        Clipboard c2 = Clipboard.getInstance();
        c1.copy("Hello ");
        c2.copy("World");
        System.out.println(c1.paste());
        System.out.println(c2.paste());
        System.out.println("\n1. Addition(+)\n2. Subtraction(-)\n3. Multiplication(*)\n4. Division(/)");
    }
}