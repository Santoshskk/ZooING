package com.ing.zoo;

import com.ing.zoo.interfaces.Carnivore;

import java.util.Random;

public class Wolf implements Carnivore {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;
    @Override
    public void sayHello() {
        helloText = "hooooowwwwll";
        System.out.println(helloText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "starts howling";
        }
        else
        {
            trick = "stands on 2 legs";
        }
        System.out.println(trick);
    }

    @Override
    public void eatMeat() {
        eatText = "yummyyy Rikki-Tikki-Tavi";
        System.out.println(eatText);
    }
}
