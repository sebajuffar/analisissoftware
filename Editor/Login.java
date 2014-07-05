import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;
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
				String miPass, user;
				miPass = textField_1.getPassword().toString();
				user = textField.getText();
				
				try {
					if(validarDatos(miPass, user)){
						new Editor();
						_frame.setVisible(false);
					}else{
						JOptionPane.showMessageDialog(null, "Datos incorrectos. NO existe usuario y/o pass Incorrecto.");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnIngresar.setBounds(317, 23, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnLimpiar = new JButton("Nuevo");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Limpio los botones
				if(textField.getText().length() != 0 && textField_1.getPassword().length != 0){
					try {
						nuevoUsuario(textField.getText(), textField_1.getPassword().toString());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					JOptionPane.showMessageDialog(null, "Debe especificar Usuario y Pass");
				}
			
			}
		});
		btnLimpiar.setBounds(317, 54, 89, 23);
		contentPane.add(btnLimpiar);
	}
	
	private void nuevoUsuario(String user, String pass) throws IOException{
		//Estoy guardando un usuario nuevo
		File passwd = new File(".//passwd");
		String newUser;
		newUser = user + ":" +  pass + "\n";
		
		FileWriter escribir = new FileWriter(passwd, true);
		escribir.write(newUser);
		
		escribir.close();
		
	}
	
	private boolean validarDatos(String miPass, String user) throws IOException {
		//Valido los datos
		FileReader passwd = new FileReader("passwd");
		BufferedReader lector = new BufferedReader(passwd);
		String leido;
		while((leido = lector.readLine()) != null){
			String [] datos = leido.split(":");
			
			if(datos[0].compareTo(user) == 0){
				//Encontré el usuario
				passwd.close();
				lector.close();
				return verificarPassword(datos[1], miPass);
			}
		}
		
		passwd.close();
		lector.close();
		return false;
		
	}
	
	private boolean verificarPassword(String passS, String passE){
		if(passE.length() > 16 || passE.length() < 4) return false; //Valores entre 4 y 8
		if(passE.compareTo(passE) != 0) return false;
		
		return true;
	}
}
