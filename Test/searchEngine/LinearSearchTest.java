package searchEngine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void find1() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(3, LinearSearch.find(list, 4));
    }

    @Test
    void find2() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(-1, LinearSearch.find(list, 10));
    }

}