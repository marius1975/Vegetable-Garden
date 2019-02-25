package main;

import model.VegType;
import model.Vegetable;
import model.Veggies.Carrot;
import model.Veggies.Letuce;
import model.Veggies.Tomato;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vegetable> garden = new ArrayList<>();
        garden.add(new Carrot());
        garden.add(new Tomato());
        garden.add(new Letuce());

        for(Vegetable v: garden){
            System.out.println(v.getName() + "," + v.getInstructions());
        }
        for(Vegetable v: garden){
            if(v.getType().equals(VegType.ROOT)){
                v.harvest();
            }

        }
        for (Vegetable v: garden){
            System.out.println(v.getName()+ ":");
            v.feed();
            v.water();
        }
    }

}
