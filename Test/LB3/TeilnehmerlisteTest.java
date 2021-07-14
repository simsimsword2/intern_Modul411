package LB3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeilnehmerlisteTest {

    Teilnehmer t1 = new Teilnehmer("Muster", "Peter");
    Teilnehmer t2 = new Teilnehmer("Ambuehl", "Simon");
    Teilnehmer t3 = new Teilnehmer("Mareck", "Samuel");
    Teilnehmerliste tester = new Teilnehmerliste();

    @Test
    void isEmpty1() {
        assertTrue(tester.isEmpty());
    }

    @Test
    void isEmpty2() {
        tester.add(t1);
        assertFalse(tester.isEmpty());
    }


    @Test
    void indexOf1() {
        assertEquals(-1, tester.indexOf(t1));
    }

    @Test
    void indexOf2() {
        tester.add(t2);
        assertEquals(-1, tester.indexOf(t1));
    }

    @Test
    void indexOf3() {
        tester.add(t1);
        tester.add(t2);
        assertEquals(0, tester.indexOf(t1));
    }

    @Test
    void indexOf4() {
        tester.add(t1);
        tester.add(t2);
        assertEquals(1, tester.indexOf(t2));
    }

    @Test
    void indexOf5() {
        tester.add(t1);
        tester.add(t2);
        assertEquals(1, tester.indexOf(t2));
    }

    @Test
    void indexOf6() {
        tester.add(t1);
        tester.add(t2);
        tester.add(t3);
        assertEquals(1, tester.indexOf(t2));
    }

    @Test
    void indexOf7() {
        tester.add(t1);
        tester.add(t2);
        tester.add(t3);
        assertEquals(2, tester.indexOf(t3));
    }


    @Test
    void removeLast1() {
        assertEquals(null, tester.removeLast());
    }

    @Test
    void removeLast2() {
        tester.add(t1);
        assertEquals(t1, tester.removeLast());
    }

    @Test
    void removeLast3() {
        tester.add(t1);
        tester.add(t2);
        tester.add(t3);
        assertEquals(t3, tester.removeLast());
    }

    @Test
    void removeLast4() {
        tester.add(t1);
        tester.add(t3);
        tester.add(t3);
        assertEquals(t3, tester.removeLast());
    }

    @Test
    void removeLast5() {
        tester.add(t1);
        tester.add(t3);
        tester.add(t3);
        assertEquals(t3.toString(), tester.removeLast().toString());
        assertEquals(2, tester.size());
    }

    @Test
    void removeLast6() {
        tester.add(t1);
        assertEquals(t1.toString(), tester.removeLast().toString());
        assertEquals(0, tester.size());
    }

    @Test
    void removeLast7() {
        tester.add(t1);
        tester.add(t2);
        assertEquals(t2.toString(), tester.removeLast().toString());
        assertEquals(1, tester.size());
    }

    @Test
    void removeLast8() {
        tester.removeLast();
        assertEquals(0, tester.size());
    }


    @Test
    void swapValue1() {
        assertEquals(0, tester.reverse());
    }

    @Test
    void swapValue2() {
        tester.add(t1);
        assertEquals(0, tester.reverse());
    }

    @Test
    void swapValue3() {
        tester.add(t1);
        tester.add(t2);
        assertEquals(1, tester.reverse());
        assertEquals(t2.toString(), tester.getElementbyIndex(0).getTeilnehmer().toString());
        assertEquals(t1.toString(), tester.getElementbyIndex(1).getTeilnehmer().toString());
    }

    @Test
    void swapValue4() {
        tester.add(t1);
        tester.add(t2);
        tester.add(t3);
        tester.add(t2);
        assertEquals(2, tester.reverse());
        assertEquals(t2.toString(), tester.getElementbyIndex(0).getTeilnehmer().toString());
        assertEquals(t3.toString(), tester.getElementbyIndex(1).getTeilnehmer().toString());
        assertEquals(t2.toString(), tester.getElementbyIndex(2).getTeilnehmer().toString());
        assertEquals(t1.toString(), tester.getElementbyIndex(3).getTeilnehmer().toString());

    }

    @Test
    void swapValue5() {
        tester.add(t1);
        tester.add(t2);
        tester.add(t3);
        assertEquals(1, tester.reverse());
        assertEquals(t3.toString(), tester.getElementbyIndex(0).getTeilnehmer().toString());
        assertEquals(t2.toString(), tester.getElementbyIndex(1).getTeilnehmer().toString());
        assertEquals(t1.toString(), tester.getElementbyIndex(2).getTeilnehmer().toString());
    }
}