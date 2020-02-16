package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;

public class ItnFrmFormularioIngresoVenta extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ItnFrmFormularioIngresoVenta() {
		setBounds(100, 100, 479, 484);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("FORMULARIO INGRESO DE VENTAS");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		panel_1.add(btnNewButton_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
	}

}
