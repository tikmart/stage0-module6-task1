package com.epam.mjc.stage0;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Dog extends Animal {


    Animal dog = new Animal();

    public void dogDescription(){

        System.out.println(dog.getDescription("brown", 4,true));
        System.out.println(dog.getDescription("red", 1,true));
    }

}
