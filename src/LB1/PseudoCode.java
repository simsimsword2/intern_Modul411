package LB1;

public class PseudoCode {

    protected int pseudo(int number){
        if (number == 1){
            return 1;
        } else if (number == 0){
            return 0;
        } else {
            int value = pseudo(number / 2);
            value = value + (number % 2);
            return value;
        }
    }
}
