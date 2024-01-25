package org.example.classes.animals;

import java.time.LocalDate;

public class Bird extends Animal {

    private int wingsCount;
    public Bird(String name, LocalDate birthDay, String diseases,int wingsCount) {
        super(name, birthDay, diseases);
        this.wingsCount=wingsCount;
    }

    public void wakeUp(String name){
        System.out.println(name+" проснулся!");
    }
    @Override
    public void doLifeCycle() {
        super.animal.doEat(getName());
        super.animal.doDrink(getName());
        super.animal.doSleep(getName());
        wakeUp(getName());
        super.animal.doFly(getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
