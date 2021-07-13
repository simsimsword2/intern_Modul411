package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person p1 = new Person("Muster", "Anna");
    private Person p2 = new Person("Albrecht", "Laura");
    private Person p3 = new Person("Albrecht", "Laura");
    private Person p4 = new Person("Albrecht", "Anna");


    @Test
    void compareTo1() {
        //if (p1.getName().compareTo(p2.getName()) <= 0 && p1.getVorname().compareTo(p2.getVorname()) < 0)
        if (p1.compareTo(p2) < 0)
            System.out.println("p1 ist kleiner");
        else if (p1.compareTo(p2) == 0){
            System.out.println("p1 und p2 sind gleich");
        } else {
            System.out.println("p2 ist kleiner");
        }
        assertEquals(1, p1.compareTo(p2));
    }

    @Test
    void compareTo2() {
        assertEquals(-1, p2.compareTo(p1));
    }

    @Test
    void compareTo3() {
        assertEquals(1, p1.compareTo(p3));
    }

    @Test
    void compareTo4() {
        assertEquals(-1, p4.compareTo(p1));
    }

}