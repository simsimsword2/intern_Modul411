package compare;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedyItemTest {


    private Item clothes    = new Item("clothes", 5);
    private Item nivea      = new Item("nivea", 0.5);
    private Item gold       = new Item("gold", 2);
    private Item labtop     = new Item("labtop", 0.8);
    private Item necessaire = new Item("necessaire", 0.4);
    private Item water      = new Item("water", 1.2);
    private Item[] items;
    private Item[] expected;


    @Test
    void getHeavyItems1() {
        items = new Item[]{clothes, nivea, gold, labtop, necessaire, water};
        expected = new Item[]{gold, labtop, null, null, null, null};
        assertArrayEquals(expected, GreedyItem.getHeavyItems(items, 3));
    }

    @Test
    void getHeavyItems2() {
        items = new Item[]{clothes, nivea, gold, necessaire, water};
        expected = new Item[]{gold, nivea, necessaire, null, null};
        assertArrayEquals(expected, GreedyItem.getHeavyItems(items, 3));
    }

    @Test
    void getManyItems1() {
        items = new Item[]{clothes, nivea, gold, labtop, necessaire, water};
        expected = new Item[]{necessaire, nivea, labtop, water, gold, null};
        assertArrayEquals(expected, GreedyItem.getManyItems(items, 5));
    }

    @Test
    void getManyItems2() {
        items = new Item[]{nivea, gold, labtop, necessaire, water};
        expected = new Item[]{necessaire, nivea, labtop, water, null};
        assertArrayEquals(expected, GreedyItem.getManyItems(items, 4));
    }

}