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
	public static Login _frame;

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
		lblUsuario.setBounds(35, 27, 86, 14);
		contentPane.add(lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase�a:");
		lblContrasea.setBounds(35, 58, 86, 14);
		contentPane.add(lblContrasea);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Chequeo los par�metros de entrada
				String miPass, user;
				miPass = new String(textField_1.getPassword());
				user = textField.getText();

				if (validarDatos(miPass, user)) {
					new Editor();
					_frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Datos incorrectos. Usuario o contraseña incorrecta.");
				}
			}
		});
		btnIngresar.setBounds(317, 23, 89, 23);
		contentPane.add(btnIngresar);

		JButton btnLimpiar = new JButton("Nuevo");
		btnLimpiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// Limpio los botones
				if (textField.getText().length() != 0 && textField_1.getPassword().length != 0) {
					String user = textField.getText();
					if(validarUsuario(user)){
							try {
								String pass = new String(textField_1.getPassword());
								nuevoUsuario(textField.getText(), pass);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}else{
					JOptionPane.showMessageDialog(null, "Usuario Incorrecto. El usuario debe tener sólo números y/o letras y no más de 16 caracteres");	
					}
				} else {
					JOptionPane.showMessageDialog(null, "Debe especificar Usuario y Pass");
				}

			}
		});
		btnLimpiar.setBounds(317, 54, 89, 23);
		contentPane.add(btnLimpiar);
	}

	private void nuevoUsuario(String user, String pass) throws IOException {
		// Estoy guardando un usuario nuevo
		if(pass.length() < 4 || pass.length() > 8){
			JOptionPane.showMessageDialog(null, "La contrase�a debe tener entre 4 y 8 caracteres y poseer solo número y/o letras.");
		}else{
			File passwd = new File(".//passwd");
			String newUser;
			newUser = user + ":" + pass + "\n";

			FileWriter escribir = new FileWriter(passwd, true);
			escribir.write(newUser);

			escribir.close();
		}

	}

	private boolean validarDatos(String miPass, String user) {
		// Valido los datos
		FileReader passwd = null;
		BufferedReader lector = null;
		try {
			passwd = new FileReader("passwd");
			lector = new BufferedReader(passwd);
			String leido;
			while ((leido = lector.readLine()) != null) {
				String[] datos = leido.split(":");

				if (datos[0].compareTo(user) == 0) {
					// Encontr� el usuario
					passwd.close();
					lector.close();
					return verificarPassword(datos[1], miPass);
				}
			}
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "No se ha creado ning�n usuario a�n, por favor cree uno antes de continuar.");

			try {
				passwd.close();
				lector.close();
			} catch (IOException e1) {
				JOptionPane.showMessageDialog(null, "Ocurri� un error al cerrar los archivos.");
			}
		}
		return false;
	}

	private boolean verificarPassword(String passS, String passE) {
		if (passE.length() > 4 && passE.length() < 8 && passS.compareTo(passE) == 0){
			return true;
		}else
			return false;
	}

	private boolean validarUsuario(String user){
		if(user.length() <= 16){
//			char [] letras = user.toCharArray();
			for(int i = 0; i< user.length(); i++){
				if(!Character.isLetter(user.charAt(i)) || !Character.isLetter(user.charAt(i)))
					return false;
			}
			return true;
		}
		return false;
	}
}
