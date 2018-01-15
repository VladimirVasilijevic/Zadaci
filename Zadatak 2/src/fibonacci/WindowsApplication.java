package fibonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class WindowsApplication {

	private JFrame frame;
	private JTextField textn_th_fibonacci_number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowsApplication window = new WindowsApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowsApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 902, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblZadatak = new JLabel("Zadatak 2:");
		lblZadatak.setBounds(25, 33, 850, 61);
		frame.getContentPane().add(lblZadatak);
		
		JLabel lblUnesi = new JLabel("Unesite redni broj elementa Fibonacijevog niza: ");
		lblUnesi.setBounds(25, 93, 420, 61);
		frame.getContentPane().add(lblUnesi);
		
		JLabel lblFibonacciNumber = new JLabel("");
		lblFibonacciNumber.setForeground(new Color(0, 0, 0));
		lblFibonacciNumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFibonacciNumber.setBounds(15, 240, 838, 272);
		frame.getContentPane().add(lblFibonacciNumber);
		
		textn_th_fibonacci_number = new JTextField();
		textn_th_fibonacci_number.setBounds(508, 110, 300, 26);
		frame.getContentPane().add(textn_th_fibonacci_number);
		textn_th_fibonacci_number.setColumns(10);
		
		JButton btnIspisiFibonacijevBroj = new JButton("Ispisi Fibonacijev broj");
		btnIspisiFibonacijevBroj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n_th_fibonacci_number = Integer.parseInt(textn_th_fibonacci_number.getText());
					if(n_th_fibonacci_number > 0)
					{
						lblFibonacciNumber.setText("fibonacci_series["+ (n_th_fibonacci_number) +"]= "+get_fibonacci_number(n_th_fibonacci_number-1));
					}
					else
					{
						lblFibonacciNumber.setText("Redni broj elementa Fibonacijevog niza mora biti pozitivan broj.");
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					lblFibonacciNumber.setText("Unesi broj.");
				} 
			}
		});
		btnIspisiFibonacijevBroj.setBounds(15, 170, 408, 29);
		frame.getContentPane().add(btnIspisiFibonacijevBroj);
	}
	
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

}
