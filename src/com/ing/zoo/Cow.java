package com.ing.zoo;

import com.ing.zoo.interfaces.Herbivore;

public class Cow implements Herbivore {

    public String name;
    public String helloText;
    public String eatText;
    @Override
    public void sayHello() {
        helloText = "Mooooooowwww";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "hmmmm me likey ";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {

    }
}
