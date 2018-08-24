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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Model;
import model.Order;

public class RandomWindowController implements Initializable {

	ObservableList<String> sortList = FXCollections.observableArrayList("Merge Sort", "Quick Sort", "Heap Sort");
	
	private Model model;
	private int option;
	private double[] numList;
	
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
	private CheckBox repeatedBox;
	@FXML 
	private TextField percentageTxt;
	@FXML
	private ListView listView;
	@FXML 
	private Button sortBut;
	@FXML
	private ChoiceBox sortBox;
	
	



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		sortBox.setItems(sortList);
		model = new Model();
	}
	
	
	@FXML
	public void actionPerformed(ActionEvent event)
	{
		int min = Integer.parseInt(minField.getText());
		int max = Integer.parseInt(maxField.getText());
		int n = Integer.parseInt(nField.getText());
		System.out.println("Option: "+option);
		

		
		if(percentageBox.isSelected())
		{
			int percentage = Integer.parseInt(percentageTxt.getText());
			model.setAction(option, min, max, n, percentage);
		} else 
		{
			model.setAction(option, min, max, n, 0);

		}

		numList = model.showNumbers(repeatedBox.isSelected());
		
		
		ObservableList numbersList = FXCollections.observableArrayList();
		numbersList.clear();
		for(int i = 0; i<n ;i++)
		{
			int inte = (int)numList[i];
			if((numList[i]-inte)== 0)
			{
				numbersList.add(inte);
			}
			else
			{
				numbersList.add(numList[i]);
			}
		}
		
		listView.setItems(numbersList);
	}
	
	@FXML 
	public void actionPerformedSort(ActionEvent event)
	{
		
		String sortMode = (String) sortBox.getValue();
	
		if(sortMode.equals("Merge Sort"))
		{
			numList = model.sort(1,numList);
		} else if(sortMode.equals("Quick Sort"))
		{
			
			numList = model.sort(2,numList);
		}if(sortMode.equals("Heap Sort"));
		{
			numList = model.sort(3, numList);
		}
		ObservableList numbersList = FXCollections.observableArrayList();
		numbersList.clear();
		for(int i = 0; i<numList.length ;i++)
		{
			int inte = (int)numList[i];
			if((numList[i]-inte)== 0)
			{
				numbersList.add(inte);
			}
			else
			{
				numbersList.add(numList[i]);
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

	
}
