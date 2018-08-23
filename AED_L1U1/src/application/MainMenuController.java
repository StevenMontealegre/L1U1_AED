package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController implements Initializable {


	
	@FXML
    private Button introduceBut;

    @FXML
    private Button genBut;

    @FXML
    void actionPerfomedInt(ActionEvent event) {
 
    }
    

    @FXML
    void actionPerformedGen(ActionEvent event) {
       	try {
    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/RandomWindow.fxml"));
    		Parent root = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setTitle("Generate Numbers");
    		stage.setScene(new Scene(root));
    		stage.show();
    } catch (Exception e)
    	{
    	System.out.println("Shit");
    	}
    }



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
