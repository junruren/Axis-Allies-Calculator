package com.android.axisallies;

//import java.util.*;
/**
 * Created by User on 7/26/2016.
 *
 * Dice class for simulating rolling a dice
 */
public class Dice {
    private int value;

    public Dice() {
        rollDice();
    }

    public void rollDice() {
        value = (int)(Math.random()*6+1);
    }

    public int getValue() {
        return value;
    }
}
