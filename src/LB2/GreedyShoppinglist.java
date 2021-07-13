package LB2;

import java.util.Arrays;

public class GreedyShoppinglist {

    private double maxValue = 20.0;

    protected double[] getHighestValueItems(double[] list){
        // variables
        double total = 0;
        double[] result = new double[list.length];
        int resultIterator = 0;

        // sort list
        Arrays.sort(list);

        // get the high value items
        for (int i = list.length - 1; i >= 0; i--) {
            if (total + list[i] <= maxValue) {
                total += list[i];
                result[resultIterator++] = list[i];
            }
        }
        return result;
    }
}
