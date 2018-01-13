package fibonacci;

//import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FibonacciSequence {
    private int m_fibonacci_series[];
    private int m_length_of_fibonacci_series;
    
    private final int c_min_length = 1;
    /*konstruktor 
     * poziva se pri kreiranju objekta*/
    public FibonacciSequence(int length_of_series) 
    {
        if(length_of_series < c_min_length) // provera duzine niza
        {
            // ako je duzina niza nije dozvoljena baca se izuzetak tipa IllegalArgumentException
            throw new IllegalArgumentException("Duzina niza mora da bude veca od nula");
        }
        else
        {
            // cuvamo duzinu niza jer ce nam biti potrebna pri iteraciji kroz niz
            m_length_of_fibonacci_series = length_of_series;
            // kreiramo niz zadate duzine 
            m_fibonacci_series = new int [length_of_series];
            m_fibonacci_series[0] = 0;
            if (length_of_series > 1)
                m_fibonacci_series[1] = 1;
            // racunamo i upisujemo fibonacijeve brojeve u niz
            for(int i = 2; i < length_of_series; i++)
            {
                m_fibonacci_series[i] = m_fibonacci_series[i - 1] + m_fibonacci_series[i - 2];
            }
        }
    }
    
    // da bi smo izracunali sumu niza potrebno je proci kroz ceo niz i sabrati sve elemente niza
    private int sum()
    {
        int sum = 0;
        for (int i = 0; i < m_length_of_fibonacci_series; i++) {
            sum += m_fibonacci_series[i]; // na sumu prethodnih elemenata dodajemo tekuci element
        }
        return sum;
    }
    
    private int number_of_even()
    {
        // posto je kod Fibnacijevog niza svaki treci element paran pocev od prvog ne moramo da iteriramo kroz ceo niz 
        // i da za svaki element proveravamo da li je paran
        // svaki treci element je paran jer je 
        // parn+neparan=neparan
        // neparan+neparan = paran
        // a prva dva elementa pomocu kojih se dalje racuna su 0(paran) i 1(neparan)
        return m_length_of_fibonacci_series / 3 + 1;
    }
    
    private int number_of_odd()
    {
        // od ukupnog broja elemenata oduzmemo sve parne i dobijamo broj neparnih brojeva
        return m_length_of_fibonacci_series - number_of_even();
    }
    
    public JSONObject get_json()
    {
        // kreiramo novi JSONObject
        JSONObject obj = new JSONObject();
        
        //JSONArray list = new JSONArray();
        //list.put(m_fibonacci_series);
        
        // posto metoda put moze da baci izuzetak potrebno je uhatiti ga sa try catch blokom
        try {
            // u JSONObject obj potrebno je staviti niz, sumu, broj parnih i broj neparnih brojeva
            // to radimo pomocu metode put
            // za izradu ovog zadatka koriscena je biblioteka java-json.jar za eclipse
            obj.put("fibonacci series", m_fibonacci_series);
            obj.put("sum", sum());
            obj.put("even", number_of_even());
            obj.put("odd", number_of_odd());
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return obj;
    }
}