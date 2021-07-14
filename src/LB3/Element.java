package LB3;

public class Element {
	private Teilnehmer teilnehmer = null;
	private Element next = null;
	
	public Element(Teilnehmer teilnehmer)
	{
		this.teilnehmer = teilnehmer;		
	}
	
	public Element()
	{	
	}

	public Teilnehmer getTeilnehmer() {
		return this.teilnehmer;
	}

	public void setTeilnehmer(Teilnehmer teilnehmer) {
		this.teilnehmer = teilnehmer;
	}

	public Element getNext() {
		return this.next;
	}

	public void setNext(Element next) {
		this.next = next;
	}	
}
