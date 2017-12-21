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
		   
		    BarChartBox chart = new BarChartBox(bc);
		    List<Integer> brooklyn = CSVUtilities.getAllGrades(myCSV, "BROOKLYN");
			List<Integer> manhattan = CSVUtilities.getAllGrades(myCSV, "MANHATTAN");
			List<Integer> bronx = CSVUtilities.getAllGrades(myCSV, "BRONX");
			List<Integer> queens = CSVUtilities.getAllGrades(myCSV, "QUEENS");
			List<Integer> statenisland = CSVUtilities.getAllGrades(myCSV, "STATEN ISLAND");
			
			XYChart.Series BROOKLYN = new XYChart.Series();
			XYChart.Series MANHATTAN = new XYChart.Series();
			XYChart.Series BRONX = new XYChart.Series();
			XYChart.Series QUEENS = new XYChart.Series();
			XYChart.Series STATENISLAND = new XYChart.Series();
			
			displayData(BROOKLYN, chart,brooklyn,"BROOKLYN");
			displayData(MANHATTAN, chart,manhattan,"MANHATTAN");
			displayData(BRONX, chart,bronx,"BRONX");
			displayData(QUEENS, chart,queens,"QUEENS");
			displayData(STATENISLAND, chart,statenisland,"STATEN ISLAND");
			       

			  for(Node n:bc.lookupAll(".default-color0.chart-bar")) {
		            n.setStyle("-fx-bar-fill: red;");
		        }
		    Node n = bc.lookup(".data0.chart-bar");
			n.setStyle("-fx-bar-fill: green");

			Scene scene = new Scene(bc,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("CSV Visualization");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displayData(XYChart.Series<String,Number> series, BarChartBox chart, List<Integer> theData,String borough) {
		for (int s: theData) {
			chart.addData(series,borough, s);
		}   
                      
         }             
	
	public static void main(String[] args) {
		launch(args);
	}
}
