package org.example;

import org.example.classes.animals.*;
import org.example.enums.Diseases;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init(){
        Animal dog = new Dog("Полкан",LocalDate.of(2016,03,13),Diseases.DISEASES_FRACTURE.getDiseasesName(), "Русская овчарка");
        Animal bird = new Bird("Кеша",LocalDate.of(2022,05,10),Diseases.DISEASES_PARASITES.getDiseasesName(), 2);
        Animal cat = new Cat("Барсик",LocalDate.of(2015,03,21),Diseases.DISEASES_LICHEN.getDiseasesName(), 5);
        Animal fish = new Fish("Зизи",LocalDate.of(2023,12,12),Diseases.DISEASES_NONE.getDiseasesName());
        Animal snake = new Snake("Ползун",LocalDate.of(2022,11,07),Diseases.DISEASES_INFECTION.getDiseasesName());
        Animal spider = new Spider("Ткук",LocalDate.of(2024,01,01),Diseases.DISEASES_NONE.getDiseasesName(), 8);


        String spl = "\n=======================================\n";

        dog.doLifeCycle();
        System.out.println(spl);
        bird.doLifeCycle();
        System.out.println(spl);
        cat.doLifeCycle();
        System.out.println(spl);
        fish.doLifeCycle();
        System.out.println(spl);
        snake.doLifeCycle();
        System.out.println(spl);
        spider.doLifeCycle();
    }
}