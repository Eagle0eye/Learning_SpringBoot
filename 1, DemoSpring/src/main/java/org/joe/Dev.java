package org.joe;

import org.springframework.stereotype.Component;

public class Dev {

    private  Computer computer;

    public Dev(Computer computer) {
        this.computer = computer;
        System.out.println("Constructor Laptop");
    }



    Dev(){
        System.out.println("Dev Class");
    }
    Dev(int age){
        System.out.println("Dev Class"+age);
    }
    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void build() {
        computer.compile();
        System.out.println("Dev is running");
    }
}
