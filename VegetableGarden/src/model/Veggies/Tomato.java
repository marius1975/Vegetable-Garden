package model.Veggies;

import model.VegType;
import model.Vegetable;

public class Tomato extends Vegetable {
    public Tomato() {
        super("Tomato", VegType.SEED);
        setInstructions("Tomato should be cultivated in march");
    }

    @Override
    public void feed() {
        System.out.println("Tomato should befeed 2 times a week");
    }

    @Override
    public void water() {
        System.out.println("Tomato needs water every other day");
    }

    @Override
    public void harvest() {
        System.out.println("Tomato needs to be harvest as soon as possible");
    }
}
