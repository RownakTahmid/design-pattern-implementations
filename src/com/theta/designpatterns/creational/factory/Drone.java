package com.theta.designpatterns.creational.factory;

/**
 * Implement concrete products for each operation
 */
public class Drone implements Jets{
    @Override
    public void operate() {
        System.out.println("Performing surveillance");;
    }
}
