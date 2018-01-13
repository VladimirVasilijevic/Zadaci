package fibonacci;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kao u prethodnim zadacima
		try {
			Scanner reader = new Scanner(System.in);
		
			System.out.println("Unesite Fibonacijevog broj i duzinu niza: ");
			/*
			 * Primeri za negativnu duzinu:
			 * Fibonacijevog broj: 2 duzinu niza: -7
			 * 	fibonacci_series[1]= 2
				fibonacci_series[2]= 1
				fibonacci_series[3]= 1
				fibonacci_series[4]= 0
				fibonacci_series[5]= 1
				fibonacci_series[6]= -1
				fibonacci_series[7]= 2
			 * */
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
