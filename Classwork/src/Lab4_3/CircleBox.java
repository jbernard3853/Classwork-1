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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;


public class CircleBox {

	private Rectangle rect ;
	private double x;
	private double y;
	private ArrayList<Timeline> timelines;
	private Timeline currentTimeline;
	private List<Label> marks;
	private DoubleProperty fontSize;
	private Text text;
	private StackPane parent;
	private double radius;
	private Color color;
	private Circle circle;
	private Text circleText;
	private double circleWidth;
	
	public CircleBox(StackPane parent, double x, double y, int radius, String text, Color color) {
		this.parent = parent;
		this.text = new Text(text);
		this.color = color;
		this.radius = 0;
		this.x = x;
		this.y = y;
		this.circle = encircle(createText());
		this.circleText = createText();
		this.circleWidth = getWidth(circleText);
		// x- radius x + radius
		// y - radius y + radius
	}
	
	private Text createText() {
        this.text.setBoundsType(TextBoundsType.VISUAL);
        this.text.setStyle(
                "-fx-font-family: \"Times New Roman\";" +
                "-fx-font-style: italic;" +
                "-fx-font-size: 24px;"
        );

        return this.text;
    }

    public Rectangle getRect() {
		return rect;
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public ArrayList<Timeline> getTimelines() {
		return timelines;
	}

	public void setTimelines(ArrayList<Timeline> timelines) {
		this.timelines = timelines;
	}

	public Timeline getCurrentTimeline() {
		return currentTimeline;
	}

	public void setCurrentTimeline(Timeline currentTimeline) {
		this.currentTimeline = currentTimeline;
	}

	public List<Label> getMarks() {
		return marks;
	}

	public void setMarks(List<Label> marks) {
		this.marks = marks;
	}

	public DoubleProperty getFontSize() {
		return fontSize;
	}

	public void setFontSize(DoubleProperty fontSize) {
		this.fontSize = fontSize;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public StackPane getParent() {
		return parent;
	}

	public void setParent(StackPane parent) {
		this.parent = parent;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Text getCircleText() {
		return circleText;
	}

	public void setCircleText(Text circleText) {
		this.circleText = circleText;
	}

	public double getCircleWidth() {
		return circleWidth;
	}

	public void setCircleWidth(double circleWidth) {
		this.circleWidth = circleWidth;
	}

	private Circle encircle(Text text) {
        Circle circle = new Circle(x,y,radius);
        circle.setFill(color);
        circle.setRadius(getWidth(text) / 2 + 20);
        parent.getChildren().add(circle);
        return circle;
    }
    
    private double getWidth(Text text) {
        new Scene(new Group(text));
        text.applyCss();
        parent.getChildren().add(text);
        return text.getLayoutBounds().getWidth();
    }
	    
}
