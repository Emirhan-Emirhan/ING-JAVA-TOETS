package com.ing.zoo.animals;
import com.ing.zoo.interfaces.Herbivore;

public class Koe extends Animal implements Herbivore {
    public String helloText;
    public String eatText;

    public Koe()
    {
    }

    public void sayHello()
    {
        helloText = "mooo";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch yummy moo!";
        System.out.println(eatText);
    }
    
}
