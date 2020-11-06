package com.codedifferently.circus;

import com.codedifferently.circus.animals.*;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){

        this.animals = new ArrayList<>();
    }

    public void startTheShow(){

        logger.warn("Lets get this party STARTED!!! WOOT WOOT");
        Bear bearReference = new Bear("Big Ben");
        animals.add(bearReference);

        Camel camelReference = new Camel("camelCase");
        animals.add(camelReference);

        Dog dogReference = new Dog("barkBark");
        animals.add(dogReference);

        Nupe nupeReference = new Nupe("K-A-Psi Till i Die!");
        animals.add(nupeReference);

        for(int i = 0; i < animals.size(); i++){
            AbstractAnimal tempReference = animals.get(i);
            tempReference.doTrick();
        }
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
