package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ClasesAbstractas.Usuario;
import ProcesoComercial.Empresa;
import ProcesoComercial.ProcesoComercialMain;

public class FrmProcesoComercial extends JFrame {

	private Empresa oEmpresa;
	private Image frameIcono;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnInicio;
	private JMenu mnVentas;
	private JMenuItem mntnNuevoFormulario;
	private JMenuItem mntnSalir;
	private JMenuItem mntnMatrizIngresoVenta;
	private JMenuItem mntnMatrizConsultas;
	private JMenuItem mntnReportes;
	private JMenuItem mntnIniciarSesion;
	private JDesktopPane desktopPane;
	private JDialog jDialogLogin;
	private JButton bLogin;
	private JLabel label_user;
	private JLabel label_pass;
	private JTextField campo_user;
	private JPasswordField campo_pass;
	private JMenuItem mntnCrearUsuario;
	private JDialog jDialogCrear;
	private JButton bCrear;
	private JLabel label_newUsuario;
	private JLabel label_newPass;
	private JTextField campo_newUsuario;
	private JPasswordField campo_newPass;
	private JDUsuario oJDIniciarSesion;
	private JDUsuario oJDCrearUsuario;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public FrmProcesoComercial() {
		
		this.oEmpresa = new Empresa();
		this.oEmpresa.setoFrmProcesoComercial(getThis());
		this.setoEmpresa(oEmpresa);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// this.frameIcono = new
		// ImageIcon(getClass().getResource("/Recursos/jXFQWIbk_400x400.jpg")).getImage();
		setIconImage(this.frameIcono);

		this.setExtendedState(MAXIMIZED_BOTH);
		this.construirMenu();
		this.construirDesktopPane();
	}

	public void construirMenu() {
		this.menuBar = new JMenuBar();
		this.setJMenuBar(this.menuBar);

		this.mnInicio = new JMenu("INICIO");
		this.menuBar.add(mnInicio);

		this.mnVentas = new JMenu("VENTAS");
		this.menuBar.add(mnVentas);

		// MenuItems del menu Inicio
		this.mntnIniciarSesion = new JMenuItem("INICIAR SESION");
		mntnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				getThis().oJDIniciarSesion = new JDUsuario("INICIAR_SESION");
				getThis().oJDIniciarSesion.setVisible(true);
				getThis().oJDIniciarSesion.setoFrmProcesoComercial(getThis());
				getThis().setoJDIniciarSesion(getThis().oJDIniciarSesion);
				
			}
		});
		this.mnInicio.add(this.mntnIniciarSesion);

		
		
		this.mntnCrearUsuario = new JMenuItem("CREAR USUARIO");
		mntnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	//creando el jdialog de crear usuario
				getThis().oJDCrearUsuario = new JDUsuario("CREAR_USUARIO");
				getThis().oJDCrearUsuario.setVisible(true);
				getThis().oJDCrearUsuario.setoFrmProcesoComercial(getThis());
				getThis().setoJDCrearUsuario(getThis().oJDCrearUsuario);
			}
		});
		this.mnInicio.add(this.mntnCrearUsuario);
		this.mntnCrearUsuario.setEnabled(true);	//solo el admin podra crear usuarios
		
		
		this.mntnSalir = new JMenuItem("SALIR");
		mntnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		this.mnInicio.add(this.mntnSalir);

		// MenuItems del menu Ventas
		this.mntnNuevoFormulario = new JMenuItem("INGRESAR NUEVA VENTA");
		mntnNuevoFormulario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getThis().addItnFrmFormularioIngresoVenta();
			}
		});
		this.mnVentas.add(this.mntnNuevoFormulario);

		this.mntnMatrizIngresoVenta = new JMenuItem("MATRIZ DE VENTAS");
		this.mnVentas.add(this.mntnMatrizIngresoVenta);

		this.mntnMatrizConsultas = new JMenuItem("CONSULTA ESTADO DE VENTAS");
		this.mnVentas.add(this.mntnMatrizConsultas);

		this.mntnReportes = new JMenuItem("REPORTES");
		this.mnVentas.add(this.mntnReportes);

		this.mnVentas.setEnabled(false); //falso hasta que inicie sesion 
	}

	public void construirDesktopPane() {
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}

	// Funciones que agregan internal frames al desktop pane
	public void addItnFrmFormularioIngresoVenta() {
		ItnFrmFormularioIngresoVenta oItnFrmFormularioIngresoVenta = new ItnFrmFormularioIngresoVenta();
		this.desktopPane.add(oItnFrmFormularioIngresoVenta);
		oItnFrmFormularioIngresoVenta.setVisible(true);
	}

	
	
	public JDUsuario getoJDIniciarSesion() {
		return oJDIniciarSesion;
	}

	public void setoJDIniciarSesion(JDUsuario oJDUsuario) {
		this.oJDIniciarSesion = oJDUsuario;
	}
	
	

	public JDUsuario getoJDCrearUsuario() {
		return oJDCrearUsuario;
	}

	public void setoJDCrearUsuario(JDUsuario oJDCrearUsuario) {
		this.oJDCrearUsuario = oJDCrearUsuario;
	}

	public FrmProcesoComercial getThis() {
		return this;
	}

	public Empresa getoEmpresa() {
		return oEmpresa;
	}

	public void setoEmpresa(Empresa oEmpresa) {
		this.oEmpresa = oEmpresa;
	}
	
	
	

}