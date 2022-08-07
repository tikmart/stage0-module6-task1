package com.epam.mjc.stage0;

public class Bird extends Animal {
  Animal bird = new Animal();

    @Override
    public String getDescription(String color, int numberOfPaws, boolean hasFur) {
        super.getDescription("blue", 2, false);
        String description;
        return description = "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
