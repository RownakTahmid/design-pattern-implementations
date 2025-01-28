package com.theta.designpatterns.creational.singleton;

public class Clipboard {
    private String text;
    private static Clipboard clipboard = null;
    private Clipboard() {
        }

    public static Clipboard getInstance() {
        if(clipboard == null){
            clipboard = new Clipboard();
        }
        return clipboard;
    }
    public void copy(String text) {
        this.text = text;
    }
    public String paste(){
        return text;
    }
}
