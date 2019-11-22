import java.util.Scanner;

public class AirplaneSeats {
	public static void display(char[][] plane) {
		for (int i = 0; i < plane.length; i++) {
			System.out.print((i + 1) + " ");
			for (int j = 0; j < plane[i].length; j++) {
				System.out.print(plane[i][j] + " ");
			}
			System.out.print('\n');
		}
	}
	public static int getRow(String seat) {
		char row = seat.charAt(0);
		return (int) row - 48 - 1;
	}
	public static int getColumn(String seat) {
		char column = seat.charAt(1);
		if (column == 'A') {
			return 0;
		}
		else if (column == 'B') {
			return 1;
		}
		else if (column == 'C') {
			return 2;
		}
		else if (column == 'D') {
			return 3;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		char[][] plane = {{'A', 'B', 'C', 'D'},
							{'A', 'B', 'C', 'D'},
							{'A', 'B', 'C', 'D'},
							{'A', 'B', 'C', 'D'},
							{'A', 'B', 'C', 'D'},
							{'A', 'B', 'C', 'D'},
							{'A', 'B', 'C', 'D'}};
		Scanner input = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			display(plane);
			System.out.println("Enter a seat (i.e. 1A, 2B, 3C, 4D): ");
			boolean available = false;
			while (available == false) {
				String seat = input.next();
				int r = getRow(seat);
				int c = getColumn(seat);
				if (plane[r][c] == 'X') {
					System.out.println("Sorry that seat is already taken/not available.");
				}
				else {
					plane[r][c] = 'X';
					available = true;
				}
			}
			System.out.println("Continue? (y/n): ");
			choice = input.next();
		}
	}
}