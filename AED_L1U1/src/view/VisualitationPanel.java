package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VisualitationPanel extends JPanel implements ActionListener {
	private JLabel lbGeneratedVector, lbOrderedVector;
	private JTextField txtGeneratedVector, txtOrderedVector;
	private JButton btnToAccept;
	private MainView main;
	public final static String TOACCEPT = "toAccept";

	public VisualitationPanel(MainView m) {
		// TODO Auto-generated constructor stub
		main = m;
		lbGeneratedVector = new JLabel("Vector generado: ");
		lbOrderedVector = new JLabel("Vector ordenado: ");
		txtGeneratedVector = new JTextField();
		txtGeneratedVector.setEditable(false);
		txtOrderedVector = new JTextField();
		txtOrderedVector.setEditable(false);
		btnToAccept = new JButton("Aceptar");
		btnToAccept.setActionCommand(TOACCEPT);
		btnToAccept.addActionListener(this);
		setLayout(new GridLayout(3, 2));
		txtGeneratedVector.setBackground(Color.CYAN);
		txtOrderedVector.setBackground(Color.CYAN);
		btnToAccept.setBackground(Color.CYAN);
		Font font = new Font("Agency FB", Font.BOLD, 24);
		btnToAccept.setFont(font);
		setBackground(Color.CYAN);
		add(lbGeneratedVector);
		add(txtGeneratedVector);
		add(lbOrderedVector);
		add(txtOrderedVector);
		add(btnToAccept);

	}

	public JLabel getLbGeneratedVector() {
		return lbGeneratedVector;
	}

	public void setLbGeneratedVector(JLabel lbGeneratedVector) {
		this.lbGeneratedVector = lbGeneratedVector;
	}

	public JLabel getLbOrderedVector() {
		return lbOrderedVector;
	}

	public void setLbOrderedVector(JLabel lbOrderedVector) {
		this.lbOrderedVector = lbOrderedVector;
	}

	public JTextField getTxtGeneratedVector() {
		return txtGeneratedVector;
	}

	public void setTxtGeneratedVector(JTextField txtGeneratedVector) {
		this.txtGeneratedVector = txtGeneratedVector;
	}

	public JTextField getTxtOrderedVector() {
		return txtOrderedVector;
	}

	public void setTxtOrderedVector(JTextField txtOrderedVector) {
		this.txtOrderedVector = txtOrderedVector;
	}

	public JButton getBtnToAccept() {
		return btnToAccept;
	}

	public void setBtnToAccept(JButton btnToAccept) {
		this.btnToAccept = btnToAccept;
	}

	public static String getToaccept() {
		return TOACCEPT;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase(TOACCEPT)) {
			System.out.println("ACEPTAR IS OK");
			main.getVisualPanel().getTxtGeneratedVector().setText(main.getSelecPanel().getDisorderChain());
			main.getVisualPanel().getTxtOrderedVector().setText(main.getSelecPanel().getOrderedChain());
		}
	}

}
