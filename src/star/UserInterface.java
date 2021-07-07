package star;

import java.util.Scanner;

public class UserInterface {

    private Scanner scan = new Scanner(System.in);

    public UserInterface(){
        askUser();
    }

    private void askUser(){
        System.out.println("Greetings here you can draw diamonds");
        System.out.print("Please enter the size of the diamond:");

        // ask user for the size of the diamond
        int size = scan.nextInt();

        if(size > 0) {
            StarGen tempgen = new StarGen();
            // create diamond
            tempgen.diamond(size);
        } else {
            System.out.println("Now diamond for you :(");
        }

        System.out.println("\nThank you for using this program");
    }
}
