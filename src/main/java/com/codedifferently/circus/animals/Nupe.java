package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Nupe extends AbstractAnimal{
    public Nupe(String name) {
        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks nupeTricks = AnimalTricks.ShimmyLikeANupe;
        String msg = String.format("Yo! %s and i am here to %s", name, nupeTricks.toString());
        logger.info(msg);
    }
}

