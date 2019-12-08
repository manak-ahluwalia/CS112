public class Truck extends Vehicle {
	double lc;
	int cap;

	public Truck() {
		super();
		lc = 0;
		cap = 0;
	}

	public Truck(String m, int c, Person p, double l, int capac) {
		super(m,c,p);
		lc = l;
		cap = capac;
	}

	public Truck(Truck t) {
		super(t);
		lc = t.lc;
		cap = t.cap;
	}

	public void setLoadCap(double l) {
		lc = l;
	}

	public double getLoadCap() {
		return lc;
	}

	public void setCapacity(int capac) {
		cap = capac;
	}

	public int getCapacity() {
		return cap;
	}

	public String toString() {
		return super.toString() + ", " + lc + " lbs load capacity, " + cap + " tow";
	}

	public boolean equals(Truck t) {
		if (super.equals(t) && lc == t.lc && cap == t.cap) {
			return true;
		}
		else {
			return false;
		}
	}
}