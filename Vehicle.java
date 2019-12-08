public class Vehicle {
	String man_name;
	int numCyl;
	Person person;

	public Vehicle() {
		man_name = "";
		numCyl = 1;
		person = null;
	}

	public Vehicle(String m, int c, Person p) {
		man_name = m;
		numCyl = c;
		person = new Person(p);
	}

	public Vehicle(Vehicle v) {
		man_name = v.man_name;
		numCyl = v.numCyl;
		person = new Person(v.person);
	}

	public void setManName(String m) {
		man_name = m;
	}

	public String getManName() {
		return man_name;
	}

	public void setNumCyl(int c) {
		numCyl = c;
	}

	public int getNumCyl() {
		return numCyl;
	}

	public void setPerson(Person p) {
		person = new Person(p);
	}
	
	public Person getPerson() {
		return person;
	}

	public String toString() {
		return man_name + ", " + numCyl + "cd \nOwned by: " + person; 
	}

	public boolean equals(Vehicle v) {
		if (man_name.equals(v.man_name) && numCyl == v.numCyl) {
			return true;
		}
		else {
			return false;
		}
	}

}