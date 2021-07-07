package LB1;

public class PalindromFinder {

    // Returns true if the given charlist is a palindrom
    // false otherwise
    // using iteration
    protected boolean palindrom_iterative(char[] charList){

        int left = 0;
        int right = charList.length - 1;
        Boolean palindrom_flag = true;

        // iterate from both sides and check if the values are equal
        while (left <= right && palindrom_flag) {
            if (charList[left++] != charList[right--]) {
                palindrom_flag = false;
            }
        }

        return palindrom_flag;
    }

    // Returns true if the given charlist is a palindrom
    // false otherwise
    // using recursion
    protected boolean palindrom_recursive(char[] charList, int left, int right){


        if (left < right - 1){
            // recursion step
            // first and last letter same?             && inner word also a palindrom?
            return (charList[left] == charList[right]) && palindrom_recursive(charList, left + 1, right - 1);

        } else {
            // inner most check
            return charList[left] == charList[right];
        }
    }
}
