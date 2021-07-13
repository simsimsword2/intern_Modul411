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
    public int compareTo(Person o){
        if (this.name.equals(o.name)){
            if (this.vorname.equals(o.vorname))
                return 0;
              else {
                if (this.vorname.compareTo(o.vorname) < 0)
                    return -1;
                else
                    return 1;
            }
        } else {
            if (this.name.compareTo(o.name) < 0)
                return -1;
              else
                return 1;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                '}';
    }
}

