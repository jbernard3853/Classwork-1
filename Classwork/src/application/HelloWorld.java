package application;
 
import java.io.IOException;
import java.util.Arrays;

import csv.Salad;
import csv.readCsv;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Salads");
        
        Label label1 = new Label("Salad:");
        TextField textField = new TextField ();
        HBox hb = new HBox();
        hb.getChildren().addAll(label1, textField);
        hb.setSpacing(10);
        
        Button btn = new Button();
        btn.setText("Add a Salad");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event) {
            	String txtSalad = textField.getText();
            	String[] attributes = txtSalad.split(",");
            	System.out.println(Arrays.toString(attributes));    
            	Salad newSalad = readCsv.createSalad(attributes);
            	try {
					readCsv.addLine(newSalad);
				} catch (IOException e) {
					e.printStackTrace();
				}
                System.out.println("Salad Added");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().addAll(hb,btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}