package Lab4_2;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;


public class BarChartBox {
	private BarChart parent;

	public BarChartBox(BarChart parent) {
		this.parent = parent;
	}

	public void addData(XYChart.Series<String,Number> series, String name, double runTime) {
		
       //Prepare XYChart.Series objects by setting data       
       series.getData().add(new XYChart.Data<>(name, runTime));
       this.parent.getData().add(series);
	}
}