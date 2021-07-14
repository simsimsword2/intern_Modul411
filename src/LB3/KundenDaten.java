package LB3;

public class KundenDaten {
    private String name;
    private int ticketnummer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketnummer() {
        return ticketnummer;
    }

    public void setTicketnummer(int ticketnummer) {
        this.ticketnummer = ticketnummer;
    }


    public KundenDaten(String name, int ticketnummer) {
        this.name = name;
        this.ticketnummer = ticketnummer;
    }
}
