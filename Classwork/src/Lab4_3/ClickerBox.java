package Lab4_3;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class ClickerBox {

	private Rectangle rect ;
	private int x;
	private int y;
	private ArrayList<Timeline> timelines;
	private Timeline currentTimeline;
	private List<Label> marks;
	private DoubleProperty fontSize;
	private Text text;

	public ClickerBox(HBox parent, int x, int y, int size, Text text, int fontSize) {
		Label label = new Label(text.toString());
        StackPane centeredLabel = new StackPane(label);
		label.setStyle("-fx-background-color: coral; -fx-padding: 10px;");
		this.fontSize = new SimpleDoubleProperty(fontSize);
		this.text = text;
		this.x = x;
		this.y = y;
	    rect = new Rectangle(x,y,size,size);
		parent.getChildren().addAll(rect,centeredLabel);
	}

}
