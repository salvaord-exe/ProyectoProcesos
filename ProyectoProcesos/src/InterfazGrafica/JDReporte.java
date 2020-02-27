package InterfazGrafica;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class JDReporte extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVentasIngresadas;
	private JTextField txtVentasOperativas;
	private JTextField txtTotalVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDReporte dialog = new JDReporte();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDReporte() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("VENTAS INGRESADAS");
		txtVentasIngresadas = new JTextField();
		txtVentasIngresadas.setHorizontalAlignment(SwingConstants.CENTER);
		txtVentasIngresadas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtVentasIngresadas.setEditable(false);
		txtVentasIngresadas.setColumns(10);
		JLabel lblVentasOperativas = new JLabel("VENTAS OPERATIVAS");
		txtVentasOperativas = new JTextField();
		txtVentasOperativas.setHorizontalAlignment(SwingConstants.CENTER);
		txtVentasOperativas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtVentasOperativas.setEditable(false);
		txtVentasOperativas.setColumns(10);
		
		JLabel lblTotalVentas = new JLabel("TOTAL VENTAS $");
		
		txtTotalVentas = new JTextField();
		txtTotalVentas.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalVentas.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTotalVentas.setEditable(false);
		txtTotalVentas.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblTotalVentas, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtTotalVentas, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
							.addComponent(lblVentasOperativas, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtVentasOperativas, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(33)
							.addComponent(txtVentasIngresadas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(140, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtVentasIngresadas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVentasOperativas)
						.addComponent(txtVentasOperativas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(22)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTotalVentas)
						.addComponent(txtTotalVentas, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(114, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getThis().setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	
	
	
	public JTextField getTxtVentasIngresadas() {
		return txtVentasIngresadas;
	}

	public void setTxtVentasIngresadas(JTextField txtVentasIngresadas) {
		this.txtVentasIngresadas = txtVentasIngresadas;
	}

	public JTextField getTxtVentasOperativas() {
		return txtVentasOperativas;
	}

	public void setTxtVentasOperativas(JTextField txtVentasOperativas) {
		this.txtVentasOperativas = txtVentasOperativas;
	}

	public JTextField getTxtTotalVentas() {
		return txtTotalVentas;
	}

	public void setTxtTotalVentas(JTextField txtTotalVentas) {
		this.txtTotalVentas = txtTotalVentas;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JDReporte getThis() {
		return this;
	}
	
}
