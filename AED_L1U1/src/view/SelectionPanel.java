package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectionPanel extends JPanel {

	private JLabel lbChooseMethod;
	private JCheckBox chkQuickSort, chkMergeSort, chkHeapSort;

	public SelectionPanel() {
		// TODO Auto-generated constructor stub
		lbChooseMethod = new JLabel("Escoja el método de ordenamiento:");
		chkQuickSort = new JCheckBox("QuickSort");
		chkMergeSort = new JCheckBox("MergeSort");
		chkHeapSort = new JCheckBox("HeapSort");
		JPanel panelAux1 = new JPanel();
		panelAux1.setLayout(new GridLayout(1, 3));
		chkHeapSort.setBackground(Color.BLUE);
		chkMergeSort.setBackground(Color.BLUE);
		chkQuickSort.setBackground(Color.BLUE);
		panelAux1.add(chkQuickSort);
		panelAux1.add(chkMergeSort);
		panelAux1.add(chkHeapSort);
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		add(lbChooseMethod, BorderLayout.NORTH);
		add(panelAux1, BorderLayout.CENTER);

	}

}
