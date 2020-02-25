package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import Actores.Administrador;
import ClasesAbstractas.Fecha;
import ClasesAbstractas.ValoresMaestros;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;

public class JDUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUsuario;
	private FrmProcesoComercial oFrmProcesoComercial;
	private JTextField txt_apeliidos;
	private JTextField txt_nombres;
	private JTextField txt_cedula;
	private JTextField txt_correoPersonal;
	private JTextField txt_correoCorporativo;
	private JTextField txt_direccion;
	private JTextField txt_sexo;
	private JTextField txt_nuevoCorreo;
	private JPasswordField passwordField;
	private ValoresMaestros oValoresMaestros;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		try {
			JDUsuario dialog = new JDUsuario("CREAR_USUARIO");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDUsuario(String tipoDialogoUsuario) {
		this.oValoresMaestros = new ValoresMaestros();
		
		if (tipoDialogoUsuario.equals("CREAR_USUARIO")) {
			this.constructorCrearUsuario();//aqui se crea el dialogo crear usuario
		} else {
			this.constructorIniciarSesion();//aqui se crea el dialogo iniciar sesion
			
		}
		
		
		
	}
	
	public void constructorCrearUsuario() {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 392, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Datos personales", null, scrollPane_1, null);
		
		JPanel panel = new JPanel();
		panel.setMaximumSize(new Dimension(22767, 32767));
		scrollPane_1.setViewportView(panel);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		
		JLabel lblNombres = new JLabel("Nombres");
		
		JLabel lblNumeroDeCedula = new JLabel("Numero de cedula");
		
		JLabel lblCorreoPersonal = new JLabel("Correo Personal");
		
		JLabel lblCorreoCorporativo = new JLabel("Correo Corporativo");
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		
		JLabel lblCargo = new JLabel("Cargo");
		
		JLabel lblDireccionDomiciliaria = new JLabel("Direccion domiciliaria");
		
		JLabel lblSexo = new JLabel("Sexo");
		
		Fecha oFecha = new Fecha();
		
		
		
	
		
		
		txt_apeliidos = new JTextField();
		txt_apeliidos.setColumns(10);
		
		txt_nombres = new JTextField();
		txt_nombres.setColumns(10);
		
		txt_cedula = new JTextField();
		txt_cedula.setColumns(10);
		
		txt_correoPersonal = new JTextField();
		txt_correoPersonal.setColumns(10);
		
		txt_correoCorporativo = new JTextField();
		txt_correoCorporativo.setColumns(10);
		
		txt_direccion = new JTextField();
		txt_direccion.setColumns(10);
		
		txt_sexo = new JTextField();
		txt_sexo.setColumns(10);
		
		JComboBox cB_cargo = new JComboBox();
		cB_cargo.setModel(new DefaultComboBoxModel(this.oValoresMaestros.TIPOS_USUARIOS));
		cB_cargo.setToolTipText("");
		cB_cargo.setName("");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFechaDeNacimiento)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombres)
								.addComponent(lblNumeroDeCedula)
								.addComponent(lblCorreoPersonal)
								.addComponent(lblCorreoCorporativo))
							.addGap(23)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txt_correoCorporativo, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
								.addComponent(txt_correoPersonal, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
								.addComponent(txt_cedula, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
								.addComponent(txt_nombres, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
								.addComponent(txt_apeliidos, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDireccionDomiciliaria)
								.addComponent(lblSexo)
								.addComponent(lblCargo))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txt_sexo)
								.addComponent(txt_direccion)
								.addComponent(cB_cargo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(194))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(txt_apeliidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombres)
						.addComponent(txt_nombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNumeroDeCedula)
						.addComponent(txt_cedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCorreoPersonal)
						.addComponent(txt_correoPersonal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCorreoCorporativo)
						.addComponent(txt_correoCorporativo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lblFechaDeNacimiento)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCargo)
						.addComponent(cB_cargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDireccionDomiciliaria)
						.addComponent(txt_direccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSexo)
						.addComponent(txt_sexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Datos de usuario", null, scrollPane, null);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		
		JLabel lbl_nuevoCorreo = new JLabel("Ingrese su nuevo correo");
		
		txt_nuevoCorreo = new JTextField();
		txt_nuevoCorreo.setColumns(10);
		
		JLabel lbl_nuevoPass = new JLabel("Ingrese su contrase\u00F1a");
		
		passwordField = new JPasswordField();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(passwordField, Alignment.LEADING)
						.addComponent(txt_nuevoCorreo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
						.addComponent(lbl_nuevoCorreo, Alignment.LEADING)
						.addComponent(lbl_nuevoPass, Alignment.LEADING))
					.addContainerGap(213, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(38)
					.addComponent(lbl_nuevoCorreo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txt_nuevoCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lbl_nuevoPass)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCrearUsuario = new JButton("Crear usuario");
				btnCrearUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				btnCrearUsuario.setActionCommand("OK");
				buttonPane.add(btnCrearUsuario);
				getRootPane().setDefaultButton(btnCrearUsuario);
			}
		}
	
	}
	
	public void constructorIniciarSesion() {
		setModal(true);
		setResizable(false);
		//this.setUndecorated(true);
		setBounds(100, 100, 305, 270);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		passwordField = new JPasswordField();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblContrasea, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
								.addComponent(txtUsuario, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
							.addGap(52))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(86, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
				btnIniciarSesion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						getThis().iniciarSesion();
						
					}
				});
				btnIniciarSesion.setActionCommand("OK");
				buttonPane.add(btnIniciarSesion);
				getRootPane().setDefaultButton(btnIniciarSesion);
			}
		}
	}

	
	public void screenAdministrador() {
		
	}
	
	public void iniciarSesion() {
		
			String psswdString = new String(this.passwordField.getPassword());
			
			if(psswdString.isEmpty()||this.txtUsuario.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "DEBE INGRESAR USUARIO Y CONTRASEÑA", "ERROR DE INICIO DE SESION", JOptionPane.ERROR_MESSAGE);
				
			} else {
				this.getoFrmProcesoComercial().eventoSesionAdministrador();
				this.getoFrmProcesoComercial().setVisible(true);
			}
		
	}
	
	public FrmProcesoComercial getoFrmProcesoComercial() {
		return oFrmProcesoComercial;
	}

	public void setoFrmProcesoComercial(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;
	}
	
	public JDUsuario getThis() {
		return this;
	}
}


