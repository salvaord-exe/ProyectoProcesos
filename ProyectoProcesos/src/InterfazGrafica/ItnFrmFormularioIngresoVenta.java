package InterfazGrafica;

import java.awt.EventQueue;



import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.util.Date;

import ClasesAbstractas.*;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import rojeru_san.componentes.RSCalendar;
import rojeru_san.componentes.RSDateChooser;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ItnFrmFormularioIngresoVenta extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTabbedPane formularioPrincipal;
	private Date fechaActual;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private int lineasSolicitadas;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ItnFrmFormularioIngresoVenta() {
		this.fechaActual = new Date();
		this.constructorInicial();
		this.constructorPageVendedor();
		this.constructorPageCliente();
		this.constructorServiciosMoviles();
		
	}
	
	public void constructorInicial() {
		setBounds(100, 100, 685, 520);
		getContentPane().setLayout(new BorderLayout(0, 0));
		this.setClosable(true);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("FORMULARIO DE INGRESO DE VENTAS");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		panel_1.add(btnNewButton_1);
		
		this.formularioPrincipal = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(formularioPrincipal, BorderLayout.CENTER);
		
		
		
	}
	
	public void constructorPageVendedor() {
		JScrollPane scrollPaneVendedor = new JScrollPane();
		this.formularioPrincipal.addTab("VENDEDOR", null, scrollPaneVendedor, null);
		
		JPanel panel_2 = new JPanel();
		scrollPaneVendedor.setColumnHeaderView(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("ASESOR");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label = new JLabel("SUPERVISOR");
		
		JComboBox comboBox_1 = new JComboBox();
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL - ASESOR");
		
		JLabel label_1 = new JLabel("EMAIL - SUPERVISOR");
		
		
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		
		
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
							.addGap(50)
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(label_1))
							.addGap(28)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(443, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(label)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(146, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
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
		gl_pageCliente.setHorizontalGroup(
			gl_pageCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pageCliente.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pageCliente.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlDireccionDomiciliaria, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_pageCliente.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(pnlDatosContacto, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(pnlDatosPersonales, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_pageCliente.setVerticalGroup(
			gl_pageCliente.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pageCliente.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnlDatosPersonales, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlDatosContacto, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlDireccionDomiciliaria, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblNewLabel_3 = new JLabel("Direcci\u00F3n Domicilaria");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblDireccinDelTrabajo = new JLabel("Direcci\u00F3n del Trabajo");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JLabel lblNewLabel_4 = new JLabel("Referencia para instalaci\u00F3n");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		GroupLayout gl_pnlDireccionDomiciliaria = new GroupLayout(pnlDireccionDomiciliaria);
		gl_pnlDireccionDomiciliaria.setHorizontalGroup(
			gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3)
						.addComponent(scrollPane_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 594, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDireccinDelTrabajo, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_pnlDireccionDomiciliaria.setVerticalGroup(
			gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDireccionDomiciliaria.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDireccionDomiciliaria.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addComponent(lblDireccinDelTrabajo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_2.setViewportView(textArea_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		pnlDireccionDomiciliaria.setLayout(gl_pnlDireccionDomiciliaria);
		
		JLabel lblCorreoElectronico = new JLabel("CORREO ELECTRONICO");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblCelular = new JLabel("CELULAR 1");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblCelular_1 = new JLabel("CELULAR 2");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblConvencional = new JLabel("CONVENCIONAL");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		GroupLayout gl_pnlDatosContacto = new GroupLayout(pnlDatosContacto);
		gl_pnlDatosContacto.setHorizontalGroup(
			gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosContacto.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
							.addComponent(lblCorreoElectronico, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
							.addComponent(lblCelular, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
							.addComponent(lblCelular_1, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosContacto.createSequentialGroup()
							.addComponent(lblConvencional, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(265, Short.MAX_VALUE))
		);
		gl_pnlDatosContacto.setVerticalGroup(
			gl_pnlDatosContacto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosContacto.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCorreoElectronico)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCelular)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCelular_1)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnlDatosContacto.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConvencional)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		pnlDatosContacto.setLayout(gl_pnlDatosContacto);
		
		JLabel label_2 = new JLabel("APELLIDOS");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("TIPO DE DOCUMENTO");
		
		JComboBox comboBox_2 = new JComboBox(ValoresMaestros.TIPOS_DOCUMENTOS);
		
		JLabel label_4 = new JLabel("NOMBRES");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel label_5 = new JLabel("NUM DOCUMENTO");
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		RSDateChooser dateChooser = new RSDateChooser();
		dateChooser.setColorForeground(Color.GRAY);
		dateChooser.setColorDiaActual(Color.GRAY);
		dateChooser.setColorButtonHover(Color.GRAY);
		dateChooser.setColorBackground(Color.GRAY);
		
		JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO");
		
		JLabel lblEstadoCivil = new JLabel("ESTADO CIVIL");
		
		JComboBox comboBox = new JComboBox(ValoresMaestros.ESTADO_CIVIL);
		GroupLayout gl_pnlDatosPersonales = new GroupLayout(pnlDatosPersonales);
		gl_pnlDatosPersonales.setHorizontalGroup(
			gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblFechaNacimiento, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
									.addGap(10)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
										.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(lblEstadoCivil, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		gl_pnlDatosPersonales.setVerticalGroup(
			gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5))
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addGap(24)
							.addComponent(lblFechaNacimiento))
						.addGroup(gl_pnlDatosPersonales.createSequentialGroup()
							.addGap(18)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_pnlDatosPersonales.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEstadoCivil)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31))
		);
		pnlDatosPersonales.setLayout(gl_pnlDatosPersonales);
		pageCliente.setLayout(gl_pageCliente);
		

	}
	
	public void constructorServiciosMoviles() {
		this.lineasSolicitadas = 0;
		JScrollPane scrollPaneServicios = new JScrollPane();
		formularioPrincipal.addTab("SERVICIOS MOVILES", null, scrollPaneServicios, null);
		
		JPanel pnlServiciosMoviles = new JPanel();
		scrollPaneServicios.setViewportView(pnlServiciosMoviles);
		pnlServiciosMoviles.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 662, 91);
		pnlServiciosMoviles.add(panel);
		
		JLabel label = new JLabel("SERVICIO MOVIL SOLICITADO");
		
		JComboBox comboBox = new JComboBox(ValoresMaestros.TIPOS_SERVICIO_MOVIL);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 625, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(296, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 91, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		Border titleDetalleServiciosMoviles = new TitledBorder(new EtchedBorder(), "TIPOS DE SERVICIOS MOVILES");
	}
	
	public ItnFrmFormularioIngresoVenta getThis() {
		return this;
	}
	
}
