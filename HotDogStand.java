public class HotDogStand {
	private int id;
	private int hotDogsSold;
	private static int totalSold;

	public HotDogStand() {
		id = 0;
		hotDogsSold = 0;
	}
	public HotDogStand(int standID, int hd) {
		id = standID;
		hotDogsSold = hd;
		totalSold += hd;
	}
	public void justSold() {
		hotDogsSold++;
		totalSold++;
	}
	public int getHotDogsSold() {
		return hotDogsSold;
	}
	public static int getTotalHotDogsSold() {
		return totalSold;
	}
	public int getID() {
		return id;
	}
	public static void main(String[] args) {
		HotDogStand hds1 = new HotDogStand(1, 0);
		HotDogStand hds2 = new HotDogStand(2, 21);
		HotDogStand hds3 = new HotDogStand(3, 100);

		for (int i = 0; i < 3; i++) {
			hds1.justSold();
		}
		System.out.println("Hot Dog Stand " + hds1.getID() + ": " + hds1.getHotDogsSold());
		System.out.println("Hot Dog Stand " + hds2.getID() + ": " + hds2.getHotDogsSold());
		System.out.println("Hot Dog Stand " + hds3.getID() + ": " + hds3.getHotDogsSold());
		System.out.println("Total: " + HotDogStand.getTotalHotDogsSold());



	}
}