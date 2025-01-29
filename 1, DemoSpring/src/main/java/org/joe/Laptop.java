package org.joe;

public class Laptop implements Computer {
    Laptop(){
        System.out.println("Laptop is here");

    }
    @Override
    public void compile(){
        System.out.println("This is Laptop ?!");
    }
}
