package com.theta.designpatterns.creational.factory;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("1.Fighter \n2.Bomber \nDrone");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            JetFactory myJet = new JetFactoryImpl();
            Jets inAction = myJet.createJets(choice);
            inAction.operate();
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            input.close();
        }
    }
}
