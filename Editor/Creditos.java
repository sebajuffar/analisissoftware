import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Creditos extends JFrame {

	private JPanel contentPane;
	public static Creditos _frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_frame = new Creditos();
					_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Creditos() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 548, 92);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdaptaciones = new JLabel("Adaptaciones");
		lblAdaptaciones.setBounds(206, 11, 126, 14);
		contentPane.add(lblAdaptaciones);
		
		JLabel lblNogueirasJorge = new JLabel("Nogueiras, Jorge  - Juffar, Sebastian - Culen, Fernando - Garcia Alves, Pablo");
		lblNogueirasJorge.setBounds(10, 36, 512, 14);
		contentPane.add(lblNogueirasJorge);
		setVisible(true);
	}

}
