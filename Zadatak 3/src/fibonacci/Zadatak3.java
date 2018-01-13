package fibonacci;

import java.util.Scanner;

import org.json.JSONObject;

public class Zadatak3 {

    private static int read_length()
    {
        // slucno ako i u prethodnim zadacima radimo proveru da li je korisnik uneo dozvoljenu vrednost
        // s tim sto sada kreiramo objekat FibonacciSequence koji ce nam preko metode get_json vratiti JSONObject
        // koji mozemo ispisati na standardnom izlazu
        Scanner reader = new Scanner(System.in);
        System.out.println("Unesite duzinu Fibonacijevog niza: ");
        int length_of_fibonacci_series = reader.nextInt(); // Scans the next token of the input as an int.
        reader.close();
        
        return length_of_fibonacci_series;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
			int length_of_fibonacci_series = read_length();
			FibonacciSequence fibonacci_sequence = new FibonacciSequence(length_of_fibonacci_series);
			JSONObject jsonObject = fibonacci_sequence.get_json(); // poziv metode get_json koja vraca JSONObject
			System.out.println(jsonObject); // ispis niza u trazenom obliku na standardnom izlazu
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
    }
}