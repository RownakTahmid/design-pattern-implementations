package com.theta.designpatterns.creational.factory;
/**
 * Create a com.theta.designpatterns.creational.factory class (OperationFactory)
 * with a method (getInstance) to create objects based on some parameter.
 */
public interface JetFactory {
    Jets createJets(int choice);
}
