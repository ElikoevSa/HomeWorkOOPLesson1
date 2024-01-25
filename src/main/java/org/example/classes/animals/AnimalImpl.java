package org.example.classes.animals;

import org.example.interfaces.*;
//В данном методе реализую все интерфэйсы для животных
public class AnimalImpl implements IHunt, IClimb,ICrawl,IDrink,IEat,IFly,IJump,ISleep {
    @Override
    public void doHunt(String name) {
        System.out.println(name + " охотится!");
    }

    @Override
    public void doClimb(String name) {
        System.out.println(name + " карабкается!");
    }

    @Override
    public void doCrawl(String name) {
        System.out.println(name + " ползёт!");
    }

    @Override
    public void doDrink(String name) {
        System.out.println(name + " пьёт!");
    }

    @Override
    public void doEat(String name) {
        System.out.println(name + " кушает!");
    }

    @Override
    public void doFly(String name) {
        System.out.println(name + " летает!");
    }

    @Override
    public void doJump(String name) {
        System.out.println(name + " прыгает!");
    }

    @Override
    public void doSleep(String name) {
        System.out.println(name + " спит!");
    }
}
