package tests;

import model.VegType;
import model.Veggies.Carrot;
import model.Veggies.Letuce;
import model.Veggies.Tomato;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegetableTest {

    private Carrot testCarrot;
    private Letuce testLetuce;
    private Tomato testTomato;

    @Before
    public void setUp(){

        testCarrot = new Carrot();
        testLetuce = new Letuce();
        testTomato = new Tomato();
        }

    @Test
    public void testCarrot(){
        assertEquals(testCarrot.getName(), "Carrot");
        assertEquals(testCarrot.getType(), VegType.ROOT);
        assertEquals(testCarrot.getInstructions(),"The Carrot should be cultivated in february");
    }
    @Test
    public void testLetuce(){
        assertEquals(testLetuce.getName(), "Letuce");
        assertEquals(testLetuce.getType(), VegType.LEAF);
        assertEquals(testLetuce.getInstructions(),"The Letuce should be cultivated in march");

    }
    @Test
    public void testTomato(){
        assertEquals(testTomato.getName(),"Tomato");
        assertEquals(testTomato.getType(),VegType.SEED);
        assertEquals(testTomato.getInstructions(),"Tomato should be cultivated in march");
    }

}
