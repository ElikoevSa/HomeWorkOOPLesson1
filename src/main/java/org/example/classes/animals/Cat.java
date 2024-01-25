package org.example.classes.animals;

import java.time.LocalDate;

public class Cat extends Animal{

    int lifeCount;
    public Cat(String name, LocalDate birthDay, String diseases,int lifeCount) {
        super(name, birthDay, diseases);
        this.lifeCount=lifeCount;
    }

    @Override
    public void doLifeCycle() {
        super.animal.doEat(getName());
        super.animal.doDrink(getName());
        super.animal.doJump(getName());
        super.animal.doSleep(getName());
        super.animal.doEat(getName());
        super.animal.doDrink(getName());
        super.animal.doSleep(getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
