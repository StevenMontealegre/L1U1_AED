package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	//private MainMenuController mmc;
	
	private Stage primaryStage;
	
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
	
		//mmc = new MainMenuController(this);
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Generate Numbers");
		showMainView();
	}
	
	public  void showMainView() 
	{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/MainMenu.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public void showGenerateView()
	{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/RandomView.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	

	public static void main(String[] args) {
		launch(args);
	}
}
