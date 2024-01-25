package org.example.classes;

import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate date;
    private Diseases diseases;

    public Animal(String name, LocalDate date, Diseases diseases) {
        this.name = name;
        this.date = date;
        this.diseases = diseases;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", diseases=" + diseases +
                '}';
    }
}
