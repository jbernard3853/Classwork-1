package Lab4_2;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Data;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.util.List;

import Lab4_2.CSVUtilities;

public class Main extends Application {
	
	List<Integer> b;
	List<Integer> m;
	List<Integer> x;
	List<Integer> q;
	List<Integer> s;

	
	@Override
	public void start(Stage primaryStage) {
		try {
			File theFile = new File("DOHMH_New_York_City_Restaurant_Inspection_Results.csv");
			CSVUtilities myCSV = new CSVUtilities(theFile);

			//bar chart
		    CategoryAxis xAxis = new CategoryAxis();
		    NumberAxis yAxis = new NumberAxis();
		    xAxis.setLabel("Borough");       
		    yAxis.setLabel("Counts");
		    BarChart bc = new BarChart(xAxis, yAxis);
		    bc.setTitle("Restaurant Grades by Borough");
		   			
			XYChart.Series gradeA = new XYChart.Series();
			XYChart.Series gradeB = new XYChart.Series();
			XYChart.Series gradeC = new XYChart.Series();			
			
		    b = CSVUtilities.getAllGrades(myCSV, "BROOKLYN");
			m = CSVUtilities.getAllGrades(myCSV, "MANHATTAN");
			x = CSVUtilities.getAllGrades(myCSV, "BRONX");
			q = CSVUtilities.getAllGrades(myCSV, "QUEENS");
			s = CSVUtilities.getAllGrades(myCSV, "STATEN ISLAND");
			
			displayData(gradeA, bc,0, "Grade A");
			displayData(gradeB, bc,1, "Grade B");
			displayData(gradeC, bc,2, "Grade C");
			       			
			Scene scene = new Scene(bc,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CSV Visualization");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void displayData(XYChart.Series<String,Number> series, BarChart chart, int idx, String name) {
			   series.setName(name);
		       series.getData().add(new XYChart.Data<>("BROOKLYN", b.get(idx)));        
		       series.getData().add(new XYChart.Data<>("MANHATTAN", m.get(idx))); 
		       series.getData().add(new XYChart.Data<>("BRONX", x.get(idx)));                 
		       series.getData().add(new XYChart.Data<>("QUEENS", q.get(idx)));                 
		       series.getData().add(new XYChart.Data<>("STATEN ISLAND", s.get(idx)));        
		       chart.getData().add(series);
         }             
	
	public static void main(String[] args) {
		launch(args);
	}
}
