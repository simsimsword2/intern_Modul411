package LB1;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromFinderTest {

    private PalindromFinder search1;

    // test iteration
    @Test
    void palindtom_iterative1() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'a', 'b', 'b', 'a'};

        assertTrue(search1.palindrom_iterative(list));
    }
    @Test
    void palindtom_iterative2() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'l', 'o', 'l'};

        assertTrue(search1.palindrom_iterative(list));
    }
    @Test
    void palindtom_iterative3() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'L', 'o', 'l'};

        assertFalse(search1.palindrom_iterative(list));
    }
    @Test
    void palindtom_iterative4() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'T', 'e', 's', 't'};

        assertFalse(search1.palindrom_iterative(list));
    }
    @Test
    void palindtom_iterative5() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'T'};

        assertTrue(search1.palindrom_iterative(list));
    }

    // test recursion
    @Test
    void palindrom_recursive1() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'a', 'b', 'b', 'a'};

        assertTrue(search1.palindrom_recursive(list, 0, list.length - 1));
    }
    @Test
    void palindrom_recursive2() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'l', 'o', 'l'};

        assertTrue(search1.palindrom_recursive(list, 0, list.length - 1));
    }
    @Test
    void palindrom_recursive3() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'L', 'o', 'l'};

        assertFalse(search1.palindrom_recursive(list, 0, list.length - 1));
    }
    @Test
    void palindrom_recursive4() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'T', 'e', 's', 't'};

        assertFalse(search1.palindrom_recursive(list, 0, list.length - 1));
    }
    @Test
    void palindrom_recursive5() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'T'};

        assertTrue(search1.palindrom_recursive(list, 0, list.length - 1));
    }
    @Test
    void palindrom_recursive6() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'A', 'B', 'D', 'A'};

        assertFalse(search1.palindrom_recursive(list, 0, list.length - 1));
    }
    @Test
    void palindrom_recursive7() {
        search1 = new PalindromFinder();
        char[] list = new char[]{'L', 'A', 'G', 'E', 'R', 'R', 'E', 'G', 'A', 'L'};

        assertTrue(search1.palindrom_recursive(list, 0, list.length - 1));
    }
}