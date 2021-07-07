package faculty_sum;

public class SumGen {

    public SumGen(int number){

        calcSum(number);
    }

    // calculate the checksum of the number
    protected int calcSum(int number){
        int result = number;

        for(int i = 1; i < number; i ++)
            result += i;

        System.out.println("Checksum of " + number + " is " + result);
        return result;
    }
}
