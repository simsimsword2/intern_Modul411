package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionMachineTest {

    @Test
    public void recFaculty1(){
        assertEquals(RecursionMachine.recFakulty(5), 120);
    }
    @Test
    public void recFaculty2(){
        assertEquals(RecursionMachine.recFakulty(0), 1);
    }
    @Test
    public void recFaculty3(){
        assertEquals(RecursionMachine.recFakulty(1), 1);
    }
    @Test
    public void recFaculty4(){
        assertEquals(RecursionMachine.recFakulty(6), 720);
    }

    @Test
    public void recFakulty5(){
        assertEquals(24, RecursionMachine.recFakulty(4));
    }

    @Test
    void getFibonacci1() {
        assertEquals(RecursionMachine.getFibonacci(0), 0);
    }

    @Test
    void getFibonacci2() {
        assertEquals(RecursionMachine.getFibonacci(1), 1);
    }

    @Test
    void getFibonacci3() {
        assertEquals(RecursionMachine.getFibonacci(2), 1);
    }

    @Test
    void getFibonacci4() {
        assertEquals(RecursionMachine.getFibonacci(3), 2);
    }

    @Test
    void getFibonacci5() {
        assertEquals(RecursionMachine.getFibonacci(7), 13);
    }

    @Test
    void getMin1() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertEquals(1, RecursionMachine.getMin(list, 0));
    }
        @Test
    void getMin2() {
        int[] list = new int[]{123, 4, 65, 213, 24, 578, 3421, 5, 6785};
        assertEquals(4, RecursionMachine.getMin(list, 0));
    }



}