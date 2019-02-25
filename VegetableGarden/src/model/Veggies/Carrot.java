package model.Veggies;

import model.VegType;
import model.Vegetable;

public class Carrot extends Vegetable {

    public Carrot() {

        super("Carrot" , VegType.ROOT);
        setInstructions("The Carrot should be cultivated in february");
    }

    @Override
    public void feed() {
        System.out.println("Carrot needs to be feed twice a week");

    }

    @Override
    public void water() {
        System.out.println("Carrot needs to get water 4 times a week");
    }

    @Override
    public void harvest() {
        System.out.println("Carrot needs to be harvest in september");
    }
}
