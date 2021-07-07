package compare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private Person p1 = new Person("Muster", "Anna");
    private Person p2 = new Person("Albrecht", "Laura");

    @Test
    void compareTo() {
        //if (p1.getName().compareTo(p2.getName()) <= 0 && p1.getVorname().compareTo(p2.getVorname()) < 0)
        if (p1.compareTo(p2) < 0)
            System.out.println("p1 ist kleiner");
        else if (p1.compareTo(p2) == 0){
            System.out.println("p1 und p2 sind gleich");
        } else {
            System.out.println("p2 ist kleiner");
        }
        assertEquals(1, p1.compareTo(p2));
        assertEquals(-1, p2.compareTo(p1));
        assertEquals(0, p1.compareTo(p1));
    }
}