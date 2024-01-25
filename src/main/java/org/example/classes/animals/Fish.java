package org.example.classes.animals;

import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(String name, LocalDate birthDay, String diseases) {
        super(name, birthDay, diseases);
    }

    @Override
    public void doLifeCycle() {
        super.animal.doEat(getName());
        super.animal.doSleep(getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
