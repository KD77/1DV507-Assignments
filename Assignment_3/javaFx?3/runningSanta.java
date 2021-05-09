package One;

import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class runningSanta extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//final ArrayList<Image>santaPic=new ArrayList<>();
	
	  final 
	
		
		ImageView imgView1 =new ImageView(new Image("file:res1/Run (1).png"));
		ImageView imgView2=new ImageView(new Image("file:res1/Run (2).png"));
		ImageView imgView3=new ImageView(new Image("file:res1/Run (3).png"));
		ImageView imgView4=new ImageView(new Image("file:res1/Run (4).png"));
		ImageView imgView5=new ImageView(new Image("file:res1/Run (5).png"));
		ImageView imgView6=new ImageView(new Image("file:res1/Run (6).png"));
		ImageView imgView7=new ImageView(new Image("file:res1/Run (7).png"));
		ImageView imgView8=new ImageView(new Image("file:res1/Run (8).png"));
		ImageView imgView9=new ImageView(new Image("file:res1/Run (9).png"));
		ImageView imgView10=new ImageView(new Image("file:res1/Run (10).png"));
		ImageView imgView11=new ImageView(new Image("file:res1/Run (11).png"));
		Group root =new Group(imgView1, imgView2,imgView3,imgView4,imgView5,imgView6,imgView7,imgView8,imgView9,imgView10);
		root.setTranslateX(200);
		root.setTranslateY(220);
		
	
		
		Timeline time =new Timeline();
		time.setCycleCount(Timeline.INDEFINITE);
		
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(200),(ActionEvent)->{
					root.getChildren().setAll(imgView1);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(200),(ActionEvent)->{
					root.getChildren().setAll(imgView2);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(300),(ActionEvent)->{
					root.getChildren().setAll(imgView3);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(400),(ActionEvent)->{
					root.getChildren().setAll(imgView4);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(500),(ActionEvent)->{
					root.getChildren().setAll(imgView4);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(600),(ActionEvent)->{
					root.getChildren().setAll(imgView5);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(700),(ActionEvent)->{
					root.getChildren().setAll(imgView6);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(800),(ActionEvent)->{
					root.getChildren().setAll(imgView7);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(900),(ActionEvent)->{
					root.getChildren().setAll(imgView8);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(1000),(ActionEvent)->{
					root.getChildren().setAll(imgView9);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(1100),(ActionEvent)->{
					root.getChildren().setAll(imgView10);
					
				}
				
				));
		time.getKeyFrames().add(new KeyFrame(
				Duration.millis(1200),(ActionEvent)->{
					root.getChildren().setAll(imgView11);
					
				}
				
				));
		
		time.play();
		TranslateTransition tran=new TranslateTransition();
		tran.setByX(200);
		tran.setByY(-360);
		
		tran.setCycleCount(Timeline.INDEFINITE);
		
		tran.setNode(root);
		
		
		Scene scene=new Scene(root);
		primaryStage.setTitle("running santa ");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}

	public static void main(String[] args ) {
		
		launch(args);

	}

}
