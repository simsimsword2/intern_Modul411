package LB2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BuchTest {

    Buch b1 = new Buch("Annalena", "Max Winkel", 486, 2003);
    Buch b2 = new Buch("Wellington", "Max Winkel", 520, 2005);
    Buch b21 = new Buch("Wellington", "Max Winkel", 520, 2006);

    Buch b3 = new Buch("Die Bäume von Weller", "Anna Zebra", 671, 2019);
    Buch b4 = new Buch("Im Tahl von Weller", "Anna Zebra", 594, 2019);

    Buch[] buchListe = new Buch[]{b1, b2, b21, b3, b4};


    @Test
    void compareTo1() {
        assertEquals(1, b1.compareTo(b2));
    }

    @Test
    void compareTo2() {
        assertEquals(1, b2.compareTo(b3));
    }

    @Test
    void compareTo3() {
        assertEquals(0, b3.compareTo(b4));
    }

    @Test
    void compareTo4() {
        Arrays.sort(buchListe);
        Buch[] result = new Buch[]{b3, b4, b21, b2, b1};
        assertArrayEquals(result, buchListe);
    }

}