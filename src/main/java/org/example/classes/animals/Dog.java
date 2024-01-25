package org.example.classes.animals;

import org.example.interfaces.ILifeCycle;

import java.time.LocalDate;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, LocalDate birthDay, String diseases,String breed) {
        super(name, birthDay, diseases);
        this.breed=breed;
    }

    @Override
    public void doLifeCycle() {
        super.animal.doHunt(getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", Порода = " + breed;
    }
}
