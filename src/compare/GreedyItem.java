package compare;

import recursion.RecursionMachine;

import java.util.Arrays;

public class GreedyItem {

    // prioritize heavy items
    public static Item[] getHeavyItems(Item[] items, int target){

        // variables
        Item[] result = new Item[items.length];
        double total = 0;
        int resultIterator = 0;

        // Items get sorted
        Arrays.sort(items);

        // Combine the items
        for (int i = items.length - 1; i >= 0; i--){
            if (total + items[i].getWeight() <= target){
                total += items[i].getWeight();
                result[resultIterator++] = items[i];
            }
        }
        return result;
    }

    // prioritize quantity of items
    public static Item[] getManyItems(Item[] items, int target){

        // variables
        Item[] result = new Item[items.length];
        double total = 0;
        int resultIterator = 0;

        // Items get sorted
        Arrays.sort(items);

        // Combine the items
        for (int i = 0; i < items.length; i++){
            if (total + items[i].getWeight() <= target){
                total += items[i].getWeight();
                result[resultIterator++] = items[i];
            } else {
                i = items.length;
            }
        }
        return result;
    }
}
