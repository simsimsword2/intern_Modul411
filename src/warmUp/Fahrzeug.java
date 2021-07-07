package warmUp;

public class Fahrzeug {

    // variables
    private String name;

    // constructor
    public Fahrzeug(String name){
        this.name = name;
    }

    // getter for private variable
    public String getName() {
        System.out.println(this.name);
        return name;
    }

    // write small message
    public void gibLaut(){
        System.out.println("Ich habe keinen Ton :(");
    }
}


