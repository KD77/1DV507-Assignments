package One;





import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TinyPainter extends Application {

	
	@Override
	public void start(Stage PrimaryStage) throws Exception {
		HBox layout = new HBox();
		layout.setPadding(new Insets(5, 5, 5, 5));

		ComboBox<String> painter = new ComboBox<>();
		painter.getItems().addAll("Line", "Rectangle", "Dot", "Circle");
		ColorPicker colorPicker = new ColorPicker();
		colorPicker.setValue(Color.BLACK);
		ComboBox<Double> size = new ComboBox<>();
		size.getItems().addAll(1.0, 5.0, 10.0, 15.0, 20.0, 25.0, 30.0, 35.0, 40.0);
		size.setValue(1.0);
		Rectangle bg = new Rectangle();
		Line l1 = new Line();
		Circle c1 = new Circle();
		Rectangle sq = new Rectangle();

		Group root = new Group();
		root.getChildren().addAll(c1, bg);

		layout.getChildren().addAll(painter, colorPicker, size);

		root.getChildren().addAll(layout);
		Scene scene = new Scene(root, 800, 600);
		PrimaryStage.setScene(scene);
		PrimaryStage.show();

		painter.setOnAction((ActionEvent e) -> {
			if (painter.getValue().equals("Circle")) {
				scene.setOnMousePressed(e1 -> {
					c1.setCenterX(e1.getX());
					c1.setCenterY(e1.getY());
					c1.setFill(colorPicker.getValue());

				});
				scene.setOnMouseDragged(event1 -> {
					if (!painter.getValue().equals("Circle")) {
						return;
					} else {
						c1.setRadius(Math.sqrt(Math.pow(event1.getX() - c1.getCenterX(), 2)
								+ Math.pow(event1.getY() - c1.getCenterY(), 2)));
					}
					event1.consume();
				});
				scene.setOnMouseClicked(event1 -> {
					Circle c2 = new Circle(c1.getCenterX(), c1.getCenterY(), c1.getRadius());
					c2.setFill(colorPicker.getValue());
					root.getChildren().add(c2);
				});
			} else if (painter.getValue().equals("Rectangle")) {
				scene.setOnMousePressed(e1 -> {
					bg.setX(e1.getX());
					bg.setY(e1.getY());
					bg.setFill(colorPicker.getValue());
				});
				scene.setOnMouseDragged(e1 -> {

					if (!painter.getValue().equals("Rectangle")) {
						return;
					} else {
						bg.setWidth(e1.getX() - bg.getX());
						bg.setHeight(e1.getY() - bg.getY());
					}
				});
				scene.setOnMouseClicked(event1 -> {
					Rectangle bg1 = new Rectangle(bg.getX(), bg.getY(), bg.getWidth(), bg.getHeight());
					bg1.setFill(colorPicker.getValue());
					root.getChildren().add(bg1);
				});
			} else if (painter.getValue().equals("Dot")) {
				scene.setOnMousePressed(e1 -> {
					sq.setX(e1.getX());
					sq.setY(e1.getY());

					sq.setFill(colorPicker.getValue());
					sq.setWidth(size.getValue());
					sq.setHeight(size.getValue());
				});
				scene.setOnMouseClicked(e1 -> {

					Rectangle sqr = new Rectangle(sq.getX(), sq.getY(), sq.getWidth(), sq.getHeight());
					sq.setFill(colorPicker.getValue());
					root.getChildren().add(sqr);
				});

			} else if (painter.getValue().equals("Line")) {
				scene.setOnMousePressed(e1 -> {
					l1.setStroke(colorPicker.getValue());
					l1.setStrokeWidth(size.getValue());
					l1.setStartX(e1.getX());
					l1.setStartY(e1.getY());
					l1.setEndX(e1.getX());
					l1.setEndY(e1.getY());
				});
				scene.setOnMouseDragged(event1 -> {

					if (!painter.getValue().equals("Line")) {
						return;
					}
					l1.setEndX(event1.getX());
					l1.setEndY(event1.getY());
				});

				scene.setOnMouseReleased(e1 -> {
					l1.setEndX(e1.getX());
					l1.setEndY(e1.getY());
				});
				scene.setOnMouseClicked(event1 -> {
					l1.setEndX(event1.getX());
					l1.setEndY(event1.getY());

					Line l2 = new Line(l1.getStartX(), l1.getStartY(), l1.getEndX(), l1.getEndY());
					l2.setStroke(colorPicker.getValue());
					l2.setStrokeWidth(size.getValue());
					root.getChildren().add(l2);
				});

			}

		});

	}

	public static void main(String[] args) {

		launch(args);
	}

}
