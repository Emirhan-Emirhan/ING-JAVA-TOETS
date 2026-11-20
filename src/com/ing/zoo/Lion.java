package com.ing.zoo;
import com.ing.zoo.interfaces.Carnivore;

public class Lion extends Animal implements Carnivore{
    public String helloText;
    public String eatText;

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom thx mate";
        System.out.println(eatText);
    }
}
    