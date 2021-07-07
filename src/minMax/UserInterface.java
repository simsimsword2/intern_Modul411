package minMax;

import java.util.Scanner;

public class UserInterface {

    private int[] list;
    private Scanner scan = new Scanner(System.in);

    public UserInterface(){

        getList();
    }

    private void getList(){
        System.out.println("how many numbers should the list have?");

        int length = scan.nextInt();

        if(length > 0){

            list = new int[length];

            // let the user enter values
            for(int i = 0; i < length; i++){

                System.out.print("Please enter a number: > ");
                list[i] = scan.nextInt();
            }

            // get min and max
            ExtremaCalculator tempcalc = new ExtremaCalculator();
            tempcalc.getMin(list);
            tempcalc.getMax(list);

        } else {
            System.out.println("ok, I guese you don't want to know min & max");
        }
    }
}
