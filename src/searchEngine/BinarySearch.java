package searchEngine;

public class BinarySearch {

    protected static int fastfind(int[] list, int first, int last, int value) {

        if (first >= last - 1) {
            if (list[first] == value) {
                return first;
            } else {
                return -1;
            }
        } else {

            //recursion step
            int difference = last - first;

            int middle = difference / 2 + first;

            if (list[middle] > value) {

                // search in the first half of the list
                return fastfind(list, first, middle, value);
            } else if (list[middle] < value) {

                // search in the seocond half of the list
                return fastfind(list, middle + 1, last, value);
            } else {

                // value found
                return middle;
            }
        }
    }


}
