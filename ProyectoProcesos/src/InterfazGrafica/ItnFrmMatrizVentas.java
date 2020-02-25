package InterfazGrafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class ItnFrmMatrizVentas extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItnFrmMatrizVentas frame = new ItnFrmMatrizVentas();
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
	public ItnFrmMatrizVentas() {
		setBounds(100, 100, 450, 300);

	}

}
