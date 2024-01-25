package org.example;

import org.example.classes.Animal;
import org.example.classes.Diseases;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Барсик", LocalDate.of(2020,02,12), Diseases.DISEASES_LICHEN);

        System.out.println(Animal.class.getName() + " " + animal);
    }
}