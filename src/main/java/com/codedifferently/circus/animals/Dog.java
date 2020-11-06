package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Dog extends AbstractAnimal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void doTrick() {
        AnimalTricks dogTricks1 = AnimalTricks.JUMP;
        AnimalTricks dogTricks2 = AnimalTricks.SWIM;
        String msg = String.format("My name is %s and i am happy to %s", name, dogTricks1.toString(), dogTricks2.toString());
        logger.info(msg);
    }
}
