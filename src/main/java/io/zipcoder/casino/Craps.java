package io.zipcoder.casino;
import io.zipcoder.casino.utilities.console.Console;

public class Craps extends Dice {

    Console console;


    public Craps(){
    }

    public int roll() {
        return rollDice() + rollDice();
    }




}
