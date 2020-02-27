package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.util.Date;

import ClasesAbstractas.*;
import ProcesoComercial.Venta;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

import rojeru_san.componentes.RSCalendar;
import rojeru_san.componentes.RSDateChooser;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class ItnFrmFormularioIngresoVenta extends JInternalFrame {
	private JTextField txtApellidosCliente;
	private JTextField txtNombresCliente;
	private JTabbedPane formularioPrincipal;
	private Date fechaActual;
	private JTextField txtCorreoElectronicoCliente;
	private JTextField txtCelular1Cliente;
	private JTextField txtCelular2Cliente;
	private JTextField txtConvencionalCliente;
	private JTextField txtReferenciaInstalacionCliente;
	private int lineasSolicitadas;
	private JTextField txtCodigoNIP;
	private JTextField txtCorreoSupervisor;
	private JTextField txtCorreoAsesor;
	private JComboBox cmbxTipoPlanPospago;
	private JComboBox cmbxPlanPospago;
	private JComboBox cmbxServicioMovilSolicitado;
	private JComboBox cmbxOperadorDonante;
	private JPanel txtNumeroPortarMigrar;
	private JTextField txtNumPortarMigrar;
	private JTextField txtNoCuenta;
	private JTextField txtNoTarjetaCredito;
	private JComboBox cmbxFormaPago;
	private JComboBox cmbxEntidadesBancarias;
	private JComboBox cmbxMarcaTarjetaCredito;
	private JSpinner spnAnioExpiracion;
	private JSpinner spnMesExpiracion;
	private JTextField txtCodCSV;
	private FrmProcesoComercial oFrmProcesoComercial;
	private RSDateChooser dateFechaNacimientoCliente;
	private JComboBox cmbxTipoDocumentoCliente;
	private JFormattedTextField ftxtNumDocumentoCliente;
	private JComboBox cmbxEstadoCivilCliente;
	private JComboBox cmbxAsesor;
	private JComboBox cmbxSupervisor;
	private int cantidadAsesores;
	private int cantidadSupervisores;
	private JTextArea txtAreaDireccionDomicilioCliente;
	private JTextArea txtAreaDireccionLaboralCliente;
	private JComboBox cmbxEstadoVenta;
	private JTextField txtSolicitudCredito;
	private JButton btnGenerarAcuse;
	private JButton btnActualizar;
	private JButton btnEnviar;
	private JButton btnCancelar;
	private Venta oVenta;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ItnFrmFormularioIngresoVenta(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;

		this.fechaActual = new Date();
		this.constructorInicial();
		this.constructorPageVendedor();
		this.constructorPageCliente();
		this.constructorServiciosMoviles();
		this.constructorFormaPago();
	}

	public void constructorInicial() {
		setBounds(100, 100, 689, 572);
		getContentPane().setLayout(new BorderLayout(0, 0));
		this.setClosable(false);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("FORMULARIO DE INGRESO DE VENTAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel_1, BorderLayout.SOUTH);

		btnEnviar = new JButton("Enviar");
		
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (getThis().validarIngresoFormulario()) {
					getThis().getoFrmProcesoComercial().getoEmpresa().ingresarVenta(getThis());
				}else {
					JOptionPane.showMessageDialog(null, "Faltan campos por llenar", "ERROR DE ENVIO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnGenerarAcuse = new JButton("Generar Acuse");
		panel_1.add(btnGenerarAcuse);
		btnGenerarAcuse.setVisible(false);
		
		btnActualizar = new JButton("Guardar Cambios");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getThis().getoVenta().actualizarVenta();
			}
		});
		panel_1.add(btnActualizar);
		btnActualizar.setVisible(false);
		panel_1.add(btnEnviar);


		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getThis().setVisible(false);
			}
		});
		panel_1.add(btnCancelar);

		this.formularioPrincipal = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(formularioPrincipal, BorderLayout.CENTER);

	}

	public void constructorPageVendedor() {

		JPanel pnlVendedor = new JPanel();
		formularioPrincipal.addTab("VENDEDOR", null, pnlVendedor, null);
		pnlVendedor.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		pnlVendedor.add(panel_1, BorderLayout.CENTER);
		
		JLabel lblAsesor = new JLabel("ASESOR*");

		cmbxAsesor = new JComboBox();
		this.cargarListaAsesoresComerciales();
		

		JLabel lblSupervisor = new JLabel("SUPERVISOR*");

		cmbxSupervisor = new JComboBox();

		this.cargarListaSupervisores();
		
		
		
		
		JLabel label_2 = new JLabel("EMAIL - ASESOR");

		JLabel label_3 = new JLabel("EMAIL - SUPERVISOR");

		txtCorreoSupervisor = new JTextField();
		txtCorreoSupervisor.setColumns(10);
		txtCorreoSupervisor.setEditable(false);

		txtCorreoAsesor = new JTextField();
		txtCorreoAsesor.setColumns(10);
		txtCorreoAsesor.setEditable(false);
		
		JLabel lblEstadoDeLa = new JLabel("ESTADO DE LA VENTA");
		
		cmbxEstadoVenta = new JComboBox(ValoresMaestros.ESTADO_VENTA);
		cmbxEstadoVenta.setEnabled(false);
		cmbxEstadoVenta.setSelectedItem(ValoresMaestros.ESTADO_VENTA[0]);
		
		JLabel lblNewLabel_9 = new JLabel("NUM SOLICITUD CREDITO");
		
		txtSolicitudCredito = new JTextField();
		txtSolicitudCredito.setEditable(false);
		txtSolicitudCredito.setEnabled(false);
		txtSolicitudCredito.setColumns(10);

		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblAsesor)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cmbxAsesor, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_1.createSequentialGroup()
								.addComponent(lblSupervisor)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(cmbxSupervisor, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2)
								.addComponent(label_3))
							.addGap(28)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtCorreoSupervisor, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCorreoAsesor, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addComponent(lblNewLabel_9)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtSolicitudCredito))
							.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
								.addComponent(lblEstadoDeLa, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(cmbxEstadoVenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(264, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAsesor)
						.addComponent(cmbxAsesor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSupervisor)
						.addComponent(cmbxSupervisor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(txtCorreoAsesor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(txtCorreoSupervisor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstadoDeLa)
						.addComponent(cmbxEstadoVenta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(txtSolicitudCredito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(234, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);

		//Escuchadores
		cmbxAsesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreAsesor = null;
				String correoAsesor = null;

				if(getThis().cmbxAsesor.getSelectedItem().equals("SELECCIONE UNO")) {
					getThis().txtCorreoAsesor.setText("");
				}else {
					for (int i = 0; i < getThis().cantidadAsesores; i++) {
						nombreAsesor = getThis().getoFrmProcesoComercial().getoEmpresa().getLstAsesoresComerciales().get(i)
								.getNombre().toString();
						if (nombreAsesor.equals(getThis().cmbxAsesor.getSelectedItem().toString())) {
							correoAsesor = getThis().getoFrmProcesoComercial().getoEmpresa().getLstAsesoresComerciales()
									.get(i).getCorreoCorporativo().toString();
							getThis().txtCorreoAsesor.setText(correoAsesor);
							return;
						}
					}
				}
			}
		});
		
		cmbxSupervisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreSupervisor = null;
				String correoSupervisor = null;

				if(getThis().cmbxSupervisor.getSelectedItem().equals("SELECCIONE UNO")) {
					getThis().txtCorreoSupervisor.setText("");
				}else {
					for (int i = 0; i < getThis().cantidadSupervisores; i++) {
						nombreSupervisor = getThis().getoFrmProcesoComercial().getoEmpresa().getLstSupervisores().get(i)
								.getNombre().toString();
						if (nombreSupervisor.equals(getThis().cmbxSupervisor.getSelectedItem().toString())) {
							correoSupervisor = getThis().getoFrmProcesoComercial().getoEmpresa().getLstSupervisores()
									.get(i).getCorreoCorporativo().toString();
							getThis().txtCorreoSupervisor.setText(correoSupervisor);
							return;
						}
					}
				}
				
				

				
			}
		});
		
		
		
	}

	public void constructorPageCliente() {
		JScrollPane scrollPaneCliente = new JScrollPane();
		this.formularioPrincipal.addTab("CLIENTE", null, scrollPaneCliente, null);
		JPanel pageCliente = new JPanel();
		scrollPaneCliente.setViewportView(pageCliente);

		JPanel pnlDatosPersonales = new JPanel();
		Border titleDatosPersonales = new TitledBorder(new EtchedBorder(), "DATOS PERSONALES");
		pnlDatosPersonales.setBorder(titleDatosPersonales);
		pnlDatosPersonales.setToolTipText("");

		JPanel pnlDatosContacto = new JPanel();
		Border titleDatosContacto = new TitledBorder(new EtchedBorder(), "DATOS DE CONTACTO");
		pnlDatosContacto.setBorder(titleDatosContacto);

		JPanel pnlDireccionDomiciliaria = new JPanel();
		Border titleDireccionDomiciliaria = new TitledBorder(new EtchedBorder(), "DIRECCION");
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

		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n Domicilaria*");

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblDireccinDelTrabajo = new JLabel("Direcci\u00F3n del Trabajo");

		JScrollPane scrollPane_2 = new JScrollPane();

		JLabel lblNewLabel_4 = new JLabel("Referencia para instalaci\u00F3n*");

		txtReferenciaInstalacionCliente = new JTextField();
		txtReferenciaInstalacionCliente.setColumns(10);
		GroupLayout gl_pnlDireccionDomiciliaria = new GroupLayout(pnlDireccionDomiciliaria);
		gl_pnlDireccionDomiciliaria
				.setHorizontalGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup().addContainerGap()
								.addGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
										.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3)
										.addComponent(lblDireccinDelTrabajo, GroupLayout.PREFERRED_SIZE, 145,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup()
												.addComponent(lblNewLabel_4).addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtReferenciaInstalacionCliente, 361, 361, 361)))
								.addContainerGap()));
		gl_pnlDireccionDomiciliaria.setVerticalGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel_3).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4).addComponent(txtReferenciaInstalacionCliente,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(9).addComponent(lblDireccinDelTrabajo).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		txtAreaDireccionLaboralCliente = new JTextArea();
		scrollPane_2.setViewportView(txtAreaDireccionLaboralCliente);

		txtAreaDireccionDomicilioCliente = new JTextArea();
		scrollPane.setViewportView(txtAreaDireccionDomicilioCliente);
		pnlDireccionDomiciliaria.setLayout(gl_pnlDireccionDomiciliaria);

		JLabel lblCorreoElectronico = new JLabel("CORREO ELECTRONICO*");

		txtCorreoElectronicoCliente = new JTextField();
		txtCorreoElectronicoCliente.setColumns(10);

		JLabel lblCelular = new JLabel("CELULAR 1*");

		txtCelular1Cliente = new JTextField();
		txtCelular1Cliente.setColumns(10);

		JLabel lblCelular_1 = new JLabel("CELULAR 2");

		txtCelular2Cliente = new JTextField();
		txtCelular2Cliente.setColumns(10);

		JLabel lblConvencional = new JLabel("CONVENCIONAL");

		txtConvencionalCliente = new JTextField();
		txtConvencionalCliente.setColumns(10);
		GroupLayout gl_pnlDatosContacto = new GroupLayout(pnlDatosContacto);
		gl_pnlDatosContacto.setHorizontalGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosContacto.createSequentialGroup().addContainerGap().addGroup(gl_pnlDatosContacto
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblCorreoElectronico, GroupLayout.PREFERRED_SIZE, 130,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtCorreoElectronicoCliente,
										GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblCelular, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtCelular1Cliente,
										GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblCelular_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtCelular2Cliente,
										GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
								.addComponent(lblConvencional, GroupLayout.PREFERRED_SIZE, 130,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(txtConvencionalCliente,
										GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(238, Short.MAX_VALUE)));
		gl_pnlDatosContacto.setVerticalGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosContacto.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCorreoElectronico)
								.addComponent(txtCorreoElectronicoCliente, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE).addComponent(lblCelular)
								.addComponent(txtCelular1Cliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE).addComponent(lblCelular_1)
								.addComponent(txtCelular2Cliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConvencional).addComponent(txtConvencionalCliente,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(29, Short.MAX_VALUE)));
		pnlDatosContacto.setLayout(gl_pnlDatosContacto);

		JLabel lblApellidos = new JLabel("APELLIDOS*");

		txtApellidosCliente = new JTextField();
		txtApellidosCliente.setColumns(10);

		JLabel lblTipoDeDocumento = new JLabel("TIPO DE DOCUMENTO*");

		cmbxTipoDocumentoCliente = new JComboBox(ValoresMaestros.TIPOS_DOCUMENTOS);

		JLabel lblNombres = new JLabel("NOMBRES*");

		txtNombresCliente = new JTextField();
		txtNombresCliente.setColumns(10);

		JLabel lblNumDocumento = new JLabel("NUM DOCUMENTO*");

		ftxtNumDocumentoCliente = new JFormattedTextField();

		dateFechaNacimientoCliente = new RSDateChooser();
		dateFechaNacimientoCliente.setColorForeground(Color.GRAY);
		dateFechaNacimientoCliente.setColorDiaActual(Color.GRAY);
		dateFechaNacimientoCliente.setColorButtonHover(Color.GRAY);
		dateFechaNacimientoCliente.setColorBackground(Color.GRAY);

		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO*");

		JLabel lblEstadoCivil = new JLabel("ESTADO CIVIL*");

		cmbxEstadoCivilCliente = new JComboBox(ValoresMaestros.ESTADO_CIVIL);
		GroupLayout gl_pnlDatosPersonales = new GroupLayout(pnlDatosPersonales);
		gl_pnlDatosPersonales.setHorizontalGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addContainerGap().addGroup(gl_pnlDatosPersonales
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
								.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFechaNacimiento, GroupLayout.PREFERRED_SIZE, 107,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTipoDeDocumento, GroupLayout.PREFERRED_SIZE, 132,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
														.addComponent(cmbxEstadoCivilCliente, GroupLayout.PREFERRED_SIZE, 203,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(dateFechaNacimientoCliente,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
												.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
														.addComponent(txtApellidosCliente, GroupLayout.PREFERRED_SIZE,
																149, GroupLayout.PREFERRED_SIZE)
														.addComponent(cmbxTipoDocumentoCliente,
																GroupLayout.PREFERRED_SIZE, 96,
																GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_pnlDatosPersonales
														.createParallelGroup(Alignment.TRAILING, false)
														.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
																.addComponent(lblNombres, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(txtNombresCliente,
																		GroupLayout.PREFERRED_SIZE, 194,
																		GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
																.addComponent(lblNumDocumento, GroupLayout.PREFERRED_SIZE, 108,
																		GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(ftxtNumDocumentoCliente,
																		GroupLayout.PREFERRED_SIZE, 159,
																		GroupLayout.PREFERRED_SIZE)))
												.addGap(18))))
						.addComponent(lblEstadoCivil, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_pnlDatosPersonales.setVerticalGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(3)
										.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblApellidos).addComponent(txtApellidosCliente,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(3)
										.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNombres).addComponent(txtNombresCliente,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(11)
										.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblTipoDeDocumento).addComponent(cmbxTipoDocumentoCliente,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(6)
										.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(24)
														.addComponent(lblFechaNacimiento))
												.addGroup(gl_pnlDatosPersonales.createSequentialGroup().addGap(18)
														.addComponent(dateFechaNacimientoCliente,
																GroupLayout.PREFERRED_SIZE, 28,
																GroupLayout.PREFERRED_SIZE)))
										.addGap(18)
										.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblEstadoCivil).addComponent(cmbxEstadoCivilCliente,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNumDocumento).addComponent(ftxtNumDocumentoCliente,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))))
						.addGap(31)));
		pnlDatosPersonales.setLayout(gl_pnlDatosPersonales);
		pageCliente.setLayout(gl_pageCliente);

	}

	public void constructorServiciosMoviles() {
		this.lineasSolicitadas = 0;

		JPanel pnlServiciosMoviles = new JPanel();
		formularioPrincipal.addTab("SERVICIOS MOVILES", null, pnlServiciosMoviles, null);
		pnlServiciosMoviles.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		pnlServiciosMoviles.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel label = new JLabel("SERVICIO MOVIL SOLICITADO");
		panel_1.add(label);

		cmbxServicioMovilSolicitado = new JComboBox(ValoresMaestros.TIPOS_SERVICIO_MOVIL);
		
		this.cmbxServicioMovilSolicitado.setSelectedItem(ValoresMaestros.TIPOS_SERVICIO_MOVIL[0]);
		
		panel_1.add(cmbxServicioMovilSolicitado);

		txtNumeroPortarMigrar = new JPanel();
		pnlServiciosMoviles.add(txtNumeroPortarMigrar, BorderLayout.CENTER);

		JLabel lblCodigoNip = new JLabel("CODIGO NIP");

		txtCodigoNIP = new JTextField();
		txtCodigoNIP.setColumns(10);

		JLabel lblOperadorDonante = new JLabel("OPERADORA DONANTE");

		cmbxOperadorDonante = new JComboBox(ValoresMaestros.OPERADORA_DONANTE);
		this.cmbxOperadorDonante.setSelectedItem(ValoresMaestros.OPERADORA_DONANTE[0]);
		
		JLabel lblNumeroPortarMigrar = new JLabel("NUMERO A PORTAR O MIGRAR");

		txtNumPortarMigrar = new JTextField();
		txtNumPortarMigrar.setColumns(10);

		JLabel lblTipoPlanPospago = new JLabel("TIPO DE PLAN POSPAGO");

		cmbxTipoPlanPospago = new JComboBox(ValoresMaestros.TIPO_SERVICIO_POSPAGO);
		this.cmbxTipoPlanPospago.setSelectedItem(ValoresMaestros.TIPO_SERVICIO_POSPAGO[0]);
		
		JLabel lblPlanPospago = new JLabel("PLAN POSPAGO");

		cmbxPlanPospago = new JComboBox();
		
		cmbxPlanPospago.setModel(new DefaultComboBoxModel(ValoresMaestros.POSPAGO_CONEXION_SIN_LIMITE));
		this.cmbxPlanPospago.setSelectedItem(ValoresMaestros.POSPAGO_CONEXION_SIN_LIMITE[0]);
		
		cmbxTipoPlanPospago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch (getThis().getCmbxTipoPlanPospago().getSelectedItem().toString()) {
				case "PLANES - CONEXION SIN LIMITE":
					cmbxPlanPospago.setModel(new DefaultComboBoxModel(ValoresMaestros.POSPAGO_CONEXION_SIN_LIMITE));
					break;

				case "PLANES - CONEXION":
					cmbxPlanPospago.setModel(new DefaultComboBoxModel(ValoresMaestros.POSPAGO_CONEXION));
					break;

				case "PLAN - MAS MINUTOS":
					cmbxPlanPospago.setModel(new DefaultComboBoxModel(ValoresMaestros.POSPAGO_MAS_MINUTOS));
					break;

				case "PLAN - EMPRESARIAL SIN LIMITE (CORPORATIVO)":
					cmbxPlanPospago.setModel(new DefaultComboBoxModel(ValoresMaestros.POSPAGO_EMPRESARIAL_SIN_LIMITE));
					break;

				default:
					cmbxPlanPospago.setModel(new DefaultComboBoxModel());
					break;
				}
			}
		});

		GroupLayout gl_txtNumeroPortarMigrar = new GroupLayout(txtNumeroPortarMigrar);
		gl_txtNumeroPortarMigrar.setHorizontalGroup(
				gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.LEADING).addGap(0, 580, Short.MAX_VALUE)
						.addGroup(gl_txtNumeroPortarMigrar.createSequentialGroup().addContainerGap()
								.addGroup(gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_txtNumeroPortarMigrar.createSequentialGroup()
												.addComponent(lblCodigoNip, GroupLayout.PREFERRED_SIZE, 72,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtCodigoNIP, GroupLayout.PREFERRED_SIZE, 116,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(lblOperadorDonante)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(cmbxOperadorDonante, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_txtNumeroPortarMigrar.createSequentialGroup()
												.addComponent(lblNumeroPortarMigrar, GroupLayout.PREFERRED_SIZE, 165,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtNumPortarMigrar, GroupLayout.PREFERRED_SIZE, 153,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_txtNumeroPortarMigrar.createSequentialGroup()
												.addComponent(lblTipoPlanPospago, GroupLayout.PREFERRED_SIZE, 165,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(cmbxTipoPlanPospago, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_txtNumeroPortarMigrar.createSequentialGroup()
												.addComponent(lblPlanPospago, GroupLayout.PREFERRED_SIZE, 165,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(cmbxPlanPospago, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(208, Short.MAX_VALUE)));
		gl_txtNumeroPortarMigrar.setVerticalGroup(gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.LEADING)
				.addGap(0, 428, Short.MAX_VALUE)
				.addGroup(gl_txtNumeroPortarMigrar.createSequentialGroup().addContainerGap()
						.addGroup(gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigoNip)
								.addComponent(txtCodigoNIP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOperadorDonante).addComponent(cmbxOperadorDonante,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNumeroPortarMigrar).addComponent(txtNumPortarMigrar,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipoPlanPospago).addComponent(cmbxTipoPlanPospago,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_txtNumeroPortarMigrar.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPlanPospago).addComponent(cmbxPlanPospago, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(307, Short.MAX_VALUE)));
		txtNumeroPortarMigrar.setLayout(gl_txtNumeroPortarMigrar);

		Border titleDetalleServiciosMoviles = new TitledBorder(new EtchedBorder(), "TIPOS DE SERVICIOS MOVILES");

	}

	public void constructorFormaPago() {
		JPanel pnlFormaPago = new JPanel();
		formularioPrincipal.addTab("FORMA DE PAGO", null, pnlFormaPago, null);
		pnlFormaPago.setLayout(new BorderLayout(0, 0));

		JPanel pnlSeleccionFormaPago = new JPanel();
		pnlFormaPago.add(pnlSeleccionFormaPago, BorderLayout.NORTH);
		pnlSeleccionFormaPago.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel_1 = new JLabel("SELECCIONE FROMA DE PAGO");
		pnlSeleccionFormaPago.add(lblNewLabel_1);

		cmbxFormaPago = new JComboBox(ValoresMaestros.TIPOS_FORMA_PAGO);
		this.cmbxFormaPago.setSelectedItem(ValoresMaestros.TIPOS_FORMA_PAGO[0]);
		
		pnlSeleccionFormaPago.add(cmbxFormaPago);
		

		JPanel pnlDetalleFormaPago = new JPanel();
		pnlFormaPago.add(pnlDetalleFormaPago, BorderLayout.CENTER);
		pnlDetalleFormaPago.setLayout(new BorderLayout(0, 0));

		JPanel pnlContraFactura = new JPanel();
		pnlDetalleFormaPago.add(pnlContraFactura, BorderLayout.CENTER);

		JPanel pnlEntidadBancaria = new JPanel();
		Border titleEntidadBancaria = new TitledBorder(new EtchedBorder(),
				"DETALLE ENTIDAD BANCARIA - SE USA DATOS DEL MISMO CLIENTE");
		pnlEntidadBancaria.setBorder(titleEntidadBancaria);

		JPanel pnlTarjetaCredito = new JPanel();
		Border titleTarjetaCredito = new TitledBorder(new EtchedBorder(), "DETALLE TARJETA CREDITO");
		pnlTarjetaCredito.setBorder(titleTarjetaCredito);

		JLabel lblNoTarjeta = new JLabel("NO. TARJETA");

		txtNoTarjetaCredito = new JTextField();
		txtNoTarjetaCredito.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("MARCA");

		cmbxMarcaTarjetaCredito = new JComboBox(ValoresMaestros.MARCAS_TARJETAS_CREDITO);
		
		this.cmbxMarcaTarjetaCredito.setSelectedItem(ValoresMaestros.MARCAS_TARJETAS_CREDITO[0]);
		
		JLabel lblNewLabel_7 = new JLabel("A\u00D1O EXP");

		JLabel lblMesExp = new JLabel("MES EXP");

		JLabel lblNewLabel_8 = new JLabel("COD. CSV");

		txtCodCSV = new JTextField();
		txtCodCSV.setColumns(10);

		spnAnioExpiracion = new JSpinner();
		spnAnioExpiracion.setModel(new SpinnerNumberModel(new Integer(2000), new Integer(2000), null, new Integer(1)));

		spnMesExpiracion = new JSpinner();
		spnMesExpiracion.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		GroupLayout gl_pnlTarjetaCredito = new GroupLayout(pnlTarjetaCredito);
		gl_pnlTarjetaCredito.setHorizontalGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTarjetaCredito.createSequentialGroup().addContainerGap().addGroup(gl_pnlTarjetaCredito
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlTarjetaCredito.createSequentialGroup()
								.addComponent(lblNoTarjeta, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtNoTarjetaCredito, GroupLayout.PREFERRED_SIZE, 150,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(lblNewLabel_6).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(cmbxMarcaTarjetaCredito, GroupLayout.PREFERRED_SIZE, 151,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlTarjetaCredito.createSequentialGroup()
								.addGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_8).addComponent(lblNewLabel_7))
								.addGap(18)
								.addGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnlTarjetaCredito.createSequentialGroup()
												.addComponent(spnAnioExpiracion, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE)
												.addGap(33)
												.addComponent(lblMesExp, GroupLayout.PREFERRED_SIZE, 43,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(spnMesExpiracion, GroupLayout.PREFERRED_SIZE, 66,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(txtCodCSV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(95, Short.MAX_VALUE)));
		gl_pnlTarjetaCredito.setVerticalGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlTarjetaCredito.createSequentialGroup().addGap(4)
						.addGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNoTarjeta)
								.addComponent(txtNoTarjetaCredito, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6)
								.addComponent(cmbxMarcaTarjetaCredito, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_7).addComponent(lblMesExp)
								.addComponent(spnAnioExpiracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(spnMesExpiracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_pnlTarjetaCredito.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_8).addComponent(txtCodCSV, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(23, Short.MAX_VALUE)));
		pnlTarjetaCredito.setLayout(gl_pnlTarjetaCredito);

		GroupLayout gl_pnlContraFactura = new GroupLayout(pnlContraFactura);
		gl_pnlContraFactura.setHorizontalGroup(gl_pnlContraFactura.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlContraFactura.createSequentialGroup().addGap(56)
						.addGroup(gl_pnlContraFactura.createParallelGroup(Alignment.TRAILING)
								.addComponent(pnlTarjetaCredito, GroupLayout.PREFERRED_SIZE, 555,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(pnlEntidadBancaria, GroupLayout.PREFERRED_SIZE, 555,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(57, Short.MAX_VALUE)));
		gl_pnlContraFactura.setVerticalGroup(gl_pnlContraFactura.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlContraFactura.createSequentialGroup().addContainerGap()
						.addComponent(pnlEntidadBancaria, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(pnlTarjetaCredito, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(157, Short.MAX_VALUE)));

		JLabel lblNewLabel_2 = new JLabel("NOMBRE ENTIDAD BANCARIA");

		cmbxEntidadesBancarias = new JComboBox(ValoresMaestros.ENTIDADES_BANCARIAS);
		this.cmbxEntidadesBancarias.setSelectedItem(ValoresMaestros.ENTIDADES_BANCARIAS[0]);
		
		JLabel lblNewLabel_5 = new JLabel("NO. CUENTA");

		txtNoCuenta = new JTextField();
		txtNoCuenta.setColumns(10);
		GroupLayout gl_pnlEntidadBancaria = new GroupLayout(pnlEntidadBancaria);
		gl_pnlEntidadBancaria.setHorizontalGroup(gl_pnlEntidadBancaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlEntidadBancaria.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlEntidadBancaria.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlEntidadBancaria.createSequentialGroup().addComponent(lblNewLabel_2)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(cmbxEntidadesBancarias, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlEntidadBancaria.createSequentialGroup().addComponent(lblNewLabel_5)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(txtNoCuenta,
												GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(317, Short.MAX_VALUE)));
		gl_pnlEntidadBancaria.setVerticalGroup(gl_pnlEntidadBancaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlEntidadBancaria.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlEntidadBancaria.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2).addComponent(cmbxEntidadesBancarias,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_pnlEntidadBancaria.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5).addComponent(txtNoCuenta, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(36, Short.MAX_VALUE)));
		pnlEntidadBancaria.setLayout(gl_pnlEntidadBancaria);
		pnlContraFactura.setLayout(gl_pnlContraFactura);

		cmbxServicioMovilSolicitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (getThis().getCmbxServicioMovilSolicitado().getSelectedItem().toString()) {
				case "PORTABILIDAD PREPAGO":
					getThis().txtCodigoNIP.setEditable(true);
					getThis().txtNumPortarMigrar.setEditable(true);
					getThis().cmbxOperadorDonante.setModel(new DefaultComboBoxModel(ValoresMaestros.OPERADORA_DONANTE));
					getThis().cmbxOperadorDonante.setEnabled(true);
					break;
				case "PORTABILIDAD POSPAGO":
					getThis().txtCodigoNIP.setEditable(false);
					getThis().txtCodigoNIP.setText("");
					getThis().txtNumPortarMigrar.setEditable(true);
					getThis().cmbxOperadorDonante.setModel(new DefaultComboBoxModel(ValoresMaestros.OPERADORA_DONANTE));
					getThis().cmbxOperadorDonante.setEnabled(true);
					break;

				case "MIGRACION":
					getThis().txtCodigoNIP.setEditable(false);
					getThis().txtCodigoNIP.setText("");
					getThis().txtNumPortarMigrar.setEditable(true);
					getThis().cmbxOperadorDonante.setModel(new DefaultComboBoxModel());
					getThis().cmbxOperadorDonante.setEnabled(false);
					break;

				case "LINEA NUEVA":
					getThis().txtCodigoNIP.setEditable(false);
					getThis().txtCodigoNIP.setText("");
					getThis().txtNumPortarMigrar.setEditable(false);
					getThis().txtNumPortarMigrar.setText("");
					
					getThis().cmbxOperadorDonante.setModel(new DefaultComboBoxModel());
					getThis().cmbxOperadorDonante.setEnabled(false);
					break;

				default:

					break;

				}
			}
		});

		if (getThis().getCmbxFormaPago().getSelectedItem().toString().equals("CONTRA FACTURA")) {
			ventanaContraFactura();
			// Esta condicion setea la ventana respecto a como se encuentre en el combobox
			// de la forma de pago
		}

		cmbxFormaPago.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch (getThis().getCmbxFormaPago().getSelectedItem().toString()) {

				// {"CONTRA FACTURA", "DEBITO CTA. AHORROS", "DEBIDO CTA. CORRIENTE", "TARJETA
				// DE CREDITO"};

				case "CONTRA FACTURA":
					
					getThis().cmbxEntidadesBancarias.setModel(new DefaultComboBoxModel(ValoresMaestros.ENTIDADES_BANCARIAS));
					getThis().cmbxEntidadesBancarias.setEnabled(false);
					getThis().txtNoCuenta.setText("");
					getThis().txtNoCuenta.setEnabled(false);
					getThis().txtNoTarjetaCredito.setText("");
					getThis().txtNoTarjetaCredito.setEnabled(false);
					getThis().cmbxMarcaTarjetaCredito.setModel(new DefaultComboBoxModel());
					getThis().cmbxMarcaTarjetaCredito.setSelectedItem("");
					getThis().cmbxMarcaTarjetaCredito.setEnabled(false);
					getThis().spnAnioExpiracion.setValue(0);
					getThis().spnAnioExpiracion.setEnabled(false);
					getThis().spnMesExpiracion.setValue(0);
					getThis().spnMesExpiracion.setEnabled(false);
					getThis().txtCodCSV.setText("");
					getThis().txtCodCSV.setEnabled(false);
					getThis().cmbxEntidadesBancarias.setSelectedItem("");
					getThis().cmbxMarcaTarjetaCredito.setSelectedItem("");
					
					break;

				case "DEBITO CTA. AHORROS":
					getThis().ventanaCuentaBancaria();
					break;

				case "DEBIDO CTA. CORRIENTE":
					getThis().ventanaCuentaBancaria();
					break;
				case "TARJETA DE CREDITO":
					getThis().ventanaTarjetaCredito();
					break;

				}
			}

		});

	}

	public void ventanaContraFactura() {
		getThis().cmbxEntidadesBancarias.setModel(new DefaultComboBoxModel(ValoresMaestros.ENTIDADES_BANCARIAS));
		getThis().cmbxEntidadesBancarias.setEnabled(false);
		getThis().txtNoCuenta.setText("");
		getThis().txtNoCuenta.setEnabled(false);
		getThis().txtNoTarjetaCredito.setText("");
		getThis().txtNoTarjetaCredito.setEnabled(false);
		getThis().cmbxMarcaTarjetaCredito.setModel(new DefaultComboBoxModel());
		getThis().cmbxMarcaTarjetaCredito.setSelectedItem("");
		getThis().cmbxMarcaTarjetaCredito.setEnabled(false);
		getThis().spnAnioExpiracion.setValue(0);
		getThis().spnAnioExpiracion.setEnabled(false);
		getThis().spnMesExpiracion.setValue(0);
		getThis().spnMesExpiracion.setEnabled(false);
		getThis().txtCodCSV.setText("");
		getThis().txtCodCSV.setEnabled(false);
		getThis().cmbxEntidadesBancarias.setSelectedItem("");
		getThis().cmbxMarcaTarjetaCredito.setSelectedItem("");
	}

	public void ventanaCuentaBancaria() {
		getThis().cmbxEntidadesBancarias.setModel(new DefaultComboBoxModel(ValoresMaestros.ENTIDADES_BANCARIAS));
		getThis().cmbxEntidadesBancarias.setEnabled(true);
		getThis().txtNoCuenta.setEnabled(true);
		getThis().txtNoTarjetaCredito.setText("");
		getThis().txtNoTarjetaCredito.setEnabled(false);
		//getThis().cmbxMarcaTarjetaCredito.setModel(new DefaultComboBoxModel());
		getThis().cmbxMarcaTarjetaCredito.setEnabled(false);
		getThis().spnAnioExpiracion.setValue(0);
		getThis().spnAnioExpiracion.setEnabled(false);
		getThis().spnMesExpiracion.setValue(0);
		getThis().spnMesExpiracion.setEnabled(false);
		getThis().txtCodCSV.setText("");
		getThis().txtCodCSV.setEnabled(false);
		getThis().cmbxEntidadesBancarias.setSelectedItem("");
		getThis().cmbxMarcaTarjetaCredito.setSelectedItem("");
	}

	public void ventanaTarjetaCredito() {
		getThis().cmbxEntidadesBancarias.setModel(new DefaultComboBoxModel(ValoresMaestros.ENTIDADES_BANCARIAS));
		getThis().cmbxEntidadesBancarias.setEnabled(true);
		getThis().txtNoCuenta.setText("");
		getThis().txtNoCuenta.setEnabled(false);
		getThis().txtNoTarjetaCredito.setEnabled(true);
		getThis().cmbxMarcaTarjetaCredito.setModel(new DefaultComboBoxModel(ValoresMaestros.MARCAS_TARJETAS_CREDITO));
		getThis().cmbxMarcaTarjetaCredito.setEnabled(true);

		getThis().spnAnioExpiracion.setEnabled(true);
		getThis().spnAnioExpiracion.setValue(2000);
		getThis().spnMesExpiracion.setEnabled(true);
		getThis().spnMesExpiracion.setValue(1);
		getThis().txtCodCSV.setEnabled(true);
		getThis().cmbxEntidadesBancarias.setSelectedItem("");
		getThis().cmbxMarcaTarjetaCredito.setSelectedItem("");
	}

	public void cargarListaAsesoresComerciales() {
		// cargar nombres de asesores
		this.cantidadAsesores = 0;
		try {

			cantidadAsesores = this.oFrmProcesoComercial.getoEmpresa().getLstAsesoresComerciales().size();

		} catch (Exception e) {

		}

		this.cmbxAsesor.addItem("SELECCIONE UNO");

		for (int i = 0; i < cantidadAsesores; i++) {
			this.cmbxAsesor.addItem(this.getoFrmProcesoComercial().getoEmpresa().getLstAsesoresComerciales().get(i)
					.getNombre().toString());
		}

	}

	public void cargarListaSupervisores() {
		this.cantidadSupervisores = 0;
		try {
			cantidadSupervisores = this.oFrmProcesoComercial.getoEmpresa().getLstSupervisores().size();

		}catch(Exception e) {
			
		}
		this.cmbxSupervisor.addItem("SELECCIONE UNO");

		for (int i = 0; i < cantidadSupervisores; i++) {
			this.cmbxSupervisor.addItem(this.getoFrmProcesoComercial().getoEmpresa().getLstSupervisores().get(i)
					.getNombre().toString());
		}

		
	}
	
	public void pantallaActualizarRegistro() {
		this.btnActualizar.setVisible(true);
		this.btnEnviar.setVisible(false);
		this.btnGenerarAcuse.setVisible(true);
		this.setVisible(true);
		this.cmbxEstadoVenta.setEnabled(true);
		this.txtSolicitudCredito.setEditable(true);
		this.txtSolicitudCredito.setEnabled(true);
		this.cmbxAsesor.setEnabled(false);
		this.cmbxSupervisor.setEnabled(false);
	}

	public boolean validarIngresoFormulario() {
		return true;
	}

	public ItnFrmFormularioIngresoVenta getThis() {
		return this;
	}

	public JComboBox getCmbxTipoPlanPospago() {
		return cmbxTipoPlanPospago;
	}

	public void setCmbxTipoPlanPospago(JComboBox cmbxTipoPlanPospago) {
		this.cmbxTipoPlanPospago = cmbxTipoPlanPospago;
	}

	public JComboBox getCmbxPlanPospago() {
		return cmbxPlanPospago;
	}

	public void setCmbxPlanPospago(JComboBox cmbxPlanPospago) {
		this.cmbxPlanPospago = cmbxPlanPospago;
	}

	public JComboBox getCmbxServicioMovilSolicitado() {
		return cmbxServicioMovilSolicitado;
	}

	public void setCmbxServicioMovilSolicitado(JComboBox cmbxServicioMovilSolicitado) {
		this.cmbxServicioMovilSolicitado = cmbxServicioMovilSolicitado;
	}

	public JTextField getTxtNumPortarMigrar() {
		return txtNumPortarMigrar;
	}

	public void setTxtNumPortarMigrar(JTextField txtNumPortarMigrar) {
		this.txtNumPortarMigrar = txtNumPortarMigrar;
	}

	public JComboBox getCmbxOperadorDonante() {
		return cmbxOperadorDonante;
	}

	public void setCmbxOperadorDonante(JComboBox cmbxOperadorDonante) {
		this.cmbxOperadorDonante = cmbxOperadorDonante;
	}

	public JComboBox getCmbxFormaPago() {
		return cmbxFormaPago;
	}

	public void setCmbxFormaPago(JComboBox cmbxFormaPago) {
		this.cmbxFormaPago = cmbxFormaPago;
	}

	public JTextField getTxtNoCuenta() {
		return txtNoCuenta;
	}

	public void setTxtNoCuenta(JTextField txtNoCuenta) {
		this.txtNoCuenta = txtNoCuenta;
	}

	public JTextField getTxtNoTarjetaCredito() {
		return txtNoTarjetaCredito;
	}

	public void setTxtNoTarjetaCredito(JTextField txtNoTarjetaCredito) {
		this.txtNoTarjetaCredito = txtNoTarjetaCredito;
	}

	public JComboBox getCmbxEntidadesBancarias() {
		return cmbxEntidadesBancarias;
	}

	public void setCmbxEntidadesBancarias(JComboBox cmbxEntidadesBancarias) {
		this.cmbxEntidadesBancarias = cmbxEntidadesBancarias;
	}

	public JComboBox getCmbxMarcaTarjetaCredito() {
		return cmbxMarcaTarjetaCredito;
	}

	public void setCmbxMarcaTarjetaCredito(JComboBox cmbxMarcaTarjetaCredito) {
		this.cmbxMarcaTarjetaCredito = cmbxMarcaTarjetaCredito;
	}

	public JSpinner getSpnAnioExpiracion() {
		return spnAnioExpiracion;
	}

	public void setSpnAnioExpiracion(JSpinner spnAnioExpiracion) {
		this.spnAnioExpiracion = spnAnioExpiracion;
	}

	public JSpinner getSpnMesExpiracion() {
		return spnMesExpiracion;
	}

	public void setSpnMesExpiracion(JSpinner spnMesExpiracion) {
		this.spnMesExpiracion = spnMesExpiracion;
	}

	public JTextField getTxtCodCSV() {
		return txtCodCSV;
	}

	public void setTxtCodCSV(JTextField txtCodCSV) {
		this.txtCodCSV = txtCodCSV;
	}

	public FrmProcesoComercial getoFrmProcesoComercial() {
		return oFrmProcesoComercial;
	}

	public void setoFrmProcesoComercial(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;
	}

	public JTextField getTxtApellidosCliente() {
		return txtApellidosCliente;
	}

	public void setTxtApellidosCliente(JTextField txtApellidosCliente) {
		this.txtApellidosCliente = txtApellidosCliente;
	}

	public JTextField getTxtNombresCliente() {
		return txtNombresCliente;
	}

	public void setTxtNombresCliente(JTextField txtNombresCliente) {
		this.txtNombresCliente = txtNombresCliente;
	}

	public JTabbedPane getFormularioPrincipal() {
		return formularioPrincipal;
	}

	public void setFormularioPrincipal(JTabbedPane formularioPrincipal) {
		this.formularioPrincipal = formularioPrincipal;
	}

	public Date getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(Date fechaActual) {
		this.fechaActual = fechaActual;
	}

	public JTextField getTxtCorreoElectronicoCliente() {
		return txtCorreoElectronicoCliente;
	}

	public void setTxtCorreoElectronicoCliente(JTextField txtCorreoElectronicoCliente) {
		this.txtCorreoElectronicoCliente = txtCorreoElectronicoCliente;
	}

	public JTextField getTxtCelular1Cliente() {
		return txtCelular1Cliente;
	}

	public void setTxtCelular1Cliente(JTextField txtCelular1Cliente) {
		this.txtCelular1Cliente = txtCelular1Cliente;
	}

	public JTextField getTxtCelular2Cliente() {
		return txtCelular2Cliente;
	}

	public void setTxtCelular2Cliente(JTextField txtCelular2Cliente) {
		this.txtCelular2Cliente = txtCelular2Cliente;
	}

	public JTextField getTxtConvencionalCliente() {
		return txtConvencionalCliente;
	}

	public void setTxtConvencionalCliente(JTextField txtConvencionalCliente) {
		this.txtConvencionalCliente = txtConvencionalCliente;
	}

	public JTextField getTxtReferenciaInstalacionCliente() {
		return txtReferenciaInstalacionCliente;
	}

	public void setTxtReferenciaInstalacionCliente(JTextField txtReferenciaInstalacionCliente) {
		this.txtReferenciaInstalacionCliente = txtReferenciaInstalacionCliente;
	}

	public int getLineasSolicitadas() {
		return lineasSolicitadas;
	}

	public void setLineasSolicitadas(int lineasSolicitadas) {
		this.lineasSolicitadas = lineasSolicitadas;
	}

	public JTextField getTxtCodigoNIP() {
		return txtCodigoNIP;
	}

	public void setTxtCodigoNIP(JTextField txtCodigoNIP) {
		this.txtCodigoNIP = txtCodigoNIP;
	}

	public JTextField getTxtCorreoSupervisor() {
		return txtCorreoSupervisor;
	}

	public void setTxtCorreoSupervisor(JTextField txtCorreoSupervisor) {
		this.txtCorreoSupervisor = txtCorreoSupervisor;
	}

	public JTextField getTxtCorreoAsesor() {
		return txtCorreoAsesor;
	}

	public void setTxtCorreoAsesor(JTextField txtCorreoAsesor) {
		this.txtCorreoAsesor = txtCorreoAsesor;
	}

	public JPanel getTxtNumeroPortarMigrar() {
		return txtNumeroPortarMigrar;
	}

	public void setTxtNumeroPortarMigrar(JPanel txtNumeroPortarMigrar) {
		this.txtNumeroPortarMigrar = txtNumeroPortarMigrar;
	}

	public RSDateChooser getDateFechaNacimientoCliente() {
		return dateFechaNacimientoCliente;
	}

	public void setDateFechaNacimientoCliente(RSDateChooser dateFechaNacimientoCliente) {
		this.dateFechaNacimientoCliente = dateFechaNacimientoCliente;
	}

	public JComboBox getCmbxTipoDocumentoCliente() {
		return cmbxTipoDocumentoCliente;
	}

	public void setCmbxTipoDocumentoCliente(JComboBox cmbxTipoDocumentoCliente) {
		this.cmbxTipoDocumentoCliente = cmbxTipoDocumentoCliente;
	}

	public JFormattedTextField getFtxtNumDocumentoCliente() {
		return ftxtNumDocumentoCliente;
	}

	public void setFtxtNumDocumentoCliente(JFormattedTextField ftxtNumDocumentoCliente) {
		this.ftxtNumDocumentoCliente = ftxtNumDocumentoCliente;
	}

	public JComboBox getComboBox() {
		return cmbxEstadoCivilCliente;
	}

	public void setComboBox(JComboBox comboBox) {
		this.cmbxEstadoCivilCliente = comboBox;
	}

	public JComboBox getCmbxAsesor() {
		return cmbxAsesor;
	}

	public void setCmbxAsesor(JComboBox cmbxAsesor) {
		this.cmbxAsesor = cmbxAsesor;
	}

	public JComboBox getCmbxSupervisor() {
		return cmbxSupervisor;
	}

	public void setCmbxSupervisor(JComboBox cmbxSupervisor) {
		this.cmbxSupervisor = cmbxSupervisor;
	}

	public int getCantidadAsesores() {
		return cantidadAsesores;
	}

	public void setCantidadAsesores(int cantidadAsesores) {
		this.cantidadAsesores = cantidadAsesores;
	}

	public int getCantidadSupervisores() {
		return cantidadSupervisores;
	}

	public void setCantidadSupervisores(int cantidadSupervisores) {
		this.cantidadSupervisores = cantidadSupervisores;
	}

	public JTextArea getTxtAreaDireccionDomicilioCliente() {
		return txtAreaDireccionDomicilioCliente;
	}

	public void setTxtAreaDireccionDomicilioCliente(JTextArea txtAreaDireccionDomicilioCliente) {
		this.txtAreaDireccionDomicilioCliente = txtAreaDireccionDomicilioCliente;
	}

	public JTextArea getTxtAreaDireccionLaboralCliente() {
		return txtAreaDireccionLaboralCliente;
	}

	public void setTxtAreaDireccionLaboralCliente(JTextArea txtAreaDireccionLaboralCliente) {
		this.txtAreaDireccionLaboralCliente = txtAreaDireccionLaboralCliente;
	}

	public JComboBox getCmbxEstadoCivilCliente() {
		return cmbxEstadoCivilCliente;
	}

	public void setCmbxEstadoCivilCliente(JComboBox cmbxEstadoCivilCliente) {
		this.cmbxEstadoCivilCliente = cmbxEstadoCivilCliente;
	}

	public JComboBox getCmbxEstadoVenta() {
		return cmbxEstadoVenta;
	}

	public void setCmbxEstadoVenta(JComboBox cmbxEstadoVenta) {
		this.cmbxEstadoVenta = cmbxEstadoVenta;
	}

	public JTextField getTxtSolicitudCredito() {
		return txtSolicitudCredito;
	}

	public void setTxtSolicitudCredito(JTextField txtSolicitudCredito) {
		this.txtSolicitudCredito = txtSolicitudCredito;
	}

	public JButton getBtnGenerarAcuse() {
		return btnGenerarAcuse;
	}

	public void setBtnGenerarAcuse(JButton btnGenerarAcuse) {
		this.btnGenerarAcuse = btnGenerarAcuse;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public Venta getoVenta() {
		return oVenta;
	}

	public void setoVenta(Venta oVenta) {
		this.oVenta = oVenta;
	}
	
	
	
}
