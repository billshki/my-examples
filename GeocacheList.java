//UIUC CS125 FALL 2013 MP. File: GeocacheList.java, CS125 Project: Challenge5-DataStructures, Version: 2013-10-14T15:57:58-0500.653928462
/**
 * Complete the following GeocacheList, to ensure all unit tests pass. There are
 * several errors in the code below
 * 
 * Hint: Get the Geocache class working and passing its tests first.
 */
public class GeocacheList {
	private Geocache[] data = new Geocache[0];

	// private int size = 0;

	public Geocache getGeocache(int i) {

		return data[i];
	}

	public int getSize() {
		return data.length;
	}

	public GeocacheList() {
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		if (deepCopy) {
			this.data = new Geocache[other.data.length];
			int size = other.getSize();
			for (int i = 0; i < size; i++) {
				this.data[i] = new Geocache(other.data[i]);
				//Geocache g = other.data[i];
				//this.data[i].setX(g.getX());
				///this.data[i].setY(g.getY());
				//data[i] = new Geocache(other.data[i]);
				//data[i] = new Geocache(g.getX(),g.getY());
				//this.data[i].setX(other.data[i].getX());
				//this.data[i].setY(other.data[i].getY());
			}
		} else
			this.data = other.data;
	}

	public void add(Geocache p) {
		Geocache[] temp = new Geocache[data.length + 1];
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}
		temp[data.length] = p;
		data = temp;
	}

	public Geocache removeFromTop() {
		Geocache[] temp = new Geocache[data.length - 1];
		Geocache top = data[0];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = data[i + 1];
		}
		data = temp;
		return top;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("GeocacheList:");
		for (int i = 0; i < data.length - 1; i++) {
			s.append(data[i]);
			s.append(',');
		}
		s.append(data[data.length - 1]);
		return s.toString();
	}
}
