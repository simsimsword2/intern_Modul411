package sorting;

public class Bubble {

    // sorting with bubblesort ASC
    //  goes through the list(-1) and compairs all values with their right hand neighbour
    //  if the neighbour is smaller, the values are swapped
    //  this goes on until the program can interate through the list without swapping
    public static int[] sort(int[] list){
        int[] result = list;
        Boolean didSwap = true;

        // time check
        long startTime = System.nanoTime();

        while(didSwap) {
            didSwap = false;

            for (int i = 0; i < list.length - 1; i++) {

                if(list[i] > list[i + 1]){
                    swap(list, i, i + 1);
                    didSwap = true;
                }
            }
        }

        // time check
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Sorting the List took " + totalTime + " nanoseconds");

        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + ", ");
        }
        return result;
    }

    // swaps values list[i] and lits[j]
    protected static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}
