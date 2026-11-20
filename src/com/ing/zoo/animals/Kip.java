package com.ing.zoo.animals;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.interfaces.Carnivore;

public class Kip extends Animal implements Herbivore, Carnivore {
    public String helloText;
    public String eatText;

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
}
