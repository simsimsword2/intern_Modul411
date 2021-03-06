package recursion;

import java.util.Arrays;
import java.util.Stack;

public class RecursionMachine {

    protected static int recFakulty(int number){

        // smallest element
        if(number <= 0){
            return 1;

        // recursion step
        } else {
            return number * recFakulty(number - 1);
        }
    }


    protected static int getFibonacci(int number){

        // smallest element
        if (number <= 0)
            return 0;
        if(number <= 2 && number > 0) {
            return 1;
        // recursion stepp
        } else {
            return getFibonacci(number - 1) + getFibonacci(number - 2);
        }
    }


    protected static int getMin(int[] list, int index){

        // smallest element
        if(index == list.length - 1){
            return list[index];
        // recursion step
        } else {

            int value = getMin(list, index + 1);

            if(list[index] < value){
                return list[index];
            } else {
                return value;
            }
        }
    }


    protected static void towersOfHanio(int height){

        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        Stack<Integer> stackC = new Stack<Integer>();

        for(int i = height ; i >= 1; i--){
            stackA.push(i);
        }

        Stack[] stackList = new Stack[]{stackA, stackB, stackC};

        //printGame(stackList);

        tohMove(height, 0, 2, 1, stackList);
    }

    protected static void tohMove(int height, int fromStack, int toStack, int otherStack, Stack[] stackList){

        // smallest element
        if (height == 1) {
            stackList[toStack].push(stackList[fromStack].pop());
            //printGame(stackList);
        } else {
            // recursion step
            tohMove(height - 1, fromStack, otherStack, toStack, stackList);
            tohMove(1, fromStack, toStack, otherStack, stackList);
            tohMove(height - 1, otherStack, toStack, fromStack, stackList);
        }
    }

    protected static void printGame(Stack[] stackList){
        System.out.println("stackA: " + stackList[0].toString());
        System.out.println("stackB: " + stackList[1].toString());
        System.out.println("stackC: " + stackList[2].toString());
        System.out.println();
    }


    public static void mergeSort(int[] listIn, int end){

        if (end < 2){
            return;
        } else {

            // split the given list into two smaller ones
            int middle = end / 2;

            int[] firstHalf = new int[middle];
            int[] secondHalf = new int[end - middle];

            for (int i = 0; i < middle; i++) {
                firstHalf[i] = listIn[i];
            }
            for (int i = middle; i < end; i++) {
                secondHalf[i - middle] = listIn[i];
            }

            // sort first list
            mergeSort(firstHalf, middle);

            // sort second list
            mergeSort(secondHalf, end - middle);

            // bring sorted lists together
            mergeLists(listIn, firstHalf, secondHalf, middle, end - middle);
        }
    }

    protected static void mergeLists(int[] listIn, int[] fistHalf, int[] secondHalf, int begin, int end){
        // indexes
        int i = 0, j = 0, n = 0;

        // merging overlapping part
        while (i < begin - 1 && j < end - 1) {
            if (fistHalf[i] <= secondHalf[j]) {
                listIn[n++] = fistHalf[i++];
            } else {
                listIn[n++] = secondHalf[j++];
            }
        }
        // merge rest of both lists (only one of the two)
        while (i < begin) {
            listIn[n++] = fistHalf[i++];
        }
        while (j < end) {
            listIn[n++] = secondHalf[j++];
        }
    }


    protected static int gcd(int a, int b) {
        if (a == b) {
            return a;
        } else {
            if (a > b) return gcd(a - b, b);
            else return gcd(a, b - a);
        }
    }

    protected static int gcdIterative(int a, int b){
        while (a != b){
            if (a < b) b -= a;
            else a -= b;
        }
        return a;
    }


    protected static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

/*
    protected static void queen(int size){
        Boolean[][] board = new Boolean[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                board[i][j] = false;
            }
        }

        placeQueen(1, board, 0, -1);

        printBoard(board);
    }

    private static void printBoard(Boolean[][] board){
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                if (board[i][j]){
                    System.out.print("[Q]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }

    private static boolean placeQueen(int number, Boolean[][] board, int x, int y){
        if (number == board.length){
            return true;
        } else {
            board[x][y] = true;

            if (placeQueen(number + 1, board))

            do{
                board[x][y] = false;
                do {
                    if (y < board.length - 1) {
                        y++;
                    } else {
                        x++;
                        y = 0;
                    }
                } while (!validPosition(board, x, y));
                board[x][y] = true;
            }while (!placeQueen(number + 1, board, x, y));
            return true;
        }
    }

    private static boolean validPosition(Boolean[][] board, int x, int y){
        for (int i = 0; i < board.length; i++){
            // horizontal and vertical
            if (board[x][i] || board [i][y]){
                return false;
            }
            // diagonal
            if (i > 1 && i < board.length - 1)
            if (x + i < board.length && y + i < board.length){
                if (board[x + i][y + i]){
                    return false;
                }
            }
            if (x - i >= 0 && y + i < board.length){
                if (board[x - i][y + i]){
                    return false;
                }
            }
            if (x + i < board.length && y - i >= 0){
                if (board[x + i][y - i]){
                    return false;
                }
            }
            if (x - i >= 0 && y - i >= 0){
                if (board[x - i][y - i]){
                    return false;
                }
            }
        }
        return true;
    }
*/
}
