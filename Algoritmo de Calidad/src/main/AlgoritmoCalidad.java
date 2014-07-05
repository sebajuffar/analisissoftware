package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AlgoritmoCalidad extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlgoritmoCalidad frame = new AlgoritmoCalidad();
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
	public AlgoritmoCalidad() {
		setTitle("Algoritmo de Calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FUNCIONALIDAD");
		lblNewLabel.setBounds(29, 11, 208, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEficiencia = new JLabel("EFICIENCIA");
		lblEficiencia.setBounds(29, 82, 208, 14);
		contentPane.add(lblEficiencia);
		
		JLabel lblFiabilidad = new JLabel("FIABILIDAD");
		lblFiabilidad.setBounds(29, 148, 208, 14);
		contentPane.add(lblFiabilidad);
		
		JLabel lblMantenibilidad = new JLabel("MANTENIBILIDAD");
		lblMantenibilidad.setBounds(29, 215, 208, 14);
		contentPane.add(lblMantenibilidad);
		
		JLabel lblUsabilidad = new JLabel("USABILIDAD");
		lblUsabilidad.setBounds(29, 281, 208, 14);
		contentPane.add(lblUsabilidad);
		
		JLabel lblPortabilidad = new JLabel("PORTABILIDAD");
		lblPortabilidad.setBounds(29, 369, 208, 14);
		contentPane.add(lblPortabilidad);
		
		JLabel lblExactitud = new JLabel("Exactitud");
		lblExactitud.setBounds(29, 36, 46, 14);
		contentPane.add(lblExactitud);
		
		JCheckBox chckbxBueno = new JCheckBox("Bueno");
		chckbxBueno.setBounds(232, 31, 55, 23);
		contentPane.add(chckbxBueno);
		
		JCheckBox chckbxRegular = new JCheckBox("Regular");
		chckbxRegular.setBounds(289, 31, 63, 23);
		contentPane.add(chckbxRegular);
		
		JCheckBox chckbxMalo = new JCheckBox("Malo");
		chckbxMalo.setBounds(354, 30, 56, 23);
		contentPane.add(chckbxMalo);
		
		JLabel lblSeguridadDeAcceso = new JLabel("Seguridad de Acceso");
		lblSeguridadDeAcceso.setBounds(29, 57, 124, 14);
		contentPane.add(lblSeguridadDeAcceso);
		
		JCheckBox checkBox_10 = new JCheckBox("Bueno");
		checkBox_10.setBounds(232, 52, 55, 23);
		contentPane.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("Regular");
		checkBox_11.setBounds(289, 52, 63, 23);
		contentPane.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("Malo");
		checkBox_12.setBounds(354, 51, 56, 23);
		contentPane.add(checkBox_12);
		
		JLabel lblUsoDelProcesador = new JLabel("Uso del Procesador");
		lblUsoDelProcesador.setBounds(29, 102, 153, 14);
		contentPane.add(lblUsoDelProcesador);
		
		JCheckBox checkBox = new JCheckBox("Bueno");
		checkBox.setBounds(232, 97, 55, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("Regular");
		checkBox_1.setBounds(289, 97, 63, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_13 = new JCheckBox("Malo");
		checkBox_13.setBounds(354, 96, 56, 23);
		contentPane.add(checkBox_13);
		
		JLabel lblComportamientoEnEl = new JLabel("Comportamiento en el tiempo");
		lblComportamientoEnEl.setBounds(29, 123, 197, 14);
		contentPane.add(lblComportamientoEnEl);
		
		JCheckBox checkBox_14 = new JCheckBox("Bueno");
		checkBox_14.setBounds(232, 118, 55, 23);
		contentPane.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("Regular");
		checkBox_15.setBounds(289, 118, 63, 23);
		contentPane.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("Malo");
		checkBox_16.setBounds(354, 117, 56, 23);
		contentPane.add(checkBox_16);
		
		JLabel lblToleranciaAFallos = new JLabel("Tolerancia a Fallos");
		lblToleranciaAFallos.setBounds(29, 169, 139, 14);
		contentPane.add(lblToleranciaAFallos);
		
		JCheckBox checkBox_2 = new JCheckBox("Bueno");
		checkBox_2.setBounds(232, 164, 55, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("Regular");
		checkBox_3.setBounds(289, 164, 63, 23);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_17 = new JCheckBox("Malo");
		checkBox_17.setBounds(354, 163, 56, 23);
		contentPane.add(checkBox_17);
		
		JLabel lblRecuperacinDeErrores = new JLabel("Recuperaci\u00F3n de Errores");
		lblRecuperacinDeErrores.setBounds(29, 190, 124, 14);
		contentPane.add(lblRecuperacinDeErrores);
		
		JCheckBox checkBox_18 = new JCheckBox("Bueno");
		checkBox_18.setBounds(232, 185, 55, 23);
		contentPane.add(checkBox_18);
		
		JCheckBox checkBox_19 = new JCheckBox("Regular");
		checkBox_19.setBounds(289, 185, 63, 23);
		contentPane.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("Malo");
		checkBox_20.setBounds(354, 184, 56, 23);
		contentPane.add(checkBox_20);
		
		JLabel lblCapacidadDelCdigo = new JLabel("Capacidad del C\u00F3digo de ser analizado");
		lblCapacidadDelCdigo.setBounds(29, 235, 197, 14);
		contentPane.add(lblCapacidadDelCdigo);
		
		JCheckBox checkBox_4 = new JCheckBox("Bueno");
		checkBox_4.setBounds(232, 230, 55, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("Regular");
		checkBox_5.setBounds(289, 230, 63, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_21 = new JCheckBox("Malo");
		checkBox_21.setBounds(354, 229, 56, 23);
		contentPane.add(checkBox_21);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad");
		lblEstabilidad.setBounds(29, 256, 124, 14);
		contentPane.add(lblEstabilidad);
		
		JCheckBox checkBox_22 = new JCheckBox("Bueno");
		checkBox_22.setBounds(232, 251, 55, 23);
		contentPane.add(checkBox_22);
		
		JCheckBox checkBox_23 = new JCheckBox("Regular");
		checkBox_23.setBounds(289, 251, 63, 23);
		contentPane.add(checkBox_23);
		
		JCheckBox checkBox_24 = new JCheckBox("Malo");
		checkBox_24.setBounds(354, 250, 56, 23);
		contentPane.add(checkBox_24);
		
		JLabel lblSerComprendido = new JLabel("Ser Comprendido");
		lblSerComprendido.setBounds(29, 301, 197, 14);
		contentPane.add(lblSerComprendido);
		
		JCheckBox checkBox_6 = new JCheckBox("Bueno");
		checkBox_6.setBounds(232, 296, 55, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("Regular");
		checkBox_7.setBounds(289, 296, 63, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox checkBox_25 = new JCheckBox("Malo");
		checkBox_25.setBounds(354, 295, 56, 23);
		contentPane.add(checkBox_25);
		
		JLabel lblOperable = new JLabel("Operable");
		lblOperable.setBounds(29, 322, 124, 14);
		contentPane.add(lblOperable);
		
		JCheckBox checkBox_26 = new JCheckBox("Bueno");
		checkBox_26.setBounds(232, 317, 55, 23);
		contentPane.add(checkBox_26);
		
		JCheckBox checkBox_27 = new JCheckBox("Regular");
		checkBox_27.setBounds(289, 317, 63, 23);
		contentPane.add(checkBox_27);
		
		JCheckBox checkBox_28 = new JCheckBox("Malo");
		checkBox_28.setBounds(354, 316, 56, 23);
		contentPane.add(checkBox_28);
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad");
		lblAdaptabilidad.setBounds(29, 386, 46, 14);
		contentPane.add(lblAdaptabilidad);
		
		JCheckBox checkBox_8 = new JCheckBox("Bueno");
		checkBox_8.setBounds(232, 381, 55, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("Regular");
		checkBox_9.setBounds(289, 381, 63, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_29 = new JCheckBox("Malo");
		checkBox_29.setBounds(354, 380, 56, 23);
		contentPane.add(checkBox_29);
		
		JLabel lblPortabilidad_1 = new JLabel("Portabilidad");
		lblPortabilidad_1.setBounds(29, 407, 124, 14);
		contentPane.add(lblPortabilidad_1);
		
		JCheckBox checkBox_30 = new JCheckBox("Bueno");
		checkBox_30.setBounds(232, 402, 55, 23);
		contentPane.add(checkBox_30);
		
		JCheckBox checkBox_31 = new JCheckBox("Regular");
		checkBox_31.setBounds(289, 402, 63, 23);
		contentPane.add(checkBox_31);
		
		JCheckBox checkBox_32 = new JCheckBox("Malo");
		checkBox_32.setBounds(354, 401, 56, 23);
		contentPane.add(checkBox_32);
		
		JLabel lblAtractivo = new JLabel("Atractivo");
		lblAtractivo.setBounds(29, 344, 124, 14);
		contentPane.add(lblAtractivo);
		
		JCheckBox checkBox_33 = new JCheckBox("Bueno");
		checkBox_33.setBounds(232, 339, 55, 23);
		contentPane.add(checkBox_33);
		
		JCheckBox checkBox_34 = new JCheckBox("Regular");
		checkBox_34.setBounds(289, 339, 63, 23);
		contentPane.add(checkBox_34);
		
		JCheckBox checkBox_35 = new JCheckBox("Malo");
		checkBox_35.setBounds(354, 338, 56, 23);
		contentPane.add(checkBox_35);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(29, 439, 89, 23);
		contentPane.add(btnVerificar);
		
		JLabel lblFdafdasf = new JLabel("<replace for HTML>");
		lblFdafdasf.setBounds(211, 443, 174, 14);
		contentPane.add(lblFdafdasf);
	}
}
