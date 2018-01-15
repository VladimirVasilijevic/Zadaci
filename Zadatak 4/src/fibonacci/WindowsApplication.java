package fibonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class WindowsApplication {

	private JFrame frame;
	private JTextField textFieldFibonacciNumber;
	private JTextField textFieldLenght;

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
		frame.setBounds(100, 100, 1012, 687);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblZadatak = new JLabel("Zadatak 4");
		lblZadatak.setBounds(15, 16, 960, 71);
		frame.getContentPane().add(lblZadatak);
		
		JLabel lblNewLabel = new JLabel("Unesi Fibonacijev broj:");
		lblNewLabel.setBounds(15, 103, 366, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUnesiDuzinu = new JLabel("Unesi koliko se broji od Fibonacijevog broja:");
		lblUnesiDuzinu.setBounds(15, 183, 366, 40);
		frame.getContentPane().add(lblUnesiDuzinu);
		
		textFieldFibonacciNumber = new JTextField();
		textFieldFibonacciNumber.setBounds(467, 110, 146, 26);
		frame.getContentPane().add(textFieldFibonacciNumber);
		textFieldFibonacciNumber.setColumns(10);
		
		textFieldLenght = new JTextField();
		textFieldLenght.setBounds(467, 190, 146, 26);
		frame.getContentPane().add(textFieldLenght);
		textFieldLenght.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 318, 505, 273);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPaneSequence = new JTextPane();
		scrollPane.setViewportView(textPaneSequence);
		
		JButton btnNewButton = new JButton("Ispisi niz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
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
					int fibonacci_series_number = Integer.parseInt(textFieldFibonacciNumber.getText());
					int length_of_fibonacci_series = Integer.parseInt(textFieldLenght.getText());
				
					FibonacciSequence fibonacci_sequence = new FibonacciSequence(fibonacci_series_number, length_of_fibonacci_series);
					textPaneSequence.setText(fibonacci_sequence.toString());
						
				} catch (NumberFormatException nfe) {
					// TODO: handle exception
					textPaneSequence.setText("Unesite broj.");
				}catch (IllegalArgumentException e1) {
					// TODO: handle exception
					textPaneSequence.setText(e1.getMessage());
				}
			}
		});
		btnNewButton.setBounds(15, 248, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		
	}

}
