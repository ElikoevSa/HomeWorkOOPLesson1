package org.example.classes.animals;

import org.example.interfaces.IDrink;
import org.example.interfaces.IEat;
import org.example.interfaces.ILifeCycle;
import org.example.interfaces.ISleep;

import java.time.LocalDate;

public abstract class Animal implements ILifeCycle{
    private String name;
    private LocalDate birthDay;
    private String diseases;
    AnimalImpl animal = new AnimalImpl();//по сути имплеминтирую все методы с нормальным уровнем инкапсуляции

    public Animal(String name, LocalDate birthDay, String diseases) {
        this.name = name;
        this.birthDay = birthDay;
        this.diseases = diseases;
    }

    @Override
    public void doLifeCycle() {

    }

    @Override
    public String toString() {
        return "Кличка = " + name +
                ", Дата рождения = " + birthDay +
                ", Болезнь = " + diseases;
    }


    public String getName() {
        return name;
    }
}
