package com.ing.zoo;

import java.util.Scanner;
import java.util.ArrayList;

import com.ing.zoo.interfaces.Herbivore;
import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.Hippo;
import com.ing.zoo.animals.Lion;
import com.ing.zoo.animals.Pig;
import com.ing.zoo.animals.Tiger;
import com.ing.zoo.animals.Zebra;
import com.ing.zoo.animals.Kip;
import com.ing.zoo.animals.Koe;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.TrickPerformer;

public class Zoo {
    public static void main(String[] args)
    {

        // Create animals
        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Kip kip = new Kip();
        kip.name = "olaf";
        Koe koe = new Koe();
        koe.name = "linda";

        // Add animals to a list
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(henk);
        animals.add(elsa);
        animals.add(dora);
        animals.add(wally);
        animals.add(marty);
        animals.add(kip);
        animals.add(koe);

        // Create commands 
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine();

        // Check user input and call the appropriate method
        if(input.equals(commands[0])) {
            for (Animal animal : animals) {
                animal.sayHello();
            }
        }
        // Check if the input starts with hello + the name of the animal
        else if(input.startsWith("hello ") ) {
            String naam = input.substring(6);

            for (Animal animal : animals) {
                if(animal.name.equals(naam)) {
                    animal.sayHello();
                    break;
                }
            }
        }
        else if(input.equals(commands[1])) {
            for (Animal animal : animals) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        else if(input.equals(commands[2])) {
            for (Animal animal : animals) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        else if(input.equals(commands[3])) {
            for (Animal animal : animals) {
                if (animal instanceof TrickPerformer) {
                    ((TrickPerformer) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}
