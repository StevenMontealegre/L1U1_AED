package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import exceptions.EmptyBoxException;
import model.Order;

public class MainView extends JFrame {
	private GenerationPanel generPanel;
	private SelectionPanel selecPanel;
	private VisualitationPanel visualPanel;
	private Order model;
	private double[] origenVector;

	public MainView() {
		// TODO Auto-generated constructor stub
		model = new Order();
		generPanel = new GenerationPanel();
		selecPanel = new SelectionPanel(this);
		visualPanel = new VisualitationPanel(this);
		setLayout(new BorderLayout());
		setSize(900, 490);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("CO-PROCESADOR");
		add(generPanel, BorderLayout.NORTH);
		add(selecPanel, BorderLayout.CENTER);
		add(visualPanel, BorderLayout.SOUTH);

	}

<<<<<<< HEAD

	
	
	//REQUIREMENTS MENU
	public void generateSortNumbers(int n, int min, int max)
	{
		double[] sorted = model.quickSort(model.generateNumbers(n, min, max), 0, n-1);
=======
	public double[] getTransformVector() throws EmptyBoxException {
		String[] vector = generPanel.getTxtManualInput().getText().split(",");
		model.isDecimal(vector);
		origenVector = new double[vector.length];
		for (int i = 0; i < vector.length; i++) {
			origenVector[i] = Double.parseDouble(vector[i]);

		}
		return origenVector;
>>>>>>> refs/remotes/origin/master
	}
	
	public void generateRandomNumbers(int n, int min, int max)
	{
		double[] random = model.generateNumbers(n,min,max);
	}
	
	public void generatePercentageSorted(int n, int min, int max, double percentage)
	{
		if(percentage>1)
		{
			percentage/=( percentage/100);
		}
		double[] array = model.quickSort(model.generateNumbers(n, min, max), 0, n-1);
		array = model.sortPercentage(array, percentage);
	}
	
	public void generateInverseSortNumbers(int n, int min, int max)
	{
		double[] array = model.quickSort(model.generateNumbers(n, min, max),0, n-1);
		array = model.invertArray(array);
	}

	public static void main(String[] args) {

		MainView mv = new MainView();
		mv.setVisible(true);

	}

	public Order getModel() {
		return model;
	}

	public void setModel(Order model) {
		this.model = model;
	}

	public GenerationPanel getGenerPanel() {
		return generPanel;
	}

	public void setGenerPanel(GenerationPanel generPanel) {
		this.generPanel = generPanel;
	}

	public SelectionPanel getSelecPanel() {
		return selecPanel;
	}

	public void setSelecPanel(SelectionPanel selecPanel) {
		this.selecPanel = selecPanel;
	}

	public VisualitationPanel getVisualPanel() {
		return visualPanel;
	}

	public void setVisualPanel(VisualitationPanel visualPanel) {
		this.visualPanel = visualPanel;
	}




	public int[] getVector() {
		// TODO Auto-generated method stub
		return null;
	}

}
