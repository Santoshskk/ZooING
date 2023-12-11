package com.ing.zoo;

import com.ing.zoo.interfaces.Animal;
import com.ing.zoo.interfaces.Carnivore;
import com.ing.zoo.interfaces.Herbivore;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The Zoo class represents a simple zoo simulation with various animals.
 * It allows users to interact with the animals using commands.
 */
public class Zoo {
    public static void main(String[] args) {
        // Initialize the commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Creating a map so i can store animals with unique names as keys
        Map<String, Animal> animals = new HashMap<>();
        animals.put("henk", new Lion());
        animals.put("elsa", new Hippo());
        animals.put("dora", new Pig());
        animals.put("wally", new Tiger());
        animals.put("marty", new Zebra());
        animals.put("jack", new Wolf());
        animals.put("baily", new Cow());

        //User input for the command
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
        String input = scanner.nextLine().toLowerCase();

        // Process user command and interact with animals
        if (input.equals(commands[0])) {
            // Greet all animals
            for (Animal animal : animals.values()) {
                animal.sayHello();
            }
        } else if (input.equals(commands[1])) {
            // Feed leaves to herbivores
            for (Animal animal : animals.values()) {
                if (animal instanceof Herbivore) {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        } else if (input.equals(commands[2])) {
            // Feed meat to carnivores
            for (Animal animal : animals.values()) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eatMeat();
                }
            }
        } else if (input.equals(commands[3])) {
            // Make all animals that can do a trick perform tricks
            for (Animal animal : animals.values()) {
                animal.performTrick();
            }
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
