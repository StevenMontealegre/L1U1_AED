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
	public final static String TOACCEPT = "toAccept";

	public VisualitationPanel() {
		// TODO Auto-generated constructor stub

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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
