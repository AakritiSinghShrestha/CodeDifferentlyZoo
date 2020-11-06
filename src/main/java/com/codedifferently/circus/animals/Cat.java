package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Cat extends AbstractAnimal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void doTrick(){
        AnimalTricks tricks = AnimalTricks.SWIM;
        String msg = String.format("Hi my name is %s and I am happy to %s \n",name,tricks.toString());
        logger.info(msg);
    }
}
