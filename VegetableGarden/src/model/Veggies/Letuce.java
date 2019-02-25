package model.Veggies;

import model.VegType;
import model.Vegetable;

public class Letuce extends Vegetable {

    public Letuce() {

        super("Letuce", VegType.LEAF);
        setInstructions("Plant 2 weeks before february");


    }

    @Override
    public void feed() {
        System.out.println("Letuce needs to be feed 2 times a week");
    }

    @Override
    public void water() {
        System.out.println("Letuce needs to have water 4 times a week");
    }

    @Override
    public void harvest() {
        System.out.println("Letuce needs to be harvest when possible");
    }
}
