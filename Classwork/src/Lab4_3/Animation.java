package Lab4_3;

import java.time.Duration;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Animation {

	public Animation() {
		// TODO Auto-generated constructor stub
	}
	
	public void mark(int i, String color, ClickerBox box) {

	    Rectangle rect = new Rectangle(20,20,200,200);

        final Timeline timeline = new Timeline(
                new KeyFrame(Duration.ZERO, new KeyValue(color, startColor)),
                new KeyFrame(Duration.seconds(1), new KeyValue(color, endColor)));


		ElementContainer ec = this.get(i);
		ObservableList<Node> childNodes = ec.getEleContainerPanel().getChildren();
		childNodes.add(tempLabel);
		Label label = (Label) ec.getEleContainerPanel().getChildren().get(0);
		
		tempLabel.prefWidthProperty().bind(label.prefWidthProperty());
		Timeline tl = new Timeline(
	            new KeyFrame(new Duration(1), new KeyValue(tempLabel.opacityProperty(), 0.7)));
		timelines.add(tl);
		return tempLabel;
	}

}
