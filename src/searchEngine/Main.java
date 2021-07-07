package searchEngine;

import recursion.RecursionMachine;

public class Main {
    public static void main(String[] args) {

        long startLinear = System.currentTimeMillis();
        int[] list = new int[]{7, 4, 7, 3, 1, 4, 87, 3, 1, 45, 82, 6, 32, 6, 8, 5, 2, 6, 8, 5, 2, 5, 8};
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        LinearSearch.find(list, 87);
        long endLinear = System.currentTimeMillis();
        System.out.println("linear took " + (endLinear - startLinear) + " milliseconds");


        long startBinary = System.currentTimeMillis();
        RecursionMachine.mergeSort(list, list.length);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        BinarySearch.fastfind(list, 0, list.length, 87);
        long endBinary = System.currentTimeMillis();
        System.out.println("binary took " + (endBinary - startBinary) + " milliseconds");
    }
}
