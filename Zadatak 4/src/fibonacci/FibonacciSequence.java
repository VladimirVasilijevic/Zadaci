package fibonacci;

public class FibonacciSequence {
    private int m_fibonacci_series[];
    private int m_length_of_fibonacci_series;
    
    public FibonacciSequence(int start_number, int length_of_series)
    {
        // cuvamo duzinu niza jer ce nam biti potrebna pri iteraciji kroz niz
        m_length_of_fibonacci_series = Math.abs(length_of_series);
        // kreiramo niz zadate duzine 
        m_fibonacci_series = new int [m_length_of_fibonacci_series];
        
        int current = 0;
        int next = 1;
        while (true)
        {
            if (current > start_number)
                throw new IllegalArgumentException("Uneti pocetak niza nije Fibonacijev broj");
            if (current == start_number)
                break;
            int temp = next;
            next = current + next;
            current = temp;
        }
        
        if (length_of_series < 0) {
			next -= current;
		}

        for (int i = 0; i < m_length_of_fibonacci_series; i++)
        {
            m_fibonacci_series[i] = current;
            current = next;
            next = length_of_series > 0 ? next + m_fibonacci_series[i] : m_fibonacci_series[i] - next;
            //next += m_fibonacci_series[i];
        }
    }

    public void print()
    {
    	for(int i = 0; i < m_length_of_fibonacci_series; i++) // ispisujemo zadati broj elemenata niza
        {
            System.out.println("fibonacci_series["+ (i + 1) +"]= " + m_fibonacci_series[i]); // ispis fibonacijevog broja
        }
    }
}