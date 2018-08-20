package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import model.Order;

public class MainView extends JFrame {
	private GenerationPanel generPanel;
	private SelectionPanel selecPanel;
	private VisualitationPanel visualPanel;
	private Order model;

	public MainView() {
		// TODO Auto-generated constructor stub
		model = new Order();
		generPanel = new GenerationPanel();
		selecPanel = new SelectionPanel();
		visualPanel = new VisualitationPanel();
		setLayout(new BorderLayout());
		setSize(900, 490);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("CO-PROCESADOR");
		add(generPanel, BorderLayout.NORTH);
		add(selecPanel, BorderLayout.CENTER);
		add(visualPanel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {

		MainView mv = new MainView();
		mv.setVisible(true);

	}
}
