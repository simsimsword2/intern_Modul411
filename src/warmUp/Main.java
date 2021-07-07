package warmUp;


public class Main {
    public static void main(String[] args) {
        // little test of output
        System.out.println("Hello world!");

        // necessary objects
        Person jeren = new Person("Jeren", 21);
        Auto vw = new Auto("My VW", jeren);

        // output
        vw.getName();
        vw.gibLaut();
    }
}




