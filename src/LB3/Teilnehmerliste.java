package LB3;

public class Teilnehmerliste {
	private Element start = null;
	private Element end = null;
	private int count = 0;
	
	public void add(Teilnehmer t)
	{
		Element e = new Element(t);
		if (this.start == null) {
			this.start = e;		
		}
		else {
			this.end.setNext(e);		
	    }
		this.end = e;
		this.count++;
	}

	public int size()
	{
		return this.count;
	}
	
	@Override
	public String toString()
	{
		String s = "[";
		Element e = this.start;
		while (e != null)
		{
			if (!s.equals("["))
			{
				s += ", ";
			}
			s += e.getTeilnehmer().toString();
			e = e.getNext();
		}
		return s + "]";
	}


	// returns true if the list is empty and returns false if the list has at least one element
	public boolean isEmpty(){
		if (this.count == 0){
			return true;
		} else {
			return false;
		}
	}


	// returns the intex of the element if the "Teilnehmer" is found otherwise returns -1
	public int indexOf(Teilnehmer t){
		int index = -1;
		boolean found = false;

		if (!isEmpty()){
			Element temp = this.start;
			index = 0;
			if (temp.getTeilnehmer().equals(t)){
				found = true;
			}

			while (temp.getNext() != null && !found){
				temp = temp.getNext();
				index++;
				if (temp.getTeilnehmer().equals(t)){
					found = true;
				}
			}
		}
		if (found) {
			return index;
		} else {
			return -1;
		}
	}


	// removes last element from the list updates the count and returns the removed "Teilnehmer"
	// returns null if the list is empty
	// sets start and end to null and count to 0 if the list as one element only
	public Teilnehmer removeLast(){
		if (!isEmpty()){
			Element temp = this.start;
			Element newLast;
			if (count == 1){
				this.end = null;
				this.count = 0;
				this.start = null;
			} else {
				while (temp.getNext() != end){
					temp = temp.getNext();

				}
				this.count -= 1;
				newLast = temp;
				temp = temp.getNext();
				newLast.setNext(null);
			}

			return temp.getTeilnehmer();


		} else {
			return null;
		}
	}


	// reverses the order of the list end returns the number of swaps
	// alse reverses if the values are the same!
	public int reverse(){
		if (this.count > 1){
			int first = 0, last = size() - 1, swapcounter = 0;

			while (first < last){
				swapValue(first, last);
				first++;
				last--;
				swapcounter++;
			}

			return swapcounter;

		} else {
			return 0;
		}
	}


	// get element by index
	public Element getElementbyIndex(int index){
		if (!isEmpty()){
			int counter = 0;
			Element temp = this.start;

			while (counter < index) {
				temp = temp.getNext();
				counter++;
			}

			return temp;

		} else {
			return null;
		}
	}


	// swaps to values by index
	public void swapValue(int a, int b){
		Teilnehmer temp = getElementbyIndex(a).getTeilnehmer();
		getElementbyIndex(a).setTeilnehmer(getElementbyIndex(b).getTeilnehmer());
		getElementbyIndex(b).setTeilnehmer(temp);
	}

}
