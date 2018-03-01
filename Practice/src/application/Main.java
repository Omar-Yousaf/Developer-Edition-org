package application;

	
import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Box;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.shape.Rectangle; 

@SuppressWarnings("unused")
public class Main extends Application {
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			
			
		     
			Pane pane = new Pane();
	        Group group = new Group();

	        
	        
	        Rectangle rect1 = new Rectangle(100, 100, 100, 100);
	        Rectangle rect2 = new Rectangle(100, 100, 100, 100);
	        Rectangle rect3 = new Rectangle(200, 200, 100, 100);
	        Rectangle rect4 = new Rectangle(200, 200, 100, 100);
	        rect1.setFill(Color.BLUE);
	        rect2.setFill(Color.BLUE);
	        rect3.setFill(Color.GREEN);
	        rect4.setFill(Color.GREEN);

	        group.getChildren().addAll(rect1, rect3);
	        pane.getChildren().addAll(rect2, rect4);
	        
	        VBox.setVgrow(group, Priority.NEVER);
	        VBox.setVgrow(pane, Priority.NEVER);

	        VBox vbox = new VBox(group, pane);
	        
	        StackPane stackPane = new StackPane();
	        stackPane.setMargin(group, new Insets(50, 50, 50, 50));
	        stackPane.setMargin(pane, new Insets(100, 50, 50, 0));
	        
	        //Retrieving the observable list of the Stack Pane 
	        ObservableList list1 = stackPane.getChildren();
	        list1.addAll(group,pane);
			
			
			Group root = new Group();
			ObservableList<Node> list=root.getChildren();
			// EventHandling -- new Group(circle, playButton, stopButton);
			// EventHandling -- new Group(box,tf,text)
			//list.add(pat);
			//list.add(tex);
			//list.add(imageview);
			//list.add(rectangle);
			//list.add(hexagon);
			//list.add(imView);
			//list.add(box);
			//list.add(cy);
			list.add(vbox);
			
			
			Scene scene = new Scene(stackPane);
			//Scene scene = new Scene(gridPane);
			//PerspectiveCamera camera = new PerspectiveCamera(false); 
		      //camera.setTranslateX(0); 
		      //camera.setTranslateY(0); 
		      //camera.setTranslateZ(0); 
		      //scene.setCamera(camera);  
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.setFill(Color.BLACK);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hello Trump");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
