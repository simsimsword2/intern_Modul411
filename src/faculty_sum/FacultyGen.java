package faculty_sum;

public class FacultyGen {

    protected int result;

    public FacultyGen(int number){

        calcFaculty(number);
    }

    // calculate faculty
    protected int calcFaculty(int number){
        this.result = number;

        for(int i = 1; i < number; i ++)
            this.result *= i;

        if(number == 0)
            result = 1;

        System.out.println("Faculty of " + number + " is " + this.result);
        return this.result;
    }


}
