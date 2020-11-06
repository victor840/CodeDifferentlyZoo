package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Camel extends AbstractAnimal {
    public Camel(String name) {
        super(name);
    }

    @Override
    public void doTrick() {
     AnimalTricks camelTrick1 = AnimalTricks.WALK;
     AnimalTricks camelTrick2 = AnimalTricks.RUN;
     String msg = String.format("My name is %s and i am happy to %s and %s", name, camelTrick1.toString(), camelTrick2.toString());
     logger.info(msg);
    }
}
