package com.epam.mjc.stage0;

public class Bird extends Animal {
  Animal bird = new Animal();

    public void birdDescription(){
        System.out.println(bird.getDescription("blue", 2, false));
    }
}
