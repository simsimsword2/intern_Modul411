package LB2;

public class Buch implements Comparable<Buch> {
    // Attribute
    private String titel;
    private String autor;
    private int anzSeiten;
    private int erschJahr;

    // getter setter

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnzSeiten() {
        return anzSeiten;
    }

    public void setAnzSeiten(int anzSeiten) {
        this.anzSeiten = anzSeiten;
    }

    public int getErschJahr() {
        return erschJahr;
    }

    public void setErschJahr(int erschJahr) {
        this.erschJahr = erschJahr;
    }


    // constructor
    public Buch(String titel, String autor, int anzSeiten, int erschJahr) {
        this.titel = titel;
        this.autor = autor;
        this.anzSeiten = anzSeiten;
        this.erschJahr = erschJahr;
    }

    @Override
    public int compareTo(Buch o) {
        if (this.autor.equals(o.autor)){
            if (this.erschJahr == o.erschJahr){
                return 0;
            }
            if (this.erschJahr > o.erschJahr){
                return -1;
            } else {
                return 1;
            }
        }
        if (this.autor.compareTo(o.autor) > 0){
            return 1;
        } else {
            return -1;
        }
    }
}
