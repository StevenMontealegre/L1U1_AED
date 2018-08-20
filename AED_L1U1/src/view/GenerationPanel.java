package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GenerationPanel extends JPanel {

	private JLabel lbNumberElements, lbLowerBound, lbUpperBound, lbDisorderPorcent, lbManualInput;
	private JTextField txtNumberElements, txtLowerBound, txtUpperBound, txtDisorderPorcent, txtManualInput;
	private JCheckBox chkRepeatNumbers, chkGenerateOrder, chkReverseOrdering, chkRamdonGenerate;

	public GenerationPanel() {
		// TODO Auto-generated constructor stub
		lbNumberElements = new JLabel("Número de elementos:");
		lbLowerBound = new JLabel("Cota inferior:");
		lbUpperBound = new JLabel("Cota superior:");
		txtNumberElements = new JTextField();
		txtLowerBound = new JTextField();
		txtUpperBound = new JTextField();

		lbManualInput = new JLabel("Ingrese los números que desea ordenar sin espacios y separados por una coma:");
		txtManualInput = new JTextField();

		lbDisorderPorcent = new JLabel("Porcentaje desorden:");
		txtDisorderPorcent = new JTextField();

		chkGenerateOrder = new JCheckBox("Generación ordenada");
		chkRamdonGenerate = new JCheckBox("Generación aleatoria");
		chkRepeatNumbers = new JCheckBox("Números repetidos");
		chkReverseOrdering = new JCheckBox("Ordenamiento inverso");
		setBackground(Color.BLUE);
		txtDisorderPorcent.setBackground(Color.BLUE);
		txtLowerBound.setBackground(Color.BLUE);
		txtManualInput.setBackground(Color.BLUE);
		txtNumberElements.setBackground(Color.BLUE);
		txtUpperBound.setBackground(Color.BLUE);
		setLayout(new BorderLayout());
		JPanel panelAux1 = new JPanel();
		panelAux1.setLayout(new GridLayout(3, 2));
		panelAux1.add(lbNumberElements);
		panelAux1.add(txtNumberElements);
		panelAux1.add(lbLowerBound);
		panelAux1.add(txtLowerBound);
		panelAux1.add(lbUpperBound);
		panelAux1.add(txtUpperBound);
		panelAux1.setBackground(Color.BLUE);
		JPanel panelAux2 = new JPanel();
		panelAux2.setLayout(new GridLayout(5, 1));
		panelAux2.add(chkRepeatNumbers);
		chkGenerateOrder.setBackground(Color.BLUE);
		chkRamdonGenerate.setBackground(Color.BLUE);
		chkRepeatNumbers.setBackground(Color.BLUE);
		chkReverseOrdering.setBackground(Color.BLUE);
		panelAux2.add(chkGenerateOrder);
		panelAux2.add(chkReverseOrdering);
		panelAux2.add(chkRamdonGenerate);
		panelAux2.setBackground(Color.BLUE);
		JPanel panelAux5 = new JPanel();
		panelAux5.setLayout(new GridLayout(1, 2));
		panelAux5.add(lbDisorderPorcent);
		panelAux5.add(txtDisorderPorcent);
		panelAux5.setBackground(Color.BLUE);
		panelAux2.add(panelAux5);
		panelAux2.setBorder(new TitledBorder("Configuración avanzada"));
		JPanel panelAux3 = new JPanel();
		panelAux3.setLayout(new GridLayout(2, 1));
		panelAux3.add(lbManualInput);
		panelAux3.add(txtManualInput);
		panelAux3.setBorder(new TitledBorder("Generación Manual"));
		panelAux3.setBackground(Color.BLUE);
		JPanel panelAux4 = new JPanel();
		panelAux4.setLayout(new GridLayout(2, 1));
		panelAux4.setBorder(new TitledBorder("Generación Aleatoria"));
		panelAux4.add(panelAux1);
		panelAux4.add(panelAux2);
		panelAux4.setBackground(Color.BLUE);
		add(panelAux4, BorderLayout.WEST);
		add(panelAux3, BorderLayout.EAST);

	}

}
