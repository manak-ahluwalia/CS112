public class odometer {
	private double omiles;
	private double miles;
	private double mileage;
	private double gallons;

	public odometer(double m, double avg) {
		omiles = m;
		miles = m;
		mileage = avg;
	}
	public double setAverage(double trip) {
		gallons = trip/mileage;
		return gallons;
	}
	public double addMiles(double m) {
		miles = m;
		return setAverage(miles);
	}
	public double reset() {
		miles = 0;
		return setAverage(miles);
	}
	public string toString() {
		return "Trip length: " + miles + " miles trip = " gallons;
	}

	public static void main(String[] args) {
		Odometer o1 = new Odometer(0.0, 0.0);
		Odometer o2 = new Odometer(0.0, 0.0);
		o1.addMiles(50.0);
		System.out.println(o1);
		System.out.println(o2);
	}
}