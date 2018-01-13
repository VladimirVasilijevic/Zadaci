package fibonacci;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kao u prethodnim zadacima
		try {
			Scanner reader = new Scanner(System.in);
		
			System.out.println("Unesite Fibonacijevog broj i duzinu niza: ");
			int fibonacci_series_number = reader.nextInt();
			int length_of_fibonacci_series = reader.nextInt();
			reader.close();
		
			FibonacciSequence fibonacci_sequence = new FibonacciSequence(fibonacci_series_number, length_of_fibonacci_series);
			fibonacci_sequence.print();
				
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
