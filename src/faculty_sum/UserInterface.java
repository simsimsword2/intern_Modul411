package faculty_sum;

import java.util.Scanner;

public class UserInterface {

    Scanner scan = new Scanner(System.in);

    public UserInterface(){
        runInterface();
    }

    // interaction with the user
    private void runInterface(){
        System.out.print("Enter a number and you will get its faculty and its sum: > ");

        int inputNumber = scan.nextInt();

        if(inputNumber >= 0) {
            FacultyGen tempfaculty = new FacultyGen(inputNumber);
            SumGen tempsum = new SumGen(inputNumber);
        } else {
            System.out.println("This is too hard :(");
        }
    }
}
