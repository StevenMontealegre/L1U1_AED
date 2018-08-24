package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ReaderController implements Initializable {
	
	
	
	ObservableList<double> sortList;
	
	@FXML
	private ListView list;
	@FXML
	private TextField numText;
	@FXML
	private Button addBut;
	@FXML 
	private Button sortBut;
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		list.setItems(sortList);
		model = new Model();
		sortList = FXCollections.observableArrayList();
	}
	
	@FXML
	public void actionPerfomed(ActionEvent event)
	{
		
		
	}
}
