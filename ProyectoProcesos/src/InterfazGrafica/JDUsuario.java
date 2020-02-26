package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import Actores.Administrador;
import ClasesAbstractas.Fecha;
import ClasesAbstractas.ValoresMaestros;
import rojeru_san.componentes.RSDateChooser;

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
import javax.swing.JTextArea;

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
	private ValoresMaestros oValoresMaestros;
	private JTabbedPane tabbedPane;
	private JPasswordField passwordField;
	private JTextField txtUser;
	private JTextField txtPassword;
	private JTextField txtMailCorporativo;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JComboBox cmbxTipoDocumento;
	private JFormattedTextField ftxtNumDocumento;
	private RSDateChooser dateFechaNacimiento;
	private JComboBox cmbxEstadoCivil;
	private JTextField txtCorreoPersonal;
	private JTextField txtCelular1;
	private JTextField txtCelular2;
	private JTextField textField;
	private JTextArea txtAreaDireccionLaboral;
	private JTextArea txtAreaDireccionDomiciliaria;
	private JTextField txtReferenciaInstalacion;
	private JComboBox cmbxCargo;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public JDUsuario(String tipoDialogoUsuario) {
		this.oValoresMaestros = new ValoresMaestros();

		if (tipoDialogoUsuario.equals("CREAR_USUARIO")) {
			this.constructorCrearUsuario();// aqui se crea el dialogo crear usuario
		} else {
			this.constructorIniciarSesion();// aqui se crea el dialogo iniciar sesion

		}
		

	}

	public void constructorCrearUsuario() {

		setResizable(false);
		setModal(true);
		setBounds(100, 100, 691, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");

		Border titleDatosPersonales = new TitledBorder(new EtchedBorder(), "DATOS PERSONALES");
		Border titleDatosContacto = new TitledBorder(new EtchedBorder(), "DATOS DE CONTACTO");
		Border titleDireccionDomiciliaria = new TitledBorder(new EtchedBorder(), "DIRECCION");

		Fecha oFecha = new Fecha();
		JScrollPane scrollPaneCliente = new JScrollPane();
		this.tabbedPane.addTab("Datos Personales", null, scrollPaneCliente, null);
		JPanel pageCliente = new JPanel();
		scrollPaneCliente.setViewportView(pageCliente);

		JPanel pnlDatosPersonales = new JPanel();
		pnlDatosPersonales.setBorder(titleDatosPersonales);
		pnlDatosPersonales.setToolTipText("");

		JPanel pnlDatosContacto = new JPanel();
		pnlDatosContacto.setBorder(titleDatosContacto);

		JPanel pnlDireccionDomiciliaria = new JPanel();
		pnlDireccionDomiciliaria.setBorder(titleDireccionDomiciliaria);

		GroupLayout gl_pageCliente = new GroupLayout(pageCliente);
		gl_pageCliente.setHorizontalGroup(gl_pageCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pageCliente.createSequentialGroup().addContainerGap()
						.addGroup(gl_pageCliente.createParallelGroup(Alignment.TRAILING)
								.addComponent(pnlDireccionDomiciliaria, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
										629, Short.MAX_VALUE)
								.addComponent(pnlDatosContacto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 629,
										Short.MAX_VALUE)
								.addComponent(pnlDatosPersonales, GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE))
						.addContainerGap()));
		gl_pageCliente.setVerticalGroup(gl_pageCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pageCliente.createSequentialGroup().addContainerGap()
						.addComponent(pnlDatosPersonales, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnlDatosContacto, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnlDireccionDomiciliaria, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
						.addContainerGap()));

		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n Domicilaria");

		JScrollPane scrollPane_1 = new JScrollPane();

		JLabel lblDireccinDelTrabajo = new JLabel("Direcci\u00F3n del Trabajo");

		JScrollPane scrollPane_2 = new JScrollPane();

		JLabel lblNewLabel_4 = new JLabel("Referencia para instalaci\u00F3n");

		txtReferenciaInstalacion = new JTextField();
		txtReferenciaInstalacion.setColumns(10);
		GroupLayout gl_pnlDireccionDomiciliaria = new GroupLayout(pnlDireccionDomiciliaria);
		gl_pnlDireccionDomiciliaria
				.setHorizontalGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup().addContainerGap()
								.addGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
										.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3)
										.addComponent(lblDireccinDelTrabajo, GroupLayout.PREFERRED_SIZE, 145,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup()
												.addComponent(lblNewLabel_4).addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtReferenciaInstalacion, 361, 361, 361)))
								.addContainerGap()));
		gl_pnlDireccionDomiciliaria.setVerticalGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_3).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4).addComponent(txtReferenciaInstalacion, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(9).addComponent(lblDireccinDelTrabajo).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		txtAreaDireccionLaboral = new JTextArea();
		scrollPane_2.setViewportView(txtAreaDireccionLaboral);

		txtAreaDireccionDomiciliaria = new JTextArea();
		scrollPane_1.setViewportView(txtAreaDireccionDomiciliaria);
		pnlDireccionDomiciliaria.setLayout(gl_pnlDireccionDomiciliaria);

		JLabel lblCorreoElectronico = new JLabel("CORREO ELECTRONICO");

		txtCorreoPersonal = new JTextField();
		txtCorreoPersonal.setColumns(10);

		JLabel lblCelular = new JLabel("CELULAR 1");

		txtCelular1 = new JTextField();
		txtCelular1.setColumns(10);

		JLabel lblCelular_1 = new JLabel("CELULAR 2");

		txtCelular2 = new JTextField();
		txtCelular2.setColumns(10);

		JLabel lblConvencional = new JLabel("CONVENCIONAL");

		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_pnlDatosContacto = new GroupLayout(pnlDatosContacto);
		gl_pnlDatosContacto.setHorizontalGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosContacto.createSequentialGroup().addContainerGap().addGroup(gl_pnlDatosContacto
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblCorreoElectronico, GroupLayout.PREFERRED_SIZE, 130,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtCorreoPersonal, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblCelular, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtCelular1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblCelular_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(txtCelular2, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblConvencional, GroupLayout.PREFERRED_SIZE, 130,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(textField,
										GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(238, Short.MAX_VALUE)));
		gl_pnlDatosContacto
				.setVerticalGroup(
						gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlDatosContacto.createSequentialGroup().addContainerGap()
										.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblCorreoElectronico).addComponent(txtCorreoPersonal,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblCelular)
												.addComponent(txtCelular1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblCelular_1)
												.addComponent(txtCelular2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblConvencional).addComponent(textField,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addContainerGap(29, Short.MAX_VALUE)));
		pnlDatosContacto.setLayout(gl_pnlDatosContacto);

		JLabel label_2 = new JLabel("APELLIDOS");

		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);

		JLabel label_3 = new JLabel("TIPO DE DOCUMENTO");

		cmbxTipoDocumento = new JComboBox(ValoresMaestros.TIPOS_DOCUMENTOS);

		JLabel label_4 = new JLabel("NOMBRES");

		txtNombres = new JTextField();
		txtNombres.setColumns(10);

		JLabel label_5 = new JLabel("NUM DOCUMENTO");

		ftxtNumDocumento = new JFormattedTextField();

		dateFechaNacimiento = new RSDateChooser();
		dateFechaNacimiento.setColorForeground(Color.GRAY);
		dateFechaNacimiento.setColorDiaActual(Color.GRAY);
		dateFechaNacimiento.setColorButtonHover(Color.GRAY);
		dateFechaNacimiento.setColorBackground(Color.GRAY);

		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO");

		JLabel lblEstadoCivil = new JLabel("ESTADO CIVIL");

		cmbxEstadoCivil = new JComboBox(ValoresMaestros.ESTADO_CIVIL);
		GroupLayout gl_pnlDatosPersonales = new GroupLayout(pnlDatosPersonales);
		gl_pnlDatosPersonales.setHorizontalGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addContainerGap().addGroup(gl_pnlDatosPersonales
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
								.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFechaNacimiento, GroupLayout.PREFERRED_SIZE, 107,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 132,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
														.addComponent(cmbxEstadoCivil, GroupLayout.PREFERRED_SIZE, 203,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(dateFechaNacimiento, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
														.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, 149,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(cmbxTipoDocumento, GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_pnlDatosPersonales
														.createParallelGroup(Alignment.TRAILING, false)
														.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
																.addComponent(label_4, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(txtNombres, GroupLayout.PREFERRED_SIZE,
																		194, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
																.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 108,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(ftxtNumDocumento,
																		GroupLayout.PREFERRED_SIZE, 159,
																		GroupLayout.PREFERRED_SIZE)))
												.addGap(18))))
						.addComponent(lblEstadoCivil, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_pnlDatosPersonales.setVerticalGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addContainerGap().addGroup(gl_pnlDatosPersonales
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(3)
								.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_2).addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(3)
								.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_4).addComponent(txtNombres, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(
								gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(11)
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
														.addComponent(label_3)
														.addComponent(cmbxTipoDocumento, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(6)
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
																.addGap(24).addComponent(lblFechaNacimiento))
														.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
																.addGap(18).addComponent(dateFechaNacimiento,
																		GroupLayout.PREFERRED_SIZE, 28,
																		GroupLayout.PREFERRED_SIZE)))
												.addGap(18)
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblEstadoCivil).addComponent(cmbxEstadoCivil,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
														.addComponent(label_5).addComponent(ftxtNumDocumento,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))))
						.addGap(31)));
		pnlDatosPersonales.setLayout(gl_pnlDatosPersonales);
		pageCliente.setLayout(gl_pageCliente);

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE));

		JPanel panel = new JPanel();
		tabbedPane.addTab("Datos de Usuario", null, panel, null);

		Border titleDatosUsuario = new TitledBorder(new EtchedBorder(), "DATOS DE USUARIO");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(titleDatosUsuario);
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 649, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(11, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(126, Short.MAX_VALUE)));
		
		JLabel lblNewLabel_1 = new JLabel("USUARIO");
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		
		JLabel lblContrasea_1 = new JLabel("CONTRASE\u00D1A");
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CARGO");
		
		cmbxCargo = new JComboBox(ValoresMaestros.TIPOS_CARGOS);
		
		JLabel lblNewLabel_6 = new JLabel("CORREO CORPORATIVO");
		
		txtMailCorporativo = new JTextField();
		txtMailCorporativo.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblContrasea_1))
							.addGap(10)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtPassword)
								.addComponent(txtUser, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
							.addGap(58)
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(cmbxCargo, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtMailCorporativo, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(170, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(cmbxCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContrasea_1))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(txtMailCorporativo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCrearUsuario = new JButton("CREAR USUARIO");
				btnCrearUsuario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//getThis().getoFrmProcesoComercial().almacenarDatosUsuario(getThis());
					}
				});
				btnCrearUsuario.setActionCommand("OK");
				buttonPane.add(btnCrearUsuario);
				getRootPane().setDefaultButton(btnCrearUsuario);
			}
			
			JButton btnNewButton = new JButton("CANCELAR");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					getThis().getoFrmProcesoComercial().cerrarCrearUsuario();
				}
			});
			buttonPane.add(btnNewButton);
		}

	}

	public void constructorIniciarSesion() {
		setModal(true);
		setResizable(false);
		// this.setUndecorated(true);
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
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(39)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 204,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblContrasea, Alignment.TRAILING,
														GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
												.addComponent(txtUsuario, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
														204, Short.MAX_VALUE)
												.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 204,
														Short.MAX_VALUE))
										.addGap(52)))));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(43)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(28)
						.addComponent(lblContrasea, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(passwordField,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(86, Short.MAX_VALUE)));
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

	

	public void iniciarSesion() {

		String psswdString = new String(this.passwordField.getPassword());

		if (psswdString.isEmpty() || this.txtUsuario.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "DEBE INGRESAR USUARIO Y CONTRASEÑA", "ERROR DE INICIO DE SESION",
					JOptionPane.ERROR_MESSAGE);

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

	public JTextField getTxtUsuario() {
		return txtUsuario;
	}

	public void setTxtUsuario(JTextField txtUsuario) {
		this.txtUsuario = txtUsuario;
	}

	public ValoresMaestros getoValoresMaestros() {
		return oValoresMaestros;
	}

	public void setoValoresMaestros(ValoresMaestros oValoresMaestros) {
		this.oValoresMaestros = oValoresMaestros;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JTextField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(JTextField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public JTextField getTxtMailCorporativo() {
		return txtMailCorporativo;
	}

	public void setTxtMailCorporativo(JTextField txtMailCorporativo) {
		this.txtMailCorporativo = txtMailCorporativo;
	}

	public JTextField getTxtApellidos() {
		return txtApellidos;
	}

	public void setTxtApellidos(JTextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public JTextField getTxtNombres() {
		return txtNombres;
	}

	public void setTxtNombres(JTextField txtNombres) {
		this.txtNombres = txtNombres;
	}

	public JComboBox getCmbxTipoDocumento() {
		return cmbxTipoDocumento;
	}

	public void setCmbxTipoDocumento(JComboBox cmbxTipoDocumento) {
		this.cmbxTipoDocumento = cmbxTipoDocumento;
	}

	public JFormattedTextField getFtxtNumDocumento() {
		return ftxtNumDocumento;
	}

	public void setFtxtNumDocumento(JFormattedTextField ftxtNumDocumento) {
		this.ftxtNumDocumento = ftxtNumDocumento;
	}

	public RSDateChooser getDateFechaNacimiento() {
		return dateFechaNacimiento;
	}

	public void setDateFechaNacimiento(RSDateChooser dateFechaNacimiento) {
		this.dateFechaNacimiento = dateFechaNacimiento;
	}

	public JComboBox getCmbxEstadoCivil() {
		return cmbxEstadoCivil;
	}

	public void setCmbxEstadoCivil(JComboBox cmbxEstadoCivil) {
		this.cmbxEstadoCivil = cmbxEstadoCivil;
	}

	public JTextField getTxtCorreoPersonal() {
		return txtCorreoPersonal;
	}

	public void setTxtCorreoPersonal(JTextField txtCorreoPersonal) {
		this.txtCorreoPersonal = txtCorreoPersonal;
	}

	public JTextField getTxtCelular1() {
		return txtCelular1;
	}

	public void setTxtCelular1(JTextField txtCelular1) {
		this.txtCelular1 = txtCelular1;
	}

	public JTextField getTxtCelular2() {
		return txtCelular2;
	}

	public void setTxtCelular2(JTextField txtCelular2) {
		this.txtCelular2 = txtCelular2;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextArea getTxtAreaDireccionLaboral() {
		return txtAreaDireccionLaboral;
	}

	public void setTxtAreaDireccionLaboral(JTextArea txtAreaDireccionLaboral) {
		this.txtAreaDireccionLaboral = txtAreaDireccionLaboral;
	}

	public JTextArea getTxtAreaDireccionDomiciliaria() {
		return txtAreaDireccionDomiciliaria;
	}

	public void setTxtAreaDireccionDomiciliaria(JTextArea txtAreaDireccionDomiciliaria) {
		this.txtAreaDireccionDomiciliaria = txtAreaDireccionDomiciliaria;
	}

	public JTextField getTxtReferenciaInstalacion() {
		return txtReferenciaInstalacion;
	}

	public void setTxtReferenciaInstalacion(JTextField txtReferenciaInstalacion) {
		this.txtReferenciaInstalacion = txtReferenciaInstalacion;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JComboBox getCmbxCargo() {
		return cmbxCargo;
	}

	public void setCmbxCargo(JComboBox cmbxCargo) {
		this.cmbxCargo = cmbxCargo;
	}
	
	
	
	
}
