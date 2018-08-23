package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import exceptions.EmptyBoxException;

public class SelectionPanel extends JPanel implements ActionListener {

	private JLabel lbChooseMethod;
	private JRadioButton chkQuickSort, chkMergeSort, chkHeapSort;
	public final static String QUICK = "quick";
	public final static String MERGE = "merge";
	public final static String HEAP = "heap";
	private int[] intVector;
	private double[] doubleVector;
	public MainView main;

	public SelectionPanel(MainView m) {
		// TODO Auto-generated constructor stub
		main = m;
		intVector = new int[0];
		doubleVector = new double[0];
		lbChooseMethod = new JLabel("Escoja el método de ordenamiento:");
		chkQuickSort = new JRadioButton("QuickSort");
		chkQuickSort.setActionCommand(QUICK);
		chkQuickSort.addActionListener(this);
		chkMergeSort = new JRadioButton("MergeSort");
		chkMergeSort.setActionCommand(MERGE);
		chkMergeSort.addActionListener(this);
		chkHeapSort = new JRadioButton("HeapSort");
		chkHeapSort.setActionCommand(HEAP);
		chkHeapSort.addActionListener(this);
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

	public JLabel getLbChooseMethod() {
		return lbChooseMethod;
	}

	public void setLbChooseMethod(JLabel lbChooseMethod) {
		this.lbChooseMethod = lbChooseMethod;
	}

	public JRadioButton getChkQuickSort() {
		return chkQuickSort;
	}

	public void setChkQuickSort(JRadioButton chkQuickSort) {
		this.chkQuickSort = chkQuickSort;
	}

	public JRadioButton getChkMergeSort() {
		return chkMergeSort;
	}

	public void setChkMergeSort(JRadioButton chkMergeSort) {
		this.chkMergeSort = chkMergeSort;
	}

	public JRadioButton getChkHeapSort() {
		return chkHeapSort;
	}

	public void setChkHeapSort(JRadioButton chkHeapSort) {
		this.chkHeapSort = chkHeapSort;
	}

	public MainView getMain() {
		return main;
	}

	public void setMain(MainView main) {
		this.main = main;
	}

	public static String getQuick() {
		return QUICK;
	}

	public static String getMerge() {
		return MERGE;
	}

	public static String getHeap() {
		return HEAP;
	}

	public int[] getIntVector() {
		return intVector;
	}

	public void setIntVector(int[] intVector) {
		this.intVector = intVector;
	}

	public double[] getDoubleVector() {
		return doubleVector;
	}

	public void setDoubleVector(double[] doubleVector) {
		this.doubleVector = doubleVector;
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if (command.equalsIgnoreCase(MERGE)) {

			try {
				main.getVisualPanel().getTxtGeneratedVector()
						.setText(main.getModel().printVector(main.getTransformVector()));
			} catch (EmptyBoxException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(), "Invalid input", JOptionPane.INFORMATION_MESSAGE);

			}

		}
		if (command.equalsIgnoreCase(HEAP)) {

			try {
				main.getVisualPanel().getTxtGeneratedVector()
						.setText(main.getModel().printVector(main.getTransformVector()));
			} catch (EmptyBoxException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(), "Invalid input", JOptionPane.INFORMATION_MESSAGE);
			}

		}
		if (command.equalsIgnoreCase(QUICK)) {

			try {
				main.getVisualPanel().getTxtGeneratedVector()
						.setText(main.getModel().printVector(main.getTransformVector()));
			} catch (EmptyBoxException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(), "Invalid input", JOptionPane.INFORMATION_MESSAGE);
			}

		}

	}

}
