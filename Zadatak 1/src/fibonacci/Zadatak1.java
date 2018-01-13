package fibonacci;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);  // pravimo objekat tipa Scener za citanje unosa sa komandne linije
		int length_of_fibonacci_series = 0; // inicijalno duzina niza je 0
		System.out.println("Unesite duzinu Fibonacijevog niza: "); // ispis poruke na komadnoj liniji
		length_of_fibonacci_series = reader.nextInt(); // skenira sledeci token iz ulza kao int
			
		if(length_of_fibonacci_series >= 0) // proveravamo da li je uneta vrednost u odgovarajucim granicama
		{
			int current_element = 0;
	        int next_element = 1;
	        for(int i = 0; i < length_of_fibonacci_series; i++) // ispisujemo zadati broj elemenata niza
	        {
	            System.out.println("fibonacci_series["+ (i + 1) +"]= " + current_element); // ispis fibonacijevog broja
	            int temp = current_element + next_element;
	            current_element = next_element;
	            next_element = temp;
	        }
			
		}
		else
			System.out.println("Duzina Fibonacijevog niza mora biti pozitivan broj."); // u slucaju da je uneta duzina niza nije u odgovarajucim granicama
			
		reader.close(); // kada vise nema potrebe za skeniranjem ulaza potrebno je zatvoriti Scanner
		
		
	}

}
