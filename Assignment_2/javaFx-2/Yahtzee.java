package One;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Yahtzee extends Application {
	private int count = 3;

	public int getCountRollD() {
		return count;
	}

	public void decCountR() {
		count--;
	}

	public boolean isLarger(ArrayList<Integer> list) {

		int countLeft = 0;
		int countRight = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) >= 1)
				countLeft++;
		}
		for (int j = 1; j < list.size(); j++) {
			if (list.get(j) >= 1)
				countRight++;
		}
		if (countLeft == 5 || countRight == 5)
			return true;
		else
			return false;
	}

	public boolean isSmaller(ArrayList<Integer> list) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i <= 3; i++) {
			if (list.get(i) >= 1)
				count1++;
		}
		for (int j = 1; j <= 4; j++) {
			if (list.get(j) >= 1) {
				count2++;
			}
		}
		for (int k = 2; k < list.size(); k++) {
			if (list.get(k) >= 1) {
				count3++;
			}
		}
		if (count1 == 4 || count2 == 4 || count3 == 4)
			return true;
		else
			return false;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10.5, 10.5, 10.5, 10.5));
		grid.setHgap(20.0);
		grid.setVgap(5.0);
		Label Name = new Label("Yahtzee");
		Name.setFont(new Font("Cambria", 24));
		grid.add(Name, 0, 1, 3, 1);

		HBox layout = new HBox();
		layout.setPadding(new Insets(5, 5, 5, 5));

		HBox imgLay = new HBox();
		imgLay.setPadding(new Insets(5, 5, 5, 5));
		Image img1 = new Image(new FileInputStream("res/images/1.png"));
		ImageView imgView1 = new ImageView(img1);
		imgView1.setImage(img1);
		imgView1.setX(32);
		imgView1.setY(25);
		imgView1.setFitHeight(80);
		imgView1.setFitWidth(80);

		Image img2 = new Image(new FileInputStream("res/images/2.png"));
		ImageView imgView2 = new ImageView(img2);
		imgView2.setImage(img2);
		imgView2.setX(110);
		imgView2.setY(25);
		imgView2.setFitHeight(80);
		imgView2.setFitWidth(80);

		Image img3 = new Image(new FileInputStream("res/images/3.png"));
		ImageView imgView3 = new ImageView(img3);
		imgView3.setImage(img3);
		imgView3.setX(189);
		imgView3.setY(25);
		imgView3.setFitHeight(80);
		imgView3.setFitWidth(80);

		Image img4 = new Image(new FileInputStream("res/images/f.png"));
		ImageView imgView4 = new ImageView(img4);
		imgView4.setImage(img4);
		imgView4.setX(268);
		imgView4.setY(25);
		imgView4.setFitHeight(80);
		imgView4.setFitWidth(80);

		Image img5 = new Image(new FileInputStream("res/images/5.png"));
		ImageView imgView5 = new ImageView(img5);
		imgView5.setImage(img5);
		imgView5.setX(346);
		imgView5.setY(25);
		imgView5.setFitHeight(80);
		imgView5.setFitWidth(80);

		Image[] img = { img1, img2, img3, img4, img5 };
		ImageView[] imgV = { imgView1, imgView2, imgView3, imgView4, imgView5 };

		HBox layoutC = new HBox();
		CheckBox ch1 = new CheckBox();
		CheckBox ch2 = new CheckBox();
		CheckBox ch3 = new CheckBox();
		CheckBox ch4 = new CheckBox();
		CheckBox ch5 = new CheckBox();

		layoutC.setPadding(new Insets(90, 0, 0, 0));
		layoutC.setSpacing(65);
		CheckBox[] cb = { ch1, ch2, ch3, ch4, ch5 };

		HBox button = new HBox();
		button.setPadding(new Insets(170, 0, 0, 0));
		Button bt = new Button("Roll the dice");

		Label text = new Label();
		text.setText("You have 3 rolls left.");
		grid.add(text, 2, 4, 2, 1);

		bt.setOnAction(e -> {
			Random r = new Random();
			if (count == 1) {
				decCountR();

				for (int i = 0; i < cb.length; i++) {
					cb[i].setDisable(true);
					int kan = r.nextInt(6);
					if (cb[i].isSelected()) {
					} else
						imgV[i].setImage(img[kan]);

				}
				ArrayList<Integer> CountPerFace = new ArrayList<>();
				for (int i = 0; i < 6; i++)
					CountPerFace.add(0);

				// conditions
				for (int s = 0; s < imgV.length - 1; s++) {
					for (int l = 0; l < img.length; l++) {
						if (imgV[s].getImage().equals(img[l])) {
							CountPerFace.set(l, (CountPerFace.get(l) + 1));
							break;
						}
					}
				}

				if (CountPerFace.contains(5))
					text.setText("Yahtzee");
				else if (CountPerFace.contains(4))
					text.setText("Four of a kind");
				else if (CountPerFace.contains(3) && CountPerFace.contains(2))
					text.setText("Full House");
				else if (CountPerFace.contains(3))
					text.setText("Three of a kind");
				else if (isLarger(CountPerFace))
					text.setText("Large Straight");
				else if (isSmaller(CountPerFace))
					text.setText("Small Straight");
				else
					text.setText("Pair");

			} else if (getCountRollD() < 1) {

			} else {
				decCountR();
				for (int j = 0; j < cb.length; j++)
					cb[j].setDisable(false);

				text.setText("You have " + (count) + " rolls left.");
				for (int j = 0; j < cb.length; j++) {
					if (cb[j].isSelected()) {
					} else {
						int rand = r.nextInt(6);
						imgV[j].setImage(img[rand]);

					}
				}

			}

		});

		layout.getChildren().addAll(imgView1, imgView2, imgView3, imgView4, imgView5);
		layoutC.getChildren().addAll(ch1, ch2, ch3, ch4, ch5);
		button.getChildren().add(bt);

		grid.getChildren().addAll(layout, layoutC, button);

		// Group root=new Group();
		// root.getChildren().addAll(imgView1,imgView2,imgView3,imgView4,imgView5);
		Scene scene = new Scene(grid, 600, 480);
		primaryStage.setTitle("Yahtzee");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
