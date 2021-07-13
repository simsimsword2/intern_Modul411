package LB2;

public class AufgabeRekursion {

    // add two numbers using iteration
    protected int sumIterative(int a, int b){
        int result = a;
        while (b != 0){
            if (b > 0){
                result++;
                b--;
            } else {
                result--;
                b++;
            }
        }
        return result;
    }


    // add two numbers using recursion
    protected  int sumRecursive(int a, int b){
        if (b == 0){
            return a;
        } else {
            if (b > 0){
                return sumRecursive(a + 1, b - 1);
            } else {
                return sumRecursive(a - 1, b + 1);
            }
        }
    }
}
