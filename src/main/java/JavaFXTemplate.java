// Works Cited:
// Used http://fxexperience.com/2011/12/styling-fx-buttons-with-css/  for button layout of line 56 and 72
// Image used from https://www.idownloadblog.com/2021/09/08/apple-california-streaming-event-wallpapers/
// artist: @EvgeniyZemelko

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXTemplate extends Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Anthony Sorto HomeWork3");
		BorderPane root = new BorderPane();
		// Use to get Image from URL 
		Image image1 = new Image("https://media.idownloadblog.com/wp-content/uploads/2021/09/Apple-September-Event-California-Streaming-BasicAppleGuy-iDownloadBlog-6K.png");
		// will define size of area of background image
		// 1.0 1.0 are defined as percentages for height and width to fill size
		BackgroundSize size = new BackgroundSize(1.0, 1.0, true, true, false, false); 
		BackgroundImage BGI = new BackgroundImage(image1, // sets criteria of image to be used as background
				BackgroundRepeat.NO_REPEAT, // image only placed once x axis
				BackgroundRepeat.NO_REPEAT, // image only placed once
				BackgroundPosition.DEFAULT, // according to oracle, default 0% 0%
				size); // predefined size(will always be size of window)
		Background back1 = new Background(BGI); 
		
		Button btn = new Button("Button 1");
		Button btn2 = new Button("Button 2");
					
		btn.setStyle( // USED http://fxexperience.com/2011/12/styling-fx-buttons-with-css/
					// as resource for CSS component
				 "    -fx-background-color: \n"
				+ "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n"
				+ "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.9) , 1, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n"
				+ "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n"
				+ "    -fx-padding: 10 20 10 20;\n");
		btn2.setStyle(
				 "    -fx-background-color: \n"
				+ "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n"
				+ "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( one-pass-box , rgba(0,0,0,0.9) , 1, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n"
				+ "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n"
				+ "    -fx-padding: 10 20 10 20;\n");
		
		root.setBackground(back1);
		
		VBox buttonbox = new VBox(10);
		buttonbox.getChildren().add(btn);
		buttonbox.getChildren().add(btn2);
		buttonbox.setAlignment(Pos.CENTER);
		
		
		TextField centerText = new TextField();
		TextField rightText = new TextField();
		centerText.setPromptText("enter text here then press button 1");
		rightText.setText("Final string goes here");
		rightText.setEditable(false);
		root.setCenter(centerText);
		root.setRight(rightText);
		root.setLeft(buttonbox);
		BorderPane.setAlignment(buttonbox, Pos.CENTER);
		BorderPane.setAlignment(rightText, Pos.CENTER);


		btn.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent action) {
				String a = centerText.getText()+ ":from the center text field!";
				rightText.setText(a);
				btn.setText("Pressed");
				btn.setDisable(true);
			}
		});
		
		btn2.setOnAction( e-> {
			rightText.clear();
			centerText.clear();
			rightText.setText("Final string goes here");
			btn.setDisable(false);
			btn.setText("Button 1");
		});
		
		Scene scene = new Scene(root, 700, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
