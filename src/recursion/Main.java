package recursion;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        RecursionMachine.towersOfHanio(10);
        long end = System.currentTimeMillis();

        long start1 = System.currentTimeMillis();
        RecursionMachine.towersOfHanio(11);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        RecursionMachine.towersOfHanio(20);
        long end2 = System.currentTimeMillis();

        System.out.println("10: " + (end - start));
        System.out.println("11: " + (end1 - start1));
        System.out.println("20: " + (end2 - start2));

        System.out.println("-------------------------------------");
        int[] list = new int[]{2, 4, 2, 56, 78, 3, 7, 43, 78, 34, 12, 5, 8, 3, 12, 5, 89};

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        RecursionMachine.mergeSort(list, list.length);


        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
