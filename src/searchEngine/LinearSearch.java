package searchEngine;

public class LinearSearch {

    protected static int find(int[] list, int value){

        for (int i = 0; i < list.length; i++){
            if (list[i] == value){
                return i;
            }
        }

        return -1;
    }
}
