package org.joe;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling on Desktop");
    }
}
