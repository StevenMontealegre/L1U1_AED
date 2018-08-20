package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SelectionPanel extends JPanel {

	private JLabel lbChooseMethod;
	private JRadioButton chkQuickSort, chkMergeSort, chkHeapSort;

	public SelectionPanel() {
		// TODO Auto-generated constructor stub
		lbChooseMethod = new JLabel("Escoja el método de ordenamiento:");
		chkQuickSort = new JRadioButton("QuickSort");
		chkMergeSort = new JRadioButton("MergeSort");
		chkHeapSort = new JRadioButton("HeapSort");
		ButtonGroup group = new ButtonGroup();
		group.add(chkHeapSort);
		group.add(chkMergeSort);
		group.add(chkQuickSort);
		JPanel panelAux1 = new JPanel();
		panelAux1.setLayout(new GridLayout(1, 3));
		chkHeapSort.setBackground(Color.CYAN);
		chkMergeSort.setBackground(Color.CYAN);
		chkQuickSort.setBackground(Color.CYAN);
		panelAux1.add(chkQuickSort);
		panelAux1.add(chkMergeSort);
		panelAux1.add(chkHeapSort);
		setLayout(new BorderLayout());
		setBackground(Color.CYAN);
		add(lbChooseMethod, BorderLayout.NORTH);
		add(panelAux1, BorderLayout.CENTER);

	}

}
