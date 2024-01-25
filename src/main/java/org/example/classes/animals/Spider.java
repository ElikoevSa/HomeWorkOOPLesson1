package org.example.classes.animals;

import java.time.LocalDate;

public class Spider extends Animal{

    int numberOfPaws;
    public Spider(String name, LocalDate birthDay, String diseases,int numberOfPaws) {
        super(name, birthDay, diseases);
        this.numberOfPaws=numberOfPaws;
    }

    @Override
    public void doLifeCycle() {
        super.animal.doClimb(getName());
    }

    @Override
    public String toString() {
        return super.toString() + ", количество лап" + numberOfPaws;
    }
}
