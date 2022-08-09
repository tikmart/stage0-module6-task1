package com.epam.mjc.stage0;



public class Dog extends Animal {



    public Dog() {
        super("brown",4,true);
        System.out.println(getDescription());
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getDescription();
    }



}
