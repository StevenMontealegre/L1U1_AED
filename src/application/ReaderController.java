package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import model.Model;

public class ReaderController implements Initializable {
	
	
	
	private Model model;
	private ArrayList<Double> numbers;
	private ObservableList sortList;
	@FXML
	private ListView list;
	@FXML
	private TextField numText;
	@FXML
	private Button addBut;
	@FXML 
	private Button sortBut;
	@FXML
	private RadioButton quickBut;

	@FXML
	private RadioButton mergeBut;
	@FXML
	private RadioButton heapBut;

	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		sortList = FXCollections.observableArrayList();
		list.setItems(sortList);
		model = new Model();
		numbers = new ArrayList<>();
		
	}
	
	@FXML
	public void actionPerfomed(ActionEvent event)
	{
		
		Double value = Double.parseDouble( numText.getText());
		numbers.add(value);
		sortList.add(value);
		list.setItems(sortList);
		numText.setText("");
	}

	

	@FXML
	public void actionPerfomedSort(ActionEvent event)
	{
		System.out.println("sort");
		double[] array = new double[numbers.size()];

		System.out.println(numbers.size());
		for(int i = 0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
			array[i]= numbers.get(i);
		}
		
		if(mergeBut.isSelected())
		{
			array =model.sort(1, array);
			
		}
		if(quickBut.isSelected())
		{
			array =model.sort(2, array);
		}
		if(heapBut.isSelected())
		{
			array =model.sort(3, array);
		}
		
		sortList.clear();
		for(int i = 0;i<array.length;i++)
		{
			sortList.add(array[i]);
		}
		list.setItems(sortList);
		
	}

	
	@FXML
	public void handleQuick()
	{
	
		if(quickBut.isSelected())
		{
			heapBut.setSelected(false);
			mergeBut.setSelected(false);
		}
	}
	
	@FXML
	public void handleMerge()
	{
		if(mergeBut.isSelected())
		{
			heapBut.setSelected(false);
			quickBut.setSelected(false);
		}
	}
	
	@FXML
	public void handleHeap()
	{
		if(heapBut.isSelected())
		{
			quickBut.setSelected(false);
			mergeBut.setSelected(false);
		}
	}
}
