package One;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Snowman extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Circle c1=new Circle(250, 220, 40);
		c1.setFill(Color.WHITE);
		Circle c2=new Circle(250, 322, 70);
		c2.setFill(Color.WHITE);
		Circle c3=new Circle(250, 160, 25);
		c3.setFill(Color.WHITE);
		Circle csmal1=new Circle(250, 228, 4);
		Circle csmal2=new Circle(250, 218, 4);
		Circle csmal3=new Circle(250, 208, 4);
		
		Line line =new Line(236, 170, 265,170);
		Circle eye1=new Circle(240, 155, 5);
		Circle eye2=new Circle(260, 155, 5);
		Circle sun=new Circle(480, 100, 45);
		Rectangle ground=new Rectangle(0,370,700,120);
		ground.setFill(Color.WHITE);
		sun.setFill(Color.YELLOW);
		root.getChildren().addAll(c1,c2,c3,csmal1,csmal2,csmal3,line,eye1,eye2,sun,ground);
		Scene scene = new Scene(root, 640, 450,Color.DEEPSKYBLUE);
		primaryStage.setTitle("Snowman");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		}
	 
		
		
		

	

	public static void main(String[] args) {
        launch(args);
	}

}
