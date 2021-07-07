package sorting;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class bubbleTest {

    public int[] list1, list2, list3, list4, list5;
    public int[] result1, result2, result3, result4, result5;

    @Test
    void bubble1() {
        list1 = new int[]{123, 1, 3, 2, 7, 5, 6, 0, 0};
        result1 = new int[]{0, 0, 1, 2, 3, 5, 6, 7, 123};
        assertArrayEquals(Bubble.sort(list1), result1);
    }

    @Test
    void bubble2(){
        list2 = new int[] {1};
        result2 = new int[]{1};
        assertArrayEquals(Bubble.sort(list2), result2);
    }

    @Test
    void bubble3(){
        list3 = new int[] {99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80};
        result3 = new int[]{80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        assertArrayEquals(Bubble.sort(list3), result3);
    }

    @Test
    void bubble4(){
        list4 = new int[] {99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80};
        result4 = new int[]{80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        assertArrayEquals(Bubble.sort(list4), result4);
    }

    @Test
    void bubble5(){
        list5 = new int[] {12,3, 5, 123,4, 65, 23, 634,574 , 0,213, 4346, 465, 234, 457, 568, 345, 124, 357, 6798, 435, 4679, 89, 8, 45, 325, 56, 57, 9, 56, 3, 45, 346, 5, 9, 465, 63, 45, 45, 76, 79, 45, 623, 11, 458, 7, 80, 95, 67, 34, 5, 3, 5, 75, 79, 6, 8, 56, 5, 3, 45, 2, 5};
        result5 = new int[]{0, 2, 3, 3, 3, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 8, 9, 9, 11, 12, 23, 34, 45, 45, 45, 45, 45, 45, 56, 56, 56, 57, 63, 65, 67, 75, 76, 79, 79, 80, 89, 95, 123, 124, 213, 234, 325, 345, 346, 357, 435, 457, 458, 465, 465, 568, 574, 623, 634, 4346, 4679, 6798};
        assertArrayEquals(Bubble.sort(list5), result5);
    }


}