package org.example.classes.animals;

import java.time.LocalDate;

public class Snake extends Animal{
    public Snake(String name, LocalDate birthDay, String diseases) {
        super(name, birthDay, diseases);
    }

    @Override
    public void doLifeCycle() {
        super.animal.doCrawl(getName());
        super.animal.doCrawl(getName());
        super.animal.doCrawl(getName());
        super.animal.doSleep(getName());

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
