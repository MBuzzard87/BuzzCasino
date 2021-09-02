package io.zipcoder.casino;

abstract class Dice {

    public int rollDice() {
        return (int)Math.ceil(Math.random() * 6);
    }


}
