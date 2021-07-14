package LB3;

public class Teilnehmer {
	private String name = null;
	private String vorname = null;

	public Teilnehmer(String name, String vorname) {
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
		return this.name + " " + this.vorname;
	}

	@Override
	public boolean equals(Object o) {
		Teilnehmer t = (Teilnehmer) o;
		if (this.name.equals(t.getName()) && this.vorname.equals(t.getVorname())) {
			return true;
		} else {
			return false;
		}
	}
}
