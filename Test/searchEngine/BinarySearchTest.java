package searchEngine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void fastfind1() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(0, BinarySearch.fastfind(list, 0, list.length, 1));
    }

    @Test
    void fastfind2() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(1, BinarySearch.fastfind(list, 0, list.length, 2));
    }

    @Test
    void fastfind3() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, BinarySearch.fastfind(list, 0, list.length, 3));
    }

    @Test
    void fastfind4() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(3, BinarySearch.fastfind(list, 0, list.length, 4));
    }

    @Test
    void fastfind5() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(4, BinarySearch.fastfind(list, 0, list.length, 5));
    }

    @Test
    void fastfind6() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(5, BinarySearch.fastfind(list, 0, list.length, 6));
    }

    @Test
    void fastfind7() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(6, BinarySearch.fastfind(list, 0, list.length, 7));
    }

    @Test
    void fastfind8() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(7, BinarySearch.fastfind(list, 0, list.length, 8));
    }

    @Test
    void fastfind9() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(8, BinarySearch.fastfind(list, 0, list.length, 9));
    }

    @Test
    void fastfind10() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(-1, BinarySearch.fastfind(list, 0, list.length, 10));
    }

}