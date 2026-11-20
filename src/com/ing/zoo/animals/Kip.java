package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;

import java.util.Random;

import com.ing.zoo.interfaces.Carnivore;

import com.ing.zoo.interfaces.TrickPerformer;

public class Kip extends Animal implements Herbivore, Carnivore, TrickPerformer {
    public String helloText;
    public String eatText;
    public String trick;

    public Kip()
    {
    }

    public void sayHello()
    {
        helloText = "Tok Tok Tok";
        System.out.println(helloText);
    }
    
    public void eatLeaves()
    {
        System.out.println("Munch Tok Tok");
    }

    public void eatMeat()
    {
        System.out.println("Chomp Tok Tok");
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "Lays an egg";
        }
        else
        {
            trick = "Eats a worm";
        }
        System.out.println(trick);
    }
}
