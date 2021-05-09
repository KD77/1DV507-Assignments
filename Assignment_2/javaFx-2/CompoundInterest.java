package One;



import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CompoundInterest extends Application {
	final TextField startAmount = new TextField();
	final TextField intrest = new TextField();
	final TextField numberOfYears = new TextField();
	final Label results = new Label();
	Button calculate = new Button("Calculate");

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Compound Interest");

		Label lb = new Label();
		lb.setFont(Font.font("Cambria", 32));
		lb.setText("Compound Interest");

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.BOTTOM_CENTER);
		pane.setPadding(new Insets(45.5, 18.5, 15.5, 14.5));
		pane.setHgap(10);
		pane.setVgap(10);

		pane.add(new Label("Start amount:"), 0, 0);

		pane.add(startAmount, 1, 0);

		pane.add(new Label("Interest:"), 0, 1);
		pane.add(intrest, 1, 1);
		pane.add(new Label("Number of Years:"), 0, 2);
		pane.add(numberOfYears, 1, 2);
		pane.add(results, 0, 5);
		pane.add(calculate, 0, 3);

		calculate.setOnAction(event -> {
			culculateRes();

		});
		GridPane.setHalignment(calculate, HPos.LEFT);

		Group root = new Group();
		root.getChildren().addAll(pane, lb);
		Scene scene = new Scene(root, 350, 300);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

	public void culculateRes() {
		double Intrest = Double.parseDouble(intrest.getText());

		int Year = Integer.parseInt(numberOfYears.getText());
		double Amount = Double.parseDouble(startAmount.getText());
		double res = Amount * Math.pow((1 + Intrest / 100), Year);
		int result = (int) Math.round(res);
		results.setText("In total that will be " + result);

	}

	public static void main(String[] args) {
		launch(args);
	}

}
