import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {
  public void start(Stage stage){
    Text face  = new Text(20, 23, "my face when");
    Text press = new Text(70, 150, "someone presses normalpdf");
    Rectangle box = new Rectangle(20, 10, 200, 150);
    Rectangle eyebrow = new Rectangle (155, 25, 50, 5);
    Rectangle eyebrow2 = new Rectangle (30, 25, 50, 5);
    Circle circle = new Circle();
          circle.setCenterX(55.0f);
          circle.setCenterY(60.0f);
          circle.setRadius(30.0f);
          circle.setFill(Color.RED);

    Circle two = new Circle();
          two.setCenterX(180.0f);
          two.setCenterY(60.0f);
          two.setRadius(30.0f);
          two.setFill(Color.ORANGE);

    Ellipse ellipse = new Ellipse();
          ellipse.setCenterX(120.0f);
          ellipse.setCenterY(120.0f);
          ellipse.setRadiusX(50.0f);
          ellipse.setRadiusY(15.0f);
          ellipse.setFill(Color.BLUE);

          box.setStroke(Color.RED);
          box.setFill(null);
Group root = new Group(face, press, box, circle, two, eyebrow, eyebrow2, ellipse);
Scene scene = new Scene(root, 400, 400, Color.YELLOW);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }
  public static void main(String[] args){
    launch(args);
  }
}
