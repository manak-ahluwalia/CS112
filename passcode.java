import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


public class passcode {
	public static boolean block(int[] password, int[] pin) {
		for (int i = 0; i < password.length; i++) {
			for (int j = 0; j < pin.length; j++) {
				int digit = pin[j];
				if (password[i] == pin.indexOf(digit)); 
			}
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int[] password = {1, 2, 3, 4, 5};
		int pin[]	= new int[10];
		for (int i = 0; i < pin.length; i++) {
			pin[i] = rand.nextInt(3) + 1;
		}
		System.out.print("Digit: ");
		for (int i = 0; i < pin.length; i++) {
			System.out.print(i + " ");
		}
		System.out.print('\n');
		System.out.print("PIN:   ");
		for (int i = 0; i < pin.length; i++) {
			System.out.print(pin[i] + " ");
		}

		// have user input pin and then validate pin

		System.out.print('\n');
		System.out.print("Enter your pin: ");
		String code = input.next();

		if (block(password, pin) == true) {
			System.out.println("Invalid pin!");
		}
		else {
			System.out.println("Valid pin!");
		}
	}
}