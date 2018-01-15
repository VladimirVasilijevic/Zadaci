package fibonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.json.JSONObject;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class WindowsApplication {

	private JFrame frame;
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
		frame.setBounds(100, 100, 960, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblZadatak = new JLabel("Zadatak 3");
		lblZadatak.setBounds(25, 10, 908, 54);
		frame.getContentPane().add(lblZadatak);
		
		JLabel lblUnesiDuzinuFibonacijevog = new JLabel("Unesi duzinu Fibonacijevog niza:");
		lblUnesiDuzinuFibonacijevog.setBounds(25, 80, 447, 54);
		frame.getContentPane().add(lblUnesiDuzinuFibonacijevog);
		
		textFieldLenght = new JTextField();
		textFieldLenght.setBounds(419, 94, 423, 26);
		frame.getContentPane().add(textFieldLenght);
		textFieldLenght.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 273, 377, 281);
		frame.getContentPane().add(scrollPane);
		
		JTextPane textPaneJSON = new JTextPane();
		scrollPane.setViewportView(textPaneJSON);
		
		JButton btnIspisiJsonFormat = new JButton("Ispisi JSON format ");
		btnIspisiJsonFormat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int length_of_fibonacci_series = Integer.parseInt(textFieldLenght.getText());
					FibonacciSequence fibonacci_sequence = new FibonacciSequence(length_of_fibonacci_series);
					JSONObject jsonObject = fibonacci_sequence.get_json(); // poziv metode get_json koja vraca JSONObject
					textPaneJSON.setText(jsonObject.toString()); // ispis niza u trazenom obliku na standardnom izlazu
				} catch (NumberFormatException nfe) {
					// TODO: handle exception
					textPaneJSON.setText("Unesite broj.");
				}catch (Exception e1) {
					// TODO Auto-generated catch block
					textPaneJSON.setText(e1.getMessage());
					//e1.printStackTrace();
				}
			}
		});
		btnIspisiJsonFormat.setBounds(25, 174, 396, 29);
		frame.getContentPane().add(btnIspisiJsonFormat);
	}

}
