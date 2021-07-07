package compare;


public class Person implements Comparable<Person> {
    private String name;
    private String vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person p)
    {
        if ((this.name.compareTo(p.getName()) < 0) || (this.name.compareTo(p.getName()) <= 0 && this.vorname.compareTo(p.getVorname()) < 0))
            return -1;
        else if(this.name.compareTo(p.getName()) == 0 && this.vorname.compareTo(p.getVorname()) == 0) {
            return 0;
        } else{
            return 1;
    }

    }
}

