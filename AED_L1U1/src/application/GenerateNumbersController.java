package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import model.Order;

public class GenerateNumbersController  implements Initializable{

	
	private Order model;
	ObservableList<Double> list = (ObservableList<Double>) FXCollections.observableArrayList(92.3,34.92,93894.21,8389.2);

	
	@FXML
	private ListView<Double> listView;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}

	
	
	
	
}
