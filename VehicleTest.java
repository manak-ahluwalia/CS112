public class VehicleTest {
	Person p1 = new Person("Manak Ahluwalia");
	Person p2 = new Person("Ahluwalia Manak");
	Vehicle car = new Vehicle("Lamborghini", 8, p1);
	Truck truck = new Truck();
	truck.setManName("Ford");
	truck.setNumCyl(100);
	truck.setPerson(p2);
	truck.setLoadCap(200.00);
	truck.setCapacity(3500);
	System.out.println("Your truck: ");
	System.out.println(truck.getManName());
	System.out.println(truck.getNumCyl());
	System.out.println(truck.getPerson());
	System.out.println(truck.getLoadCap());
	System.out.println(truck.getCapacity() + '\n');
	System.out.println(car);
	System.ot.println(truck);
}