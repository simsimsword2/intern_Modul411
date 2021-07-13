package LB2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AufgabeRekursionTest {

    AufgabeRekursion tester = new AufgabeRekursion();

    @Test
    void sumIterative1() {
        assertEquals(0, tester.sumIterative(0, 0));
    }

    @Test
    void sumIterative2() {
        assertEquals(10, tester.sumIterative(2, 8));
    }

    @Test
    void sumIterative3() {
        assertEquals(0, tester.sumIterative(-15, 15));
    }

    @Test
    void sumIterative4() {
        assertEquals(-6, tester.sumIterative(10, -16));
    }

    @Test
    void sumIterative5() {
        assertEquals(-60, tester.sumIterative(-10, -50));
    }

    @Test
    void sumIterative6() {
        assertEquals(-60, tester.sumIterative(-100, 40));
    }



    @Test
    void sumRecursive1() {
        assertEquals(0, tester.sumRecursive(0, 0));
    }

    @Test
    void sumRecursive2() {
        assertEquals(10, tester.sumRecursive(2, 8));
    }

    @Test
    void sumRecursive3() {
        assertEquals(0, tester.sumRecursive(-15, 15));
    }

    @Test
    void sumRecursive4() {
        assertEquals(-6, tester.sumRecursive(10, -16));
    }

    @Test
    void sumRecursive5() {
        assertEquals(-60, tester.sumRecursive(-10, -50));
    }

    @Test
    void sumRecursive6() {
        assertEquals(-60, tester.sumRecursive(-100, 40));
    }}