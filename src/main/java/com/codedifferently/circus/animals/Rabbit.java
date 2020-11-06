package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Rabbit extends AbstractAnimal{
    public Rabbit(String name) {
        super(name);
    }
    public void doTrick(){
        AnimalTricks tricks = AnimalTricks.RUN;
        String msg = String.format("Hi my name is %s and I am happy to %s \n",name,tricks.toString());
        logger.info(msg);
    }
}
