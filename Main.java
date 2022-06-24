	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Group root = new Group();
        try {
	    	Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
	    	
	    	Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE);
	    	primaryStage.setScene(scene);
	    	primaryStage.show();
        } catch(Exception e) {
        	e.printStackTrace();
        }  
 
    }

}