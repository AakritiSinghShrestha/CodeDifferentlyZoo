package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Cat;
import com.codedifferently.circus.animals.Rabbit;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){
        this.animals = new ArrayList<>();
    }

    public void startTheShow(){
        //logger.info("Lets Get this party started");

        Bear bearReference = new Bear("Smokey the bear");
       // logger.warn("You need to program the show");
        animals.add(bearReference);
       // bearReference.doTrick();

        Cat catReference = new Cat("SmellyCat");
       // catReference.doTrick();
        animals.add(catReference);

        Rabbit rabbitReference = new Rabbit("lucy");
        //rabbitReference.doTrick();
        animals.add(rabbitReference);
        for(int i=0;i<animals.size();i++){
            AbstractAnimal temReference = animals.get(i);
            temReference.doTrick();
        }
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
