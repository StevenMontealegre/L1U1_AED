package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Model;
import model.Order;
import view.MainView;

public class RandomWindowController implements Initializable {


	
	private Model model;
	private int option;
	
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
	private CheckBox percentageBox;
	@FXML 
	private TextField percentageTxt;
	@FXML
	private ListView listView;
	
	
	@FXML
	public void actionPerformed(ActionEvent event)
	{
		int min = Integer.parseInt(minField.getText());
		int max = Integer.parseInt(maxField.getText());
		int n = Integer.parseInt(nField.getText());
		int percentage = Integer.parseInt(percentageTxt.getText());
		System.out.println("Option: "+option);
		model = new Model();
		model.setAction(option, min, max, n, percentage);
		double[] numbers = model.showNumbers();
		
		
		ObservableList numbersList = FXCollections.observableArrayList();
		numbersList.clear();
		for(int i = 0; i<n ;i++)
		{
			int inte = (int)numbers[i];
			if((numbers[i]-inte)== 0)
			{
				numbersList.add(inte);
			}
			else
			{
				numbersList.add(numbers[i]);
			}
		}
		
		listView.setItems(numbersList);
	}
	
	
	
	@FXML
	public void handleFirstBox()
	{
		if(randomBox.isSelected())
		{
			option = 1;
			sortedBox.setSelected(false);
			invertedBox.setSelected(false);
			percentageBox.setSelected(false);
		}
	}
	 
	@FXML
	public void handleSecondBox()
	{
		if(sortedBox.isSelected())
		{
			
			option = 2;
			randomBox.setSelected(false);
			invertedBox.setSelected(false);
			percentageBox.setSelected(false);
		}
	}
	
	@FXML
	public void handleThirdBox()
	{
		if(invertedBox.isSelected())
		{
			option = 3;
			sortedBox.setSelected(false);
			randomBox.setSelected(false);
			percentageBox.setSelected(false);
		}
	}
	
	@FXML
	public void handleFourthBox()
	{
		if(percentageBox.isSelected())
		{
			option = 4;
			sortedBox.setSelected(false);
			invertedBox.setSelected(false);
			randomBox.setSelected(false);
		}
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	
		
	}
	
}
