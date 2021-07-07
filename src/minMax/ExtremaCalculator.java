package minMax;

public class ExtremaCalculator {


    // prints min and max value of a given list
    protected int getMin(int[] list){
        // set initial values
        int min = list[0];

        // go through the list and check if the value ist larger or smaler the min & max
        for(int i = 1; i < list.length; i++){

            if(list[i] < min){
                min = list[i];
            }
        }

        System.out.println("Lowest value is " + min);
        return min;
    }

    protected int getMax(int[] list){
        // set initial values
        int max = list[0];

        // go through the list and check if the value ist larger or smaler the min & max
        for(int i = 1; i < list.length; i++){

            if(list[i] > max){
                max = list[i];
            }
        }

        System.out.println("Largest number is " + max);
        return max;
    }
}
