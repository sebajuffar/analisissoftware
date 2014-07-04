import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
	public static final String USER_NAME = "admin";
	public static final String USER_PASS = "passW";
	static Login _frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					_frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(169, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 55, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(35, 27, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(35, 58, 86, 14);
		contentPane.add(lblContrasea);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//Chequeo los parámetros de entrada
				if(textField.getText().compareTo(USER_NAME) == 0 && textField_1.getText().compareTo(USER_PASS) == 0){
					//Estoy logueando bien
					new Editor();
					_frame.setVisible(false);
					
				}else{
					//Mensaje de error
					textField.setText("ERROR EN EL LOGIN");
				}
			}
		});
		btnIngresar.setBounds(317, 23, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Limpio los botones
				textField.setText("");
				textField_1.setText("");
			
			}
		});
		btnLimpiar.setBounds(317, 54, 89, 23);
		contentPane.add(btnLimpiar);
	}
}
