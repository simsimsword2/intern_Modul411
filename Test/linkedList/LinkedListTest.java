package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList linkedList;

    @Test
    void isEmpty() {
       linkedList = new LinkedList();
       assertTrue(linkedList.isEmpty());
    }

    @Test
    void getLastNode() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        assertEquals(5, linkedList.getLastNode().getValue());
    }

    @Test
    void addToEnd() {
        linkedList = new LinkedList();
        int expected = 5;
        assertEquals(expected, linkedList.addToEnd(5));
    }

    @Test
    void getSize1() {
        linkedList = new LinkedList();
        assertEquals(0, linkedList.getSize());
    }

    @Test
    void getSize2() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        assertEquals(1, linkedList.getSize());
    }

    @Test
    void getSize3() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        linkedList.addToEnd(2);
        assertEquals(2, linkedList.getSize());
    }

    @Test
    void removeLastNode() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        linkedList.addToEnd(2);
        assertEquals(2, linkedList.removeLastNode());
        assertEquals(1, linkedList.getSize());
    }

    @Test
    void clearList() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        linkedList.addToEnd(2);
        linkedList.clearList();
        assertEquals(0, linkedList.getSize());
    }

    @Test
    void whereIs() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        linkedList.addToEnd(2);
        linkedList.addToEnd(3);
        assertEquals(0, linkedList.whereIs(5));
        assertEquals(1, linkedList.whereIs(2));
        assertEquals(2, linkedList.whereIs(3));
        assertEquals(-1, linkedList.whereIs(10));
    }

    @Test
    void contains() {
        linkedList = new LinkedList();
        linkedList.addToEnd(5);
        linkedList.addToEnd(2);
        linkedList.addToEnd(3);
        assertTrue(linkedList.contains(5));
        assertTrue(linkedList.contains(2));
        assertTrue(linkedList.contains(3));
        assertFalse(linkedList.contains(10));
    }
}