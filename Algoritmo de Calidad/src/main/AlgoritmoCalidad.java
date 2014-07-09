package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AlgoritmoCalidad extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox f_e_bueno;
	private JCheckBox f_e_regular;
	private JCheckBox f_e_malo;
	private JCheckBox f_s_bueno;
	private JCheckBox f_s_regular;
	private JCheckBox f_s_malo;
	private JCheckBox e_u_bueno;
	private JCheckBox e_u_regular;
	private JCheckBox e_u_malo;
	private JCheckBox e_c_bueno;
	private JCheckBox e_c_regular;
	private JCheckBox e_c_malo;
	private JCheckBox f_t_bueno;
	private JCheckBox f_t_regular;
	private JCheckBox f_t_malo;
	private JCheckBox f_r_bueno;
	private JCheckBox f_r_regular;
	private JCheckBox f_r_malo;
	private JCheckBox m_c_bueno;
	private JCheckBox m_c_regular;
	private JCheckBox m_c_malo;
	private JCheckBox m_e_bueno;
	private JCheckBox m_e_regular;
	private JCheckBox m_e_malo;
	private JCheckBox u_s_bueno;
	private JCheckBox u_s_regular;
	private JCheckBox u_s_malo;
	private JCheckBox u_o_bueno;
	private JCheckBox u_o_regular;
	private JCheckBox u_o_malo;
	private JCheckBox u_a_bueno;
	private JCheckBox u_a_regular;
	private JCheckBox u_a_malo;
	private JCheckBox p_a_bueno;
	private JCheckBox p_a_regular;
	private JCheckBox p_a_malo;
	private JCheckBox p_p_bueno;
	private JCheckBox p_p_regular;
	private JCheckBox p_p_malo;

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
		setResizable(false);
		setTitle("Algoritmo de Calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 511);
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
		lblExactitud.setBounds(29, 36, 140, 14);
		contentPane.add(lblExactitud);
		
		f_e_bueno = new JCheckBox("Bueno");
		f_e_bueno.setBounds(327, 36, 77, 23);
		contentPane.add(f_e_bueno);
		
		f_e_regular = new JCheckBox("Regular");
		f_e_regular.setBounds(406, 37, 76, 23);
		contentPane.add(f_e_regular);
		
		f_e_malo = new JCheckBox("Malo");
		f_e_malo.setBounds(484, 36, 56, 23);
		contentPane.add(f_e_malo);
		
		JLabel lblSeguridadDeAcceso = new JLabel("Seguridad de Acceso");
		lblSeguridadDeAcceso.setBounds(29, 57, 124, 14);
		contentPane.add(lblSeguridadDeAcceso);
		
		f_s_bueno = new JCheckBox("Bueno");
		f_s_bueno.setBounds(327, 57, 77, 23);
		contentPane.add(f_s_bueno);
		
		f_s_regular = new JCheckBox("Regular");
		f_s_regular.setBounds(406, 58, 76, 23);
		contentPane.add(f_s_regular);
		
		f_s_malo = new JCheckBox("Malo");
		f_s_malo.setBounds(484, 57, 56, 23);
		contentPane.add(f_s_malo);
		
		JLabel lblUsoDelProcesador = new JLabel("Uso del Procesador");
		lblUsoDelProcesador.setBounds(29, 102, 153, 14);
		contentPane.add(lblUsoDelProcesador);
		
		e_u_bueno = new JCheckBox("Bueno");
		e_u_bueno.setBounds(327, 102, 77, 23);
		contentPane.add(e_u_bueno);
		
		e_u_regular = new JCheckBox("Regular");
		e_u_regular.setBounds(406, 103, 76, 23);
		contentPane.add(e_u_regular);
		
		e_u_malo = new JCheckBox("Malo");
		e_u_malo.setBounds(484, 102, 56, 23);
		contentPane.add(e_u_malo);
		
		JLabel lblComportamientoEnEl = new JLabel("Comportamiento en el tiempo");
		lblComportamientoEnEl.setBounds(29, 123, 197, 14);
		contentPane.add(lblComportamientoEnEl);
		
		e_c_bueno = new JCheckBox("Bueno");
		e_c_bueno.setBounds(327, 123, 77, 23);
		contentPane.add(e_c_bueno);
		
		e_c_regular = new JCheckBox("Regular");
		e_c_regular.setBounds(406, 124, 76, 23);
		contentPane.add(e_c_regular);
		
		e_c_malo = new JCheckBox("Malo");
		e_c_malo.setBounds(484, 123, 56, 23);
		contentPane.add(e_c_malo);
		
		JLabel lblToleranciaAFallos = new JLabel("Tolerancia a Fallos");
		lblToleranciaAFallos.setBounds(29, 169, 153, 14);
		contentPane.add(lblToleranciaAFallos);
		
		f_t_bueno = new JCheckBox("Bueno");
		f_t_bueno.setBounds(327, 169, 77, 23);
		contentPane.add(f_t_bueno);
		
		f_t_regular = new JCheckBox("Regular");
		f_t_regular.setBounds(406, 170, 76, 23);
		contentPane.add(f_t_regular);
		
		f_t_malo = new JCheckBox("Malo");
		f_t_malo.setBounds(484, 169, 56, 23);
		contentPane.add(f_t_malo);
		
		JLabel lblRecuperacinDeErrores = new JLabel("Recuperaci\u00F3n de Errores");
		lblRecuperacinDeErrores.setBounds(29, 190, 179, 14);
		contentPane.add(lblRecuperacinDeErrores);
		
		f_r_bueno = new JCheckBox("Bueno");
		f_r_bueno.setBounds(327, 190, 77, 23);
		contentPane.add(f_r_bueno);
		
		f_r_regular = new JCheckBox("Regular");
		f_r_regular.setBounds(406, 191, 76, 23);
		contentPane.add(f_r_regular);
		
		f_r_malo = new JCheckBox("Malo");
		f_r_malo.setBounds(484, 190, 56, 23);
		contentPane.add(f_r_malo);
		
		JLabel lblCapacidadDelCdigo = new JLabel("Capacidad del C\u00F3digo de ser analizado");
		lblCapacidadDelCdigo.setBounds(29, 235, 253, 14);
		contentPane.add(lblCapacidadDelCdigo);
		
		m_c_bueno = new JCheckBox("Bueno");
		m_c_bueno.setBounds(327, 235, 77, 23);
		contentPane.add(m_c_bueno);
		
		m_c_regular = new JCheckBox("Regular");
		m_c_regular.setBounds(406, 236, 76, 23);
		contentPane.add(m_c_regular);
		
		m_c_malo = new JCheckBox("Malo");
		m_c_malo.setBounds(484, 235, 56, 23);
		contentPane.add(m_c_malo);
		
		JLabel lblEstabilidad = new JLabel("Estabilidad");
		lblEstabilidad.setBounds(29, 256, 124, 14);
		contentPane.add(lblEstabilidad);
		
		m_e_bueno = new JCheckBox("Bueno");
		m_e_bueno.setBounds(327, 256, 77, 23);
		contentPane.add(m_e_bueno);
		
		m_e_regular = new JCheckBox("Regular");
		m_e_regular.setBounds(406, 257, 76, 23);
		contentPane.add(m_e_regular);
		
		m_e_malo = new JCheckBox("Malo");
		m_e_malo.setBounds(484, 256, 56, 23);
		contentPane.add(m_e_malo);
		
		JLabel lblSerComprendido = new JLabel("Ser Comprendido");
		lblSerComprendido.setBounds(29, 301, 197, 14);
		contentPane.add(lblSerComprendido);
		
		u_s_bueno = new JCheckBox("Bueno");
		u_s_bueno.setBounds(327, 301, 77, 23);
		contentPane.add(u_s_bueno);
		
		u_s_regular = new JCheckBox("Regular");
		u_s_regular.setBounds(406, 302, 76, 23);
		contentPane.add(u_s_regular);
		
		u_s_malo = new JCheckBox("Malo");
		u_s_malo.setBounds(484, 301, 56, 23);
		contentPane.add(u_s_malo);
		
		JLabel lblOperable = new JLabel("Operable");
		lblOperable.setBounds(29, 322, 124, 14);
		contentPane.add(lblOperable);
		
		u_o_bueno = new JCheckBox("Bueno");
		u_o_bueno.setBounds(327, 322, 77, 23);
		contentPane.add(u_o_bueno);
		
		u_o_regular = new JCheckBox("Regular");
		u_o_regular.setBounds(406, 323, 76, 23);
		contentPane.add(u_o_regular);
		
		u_o_malo = new JCheckBox("Malo");
		u_o_malo.setBounds(484, 322, 56, 23);
		contentPane.add(u_o_malo);
		
		JLabel lblAdaptabilidad = new JLabel("Adaptabilidad");
		lblAdaptabilidad.setBounds(29, 386, 89, 14);
		contentPane.add(lblAdaptabilidad);
		
		p_a_bueno = new JCheckBox("Bueno");
		p_a_bueno.setBounds(327, 386, 77, 23);
		contentPane.add(p_a_bueno);
		
		p_a_regular = new JCheckBox("Regular");
		p_a_regular.setBounds(406, 387, 76, 23);
		contentPane.add(p_a_regular);
		
		p_a_malo = new JCheckBox("Malo");
		p_a_malo.setBounds(484, 386, 56, 23);
		contentPane.add(p_a_malo);
		
		JLabel lblPortabilidad_1 = new JLabel("Portabilidad");
		lblPortabilidad_1.setBounds(29, 407, 124, 14);
		contentPane.add(lblPortabilidad_1);
		
		p_p_bueno = new JCheckBox("Bueno");
		p_p_bueno.setBounds(327, 407, 77, 23);
		contentPane.add(p_p_bueno);
		
		p_p_regular = new JCheckBox("Regular");
		p_p_regular.setBounds(406, 408, 76, 23);
		contentPane.add(p_p_regular);
		
		p_p_malo = new JCheckBox("Malo");
		p_p_malo.setBounds(484, 407, 56, 23);
		contentPane.add(p_p_malo);
		
		JLabel lblAtractivo = new JLabel("Atractivo");
		lblAtractivo.setBounds(29, 344, 124, 14);
		contentPane.add(lblAtractivo);
		
		u_a_bueno = new JCheckBox("Bueno");
		u_a_bueno.setBounds(327, 344, 77, 23);
		contentPane.add(u_a_bueno);
		
		u_a_regular = new JCheckBox("Regular");
		u_a_regular.setBounds(406, 345, 76, 23);
		contentPane.add(u_a_regular);
		
		u_a_malo = new JCheckBox("Malo");
		u_a_malo.setBounds(484, 344, 56, 23);
		contentPane.add(u_a_malo);
		
		final JLabel resultado = new JLabel("<replace for HTML>");
		resultado.setBounds(327, 443, 210, 14);
		contentPane.add(resultado);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				//Verifico el estado de los botones
				//Chequear Funcionalidad
				if(checkFuncionalidad() && checkEficiencia() && checkMantenibilidad() && checkUsabilidad()
						&& checkPortabilidad() && checkFiabilidad()){
					resultado.setText("Calidad mínima alcanzada");
				}else{
					resultado.setText("Calidad mínima No alcanzada");
				}
				
			}			
		});
		btnVerificar.setBounds(29, 439, 89, 23);
		contentPane.add(btnVerificar);
		
		
	}
	
	private boolean checkFuncionalidad() {
		if((this.f_e_bueno.isSelected() || this.f_e_regular.isSelected()) && (this.f_s_bueno.isSelected() || this.f_s_regular.isSelected()))
			return true;
		
		return false;
	}
	
	private boolean checkPortabilidad() {
		if(this.p_a_bueno.isSelected())
			 return true;
		
		return false;
	}

	private boolean checkUsabilidad() {
		if(this.u_s_bueno.isSelected() || this.u_o_bueno.isSelected() || this.u_a_bueno.isSelected())
			return true;
		
		return false;
	}

	private boolean checkMantenibilidad() {
		if(this.m_c_bueno.isSelected() || this.m_e_bueno.isSelected() )
			return true;
		
		return false;
	}

	private boolean checkEficiencia() {
		if((this.e_u_bueno.isSelected() || this.e_u_regular.isSelected()) && (this.e_c_bueno.isSelected() || this.e_c_regular.isSelected()))
			return true;
		
		return false;
	}
	
	private boolean checkFiabilidad() {
		if((this.f_t_bueno.isSelected() || this.f_t_regular.isSelected()) && (this.f_r_bueno.isSelected() || this.f_r_regular.isSelected()))
			return true;
		
		return false;
	}
}
