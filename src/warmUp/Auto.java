package warmUp;


public class Auto extends Fahrzeug {

    // variables
    private Person besitzer;

    // constructor
    public Auto(String name, Person besitzer) {
        super(name);
        this.besitzer = besitzer;
    }

    // overwritten method from the super-class
    //  print the name of the owner
    @Override
    public void gibLaut() {
        System.out.println("warmUp.Auto von " + this.besitzer.name);
        super.gibLaut();
    }
}






