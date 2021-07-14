package vector;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        Vector v2 = new Vector(42);
        Vector v3 = new Vector(1, 10);

        System.out.println("v1: " + v1.capacity());
        System.out.println("v2: " + v2.capacity());
        System.out.println("v3: " + v3.capacity());

        for (int i = 0; i < 10; i++){
            v1.add(i);
            v2.add(i);
            v3.add(i);
        }

        //System.out.println("v1: " + v1.capacity());
        //System.out.println("v2: " + v2.capacity());
        //System.out.println("v3: " + v3.capacity());
    }

}
