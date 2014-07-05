import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


public class Creditos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creditos frame = new Creditos();
					frame.setVisible(true);
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
		setBounds(100, 100, 450, 92);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdaptaciones = new JLabel("Adaptaciones");
		lblAdaptaciones.setBounds(10, 11, 126, 14);
		contentPane.add(lblAdaptaciones);
		
		JLabel lblNogueirasJorge = new JLabel("Nogueiras, Jorge  - Juffar, Sebastian - Culen, Fernando - Garcia Alves, Pablo");
		lblNogueirasJorge.setBounds(10, 36, 414, 14);
		contentPane.add(lblNogueirasJorge);
	}

}
