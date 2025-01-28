package com.theta.designpatterns.creational.factory;
/**
 * Implement concrete products for each operation
 */
public class Fighter implements Jets{
    @Override
    public void operate() {
        System.out.println("Dog fight");
    }
}

