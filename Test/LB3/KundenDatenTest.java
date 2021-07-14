package LB3;

import com.sun.jmx.remote.internal.ArrayQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class KundenDatenTest {

    // Wir wollen eine Warteschlange simulieren, daher eignet sich der ArrayDeque sehr gut.
    // Mit peek können wir herausfinden wer als nächstes an der Reihe ist.
    // Wenn eine Person geht wird sie mittels remove(Objekt o) gelöscht aus der Warteschlange.
    // Wenn ein neuer Kunde kommt wird dieser hinten angeschlossen addLast().
    // wenn ein Kunde bedient wird, kann dieser durch pollFirst() aus der Liste genommen werden.
    //
    // First in first out!
    //
    // Um sicher zu stellen, dass niemand vergessen wurde, überprüfen wir, ob size() 0 zurück gibt.
    // Wir müssen sicherstellen, dass alle Kunden die vorzeitig gehen aus der Warteschlange entfernt werden!

    int neueNummer = 1;

    KundenDaten k1 = new KundenDaten("Hans", neueNummer++);
    KundenDaten k2 = new KundenDaten("Heidi", neueNummer++);
    KundenDaten k3 = new KundenDaten("Petra", neueNummer++);
    KundenDaten k4 = new KundenDaten("Anna", neueNummer++);
    KundenDaten k5 = new KundenDaten("Paul", neueNummer++);
    KundenDaten k6 = new KundenDaten("Tina", neueNummer++);


    ArrayDeque<KundenDaten> warteschlange;
    @Test
    void ablauf(){
        // 1.
        warteschlange = new ArrayDeque<KundenDaten>();

        // 2.
        warteschlange.addLast(k1);

        // 3.
        warteschlange.addLast(k2);

        // 4.
        warteschlange.addLast(k3);

        // 5.
        System.out.println("An der Reihe: " + warteschlange.peekFirst().getTicketnummer());
        warteschlange.pollFirst();

        // 6.
        warteschlange.remove(k3);

        // 7.
        System.out.println("An der Reihe: " + warteschlange.peekFirst().getTicketnummer());
        warteschlange.pollFirst();

        // 8.
        warteschlange.addLast(k4);

        // 9.
        warteschlange.addLast(k5);

        // 10.
        warteschlange.remove(k5);

        // 11.
        warteschlange.addLast(k6);

        // 12.
        System.out.println("An der Reihe: " + warteschlange.peekFirst().getTicketnummer());
        warteschlange.pollFirst();

        // 13.
        System.out.println("An der Reihe: " + warteschlange.peekFirst().getTicketnummer());
        warteschlange.pollFirst();

        assertEquals(0, warteschlange.size());

        System.out.println("3 und 5 sind gegangen");

    }

}