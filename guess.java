import java.util.Scanner;

public class guess {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double n = input.nextDouble();
		double guess = n/2;
		double r;
		for (int i = 1; i < 5; i++) {
			r = n/guess;
			guess = (guess + r)/2;
		}
		System.out.println("Answer is " + guess);
	}
}