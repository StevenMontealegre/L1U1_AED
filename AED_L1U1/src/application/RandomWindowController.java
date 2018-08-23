package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import view.MainView;

public class RandomWindowController {

	
	private MainView main;
	
	
	
	@FXML 
	private TextField minField;
	@FXML 
	private TextField maxField;
	@FXML 
	private TextField nField;
	@FXML 
	private Button generateBut;
	@FXML
	private CheckBox sortedBox;
	@FXML
	private CheckBox randomBox;
	@FXML
	private CheckBox invertedBox;
	@FXML 
	private CheckBox percetageBox;
	
	public RandomWindowController(MainView main)
	{
		this.main = main;
	}
	
	@FXML
	public void actionPerformed(ActionEvent event)
	{
		double min = Double.parseDouble(minField.getText());
		double max = Double.parseDouble(maxField.getText());
		int n = Integer.parseInt(nField.getText());	
		
		
	}
	
}
