
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.*;
import java.rmi.NotBoundException;

import javafx.scene.Node;

public class SceneController {

	@FXML
	TextField nameTextField;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException, NotBoundException{
		
		String username = nameTextField.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Chat.fxml"));
		root = loader.load();
		
		//Inicia o Cliente e joga no rmiregistry
		Scene2Controller scene2Controller = loader.getController();
		scene2Controller.displayName(username);
		scene2Controller.startClient(username);

    	stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
