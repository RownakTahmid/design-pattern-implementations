package com.theta.designpatterns.creational.factory;

/**
 * Create a com.theta.designpatterns.creational.factory class (OperationFactory)
 * with a method (getInstance) to create objects based on some parameter.
 */
public class JetFactoryImpl implements JetFactory {
    @Override
    public Jets createJets(int x) {
        return switch (x) {
            case 1 -> new Fighter();
            case 2 -> new Bomber();
            case 3 -> new Drone();
            default -> throw new InvalidChoiceOfJets();
        };
    }
}
