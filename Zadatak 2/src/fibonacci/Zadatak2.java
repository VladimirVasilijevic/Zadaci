package fibonacci;

import java.util.Scanner;

public class Zadatak2 {
    
    private static int get_fibonacci_number(int n)
    {
        int current = 0;
        int next = 1;
        for (int i = 0; i < n; i++)
        {
            int temp = next;
            next = current + next;
            current = temp;
        }
        return current;
    }
    
    public static void main (String args[])
    {
        // isto kao u prvom zadatku 
        // citanje i provera da li je uneta vrednost dozvoljena 
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Unesite redni broj elementa Fibonacijevog niza: ");
        int n_th_fibonacci_number = reader.nextInt(); // Scans the next token of the input as an int.
        if(n_th_fibonacci_number > 0)
        {
        	System.out.println(get_fibonacci_number(n_th_fibonacci_number-1));
        }
        else
        {
        	System.out.println("Redni broj elementa Fibonacijevog niza mora biti pozitivan broj.");
        }  
        reader.close();
    }
}
