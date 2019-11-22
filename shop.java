import java.util.Scanner;

public class shop {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input name of item 1: ");
		String item1 = input.next();
		System.out.println("Input quantity of item 1: ");
		int item1quant = input.nextInt();
		System.out.println("Input price of item 1: ");
		double item1price = input.nextDouble();
		System.out.println("Input name of item 2: ");
		String item2 = input.next();
		System.out.println("Input quantity of item 2: ");
		int item2quant = input.nextInt();
		System.out.println("Input price of item 2: ");
		double item2price = input.nextDouble();
		System.out.println("Input name of item 3: ");
		String item3 = input.next();
		System.out.println("Input quantity of item 3: ");
		int item3quant = input.nextInt();
		System.out.println("Input price of item 3: ");
		double item3price = input.nextDouble();
		double subtotal = item1price + item2price + item3price;
		double tax = subtotal * 0.0625;
		double total = subtotal + tax;

		System.out.println("Your bill: ");
		System.out.printf("%-30s, %-10s, %-10s, %-10s%n", "Item", "Quantity", "Price", "Total");
		System.out.printf("%-30s, %-10s, %-10.2f, %-10.2f%n", item1, item1quant, item1price, item1quant * item1price);
		System.out.printf("%-30s, %-10s, %-10.2f, %-10.2f%n", item2, item2quant, item2price, item2quant * item2price);
		System.out.printf("%-30s, %-10s, %-10.2f, %-10.2f%n", item3, item3quant, item3price, item3quant * item3price);
		System.out.printf("%-30s, %-10s, %-10.2f, %-10.2f%n", "Subtotal", "", "", subtotal);
		System.out.printf("%-30s, %-10s, %-10.2f, %-10.2f%n", "6.25% sales tax", "", "", subtotal * 0.0625);
		System.out.printf("%-30s, %-10s, %-10.2f, %-10.2f%n", "Total", "", "", total);

	}
}