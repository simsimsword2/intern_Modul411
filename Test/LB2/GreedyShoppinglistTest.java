package LB2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedyShoppinglistTest {

    private double milch      = 1.80;
    private double getraenke  = 1.50;
    private double brot       = 3.50;
    private double Aepfel     = 3.00;
    private double pizza      = 6.50;
    private double gemuese    = 4.50;
    private double schokolade = 2.00;
    private double fleisch    = 18.10;
    private double stecker    = 21.50;
    private double[] preise  = {1.80, 1.50, 3.50, 3.00, 6.50, 4.50, 2.00};
    private double[] preise2 = {1.80, 1.50, 3.50, 3.00, 4.50, 2.00};
    private double[] preise3 = {1.80, 1.50, 3.50, 3.00, 6.50, 4.50, 2.00, 18.10};
    private double[] preise4 = {21.50, 1.80, 1.50, 3.50, 3.00, 6.50, 4.50, 2.00, 18.10};
    private double[] result;


    @Test
    void getHighestValueItems1() {
        GreedyShoppinglist tester = new GreedyShoppinglist();
        result = new double[]{6.5, 4.5, 3.5, 3, 2, 0, 0};
        assertArrayEquals(result, tester.getHighestValueItems(preise));
    }

    @Test
    void getHighestValueItems2() {
        GreedyShoppinglist tester = new GreedyShoppinglist();
        result = new double[]{4.5, 3.5, 3, 2, 1.8, 1.5};
        assertArrayEquals(result, tester.getHighestValueItems(preise2));
    }

    @Test
    void getHighestValueItems3() {
        GreedyShoppinglist tester = new GreedyShoppinglist();
        result = new double[]{18.10, 1.80, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(result, tester.getHighestValueItems(preise3));
    }

    @Test
    void getHighestValueItems4() {
        GreedyShoppinglist tester = new GreedyShoppinglist();
        result = new double[]{18.10, 1.80, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(result, tester.getHighestValueItems(preise4));
    }

}