package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import ClasesAbstractas.ValoresMaestros;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ItnFrmMatrizVentas extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JScrollPane pnlMatrizVentas;
	private JTable tblMatrizVentas;
	private DefaultTableModel mdlMatrizVentas;
	private FrmProcesoComercial oFrmProcesoComercial;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ItnFrmMatrizVentas() {
		
		setBounds(100, 100, 739, 487);
		getContentPane().setLayout(new BorderLayout(0, 0));
		this.setResizable(true);
		//this.setSize(this.getoFrmProcesoComercial().);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTituloMatrizVentas = new JPanel();
		panel.add(pnlTituloMatrizVentas, BorderLayout.NORTH);
		pnlTituloMatrizVentas.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("MATRIZ DE GESTION DE VENTAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnlTituloMatrizVentas.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel pnlBuscadorSolicitudCredito = new JPanel();
		panel_4.add(pnlBuscadorSolicitudCredito);
		
		JButton btnNewButton_3 = new JButton("BUSCAR POR SOLICITUD CREDITO");
		pnlBuscadorSolicitudCredito.add(btnNewButton_3);
		
		textField = new JTextField();
		pnlBuscadorSolicitudCredito.add(textField);
		textField.setColumns(10);
		
		JPanel pnlBusquedaCedula = new JPanel();
		panel_4.add(pnlBusquedaCedula);
		
		JButton btnNewButton_4 = new JButton("BUSCAR POR NUM CEDULA");
		pnlBusquedaCedula.add(btnNewButton_4);
		
		textField_1 = new JTextField();
		pnlBusquedaCedula.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_4.add(panel_1);
		
		JButton btnNewButton_1 = new JButton("BUSCAR POR ID");
		panel_1.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("EDITAR REGISTRO");
		panel_2.add(btnNewButton);
		
		JButton btnCerrar = new JButton("CERRAR VENTANA");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getThis().getoFrmProcesoComercial().cerrarMatrizVentas();
			}
		});
		panel_2.add(btnCerrar);
		
		
		construirTablaMatrizVentas();
	}
	
	public void construirTablaMatrizVentas() {
		
		/*String[] columnas = {"TIPO","NOMBRE","SUELDO","EDAD","CARGO"};
		this.tablaDatos = new JTable();
		this.modelTabla = new DefaultTableModel();
		this.modelTabla.setColumnIdentifiers(columnas);
		this.scrollPane.setViewportView(this.tablaDatos);
		this.tablaDatos.setModel(modelTabla);*/
		
		
		this.pnlMatrizVentas = new JScrollPane();
		this.tblMatrizVentas = new JTable();
		this.mdlMatrizVentas = new DefaultTableModel();
		this.mdlMatrizVentas.setColumnIdentifiers(ValoresMaestros.COLUMNAS_MATRIZ_VENTAS);
		this.pnlMatrizVentas.setViewportView(this.tblMatrizVentas);
		this.tblMatrizVentas.setModel(this.mdlMatrizVentas);
		
		getContentPane().add(pnlMatrizVentas, BorderLayout.CENTER);
		
	}

	public FrmProcesoComercial getoFrmProcesoComercial() {
		return oFrmProcesoComercial;
	}

	public void setoFrmProcesoComercial(FrmProcesoComercial oFrmProcesoComercial) {
		this.oFrmProcesoComercial = oFrmProcesoComercial;
	}
	
	public ItnFrmMatrizVentas getThis() {
		return this;
	}
	

}
