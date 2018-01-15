package fibonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class WindowsApplication {

	private JFrame frame;
	private JTextField textFildlenght;

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
		frame.setBounds(100, 100, 786, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblZadatak = new JLabel("Zadatak 1:");
		lblZadatak.setBounds(28, 16, 721, 63);
		frame.getContentPane().add(lblZadatak);
		
		textFildlenght = new JTextField();
		textFildlenght.setBounds(309, 81, 146, 26);
		frame.getContentPane().add(textFildlenght);
		textFildlenght.setColumns(10);
		
		JLabel lblUnesiDuzinuFibonacijevog = new JLabel(" Unesi duzinu Fibonacijevog niza:");
		lblUnesiDuzinuFibonacijevog.setBounds(25, 83, 258, 23);
		frame.getContentPane().add(lblUnesiDuzinuFibonacijevog);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 224, 417, 231);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPaneFibonacciSequence = new JTextPane();
		scrollPane.setViewportView(textPaneFibonacciSequence);
		
		JButton btnIsoisiFibonacijevNiz = new JButton("Ispisi Fibonacijev niz");
		btnIsoisiFibonacijevNiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int length_of_fibonacci_series = Integer.parseInt(textFildlenght.getText());
						
					if(length_of_fibonacci_series >= 0) // proveravamo da li je uneta vrednost u odgovarajucim granicama
					{
						int current_element = 0;
					    int next_element = 1;
					    
					    String text = new String("");
					    for(int i = 0; i < length_of_fibonacci_series; i++) // ispisujemo zadati broj elemenata niza
					    {
					    	String fibonacci_number = new String("fibonacci_series["+ (i + 1) +"]= " + current_element + "\n");
					    	text = text.concat(fibonacci_number);
					        int temp = current_element + next_element;
					        current_element = next_element;
					        next_element = temp;
					    }
					    textPaneFibonacciSequence.setText(text);
					}
					else {
						textPaneFibonacciSequence.setText("Duzina Fibonacijevog niza mora biti pozitivan broj.");
					}
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					textPaneFibonacciSequence.setText("Unesi broj.");
				}
			}
		});
		btnIsoisiFibonacijevNiz.setBounds(28, 143, 255, 29);
		frame.getContentPane().add(btnIsoisiFibonacijevNiz);
	}
}
