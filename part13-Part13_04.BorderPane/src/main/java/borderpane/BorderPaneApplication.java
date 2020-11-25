package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {
    
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        layout.setTop(new Label("NORTH"));
        layout.setRight(new Label("EAST"));
        layout.setBottom(new Label("SOUTH"));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }
    
}
//
//
//    
//    public static void main(String[] args) {
//        launch(BorderPaneApplication.class);
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        BorderPane layout = new BorderPane();
//        
//        
//        
//        layout.setTop(new Label("top"));
//        layout.setRight(new Label("right"));
//        layout.setBottom(new Label("bottom"));
//        layout.setLeft(new Label("left"));
//        layout.setCenter(new Label("center"));
//        
//        Scene view = new Scene(layout);
//        
//        stage.setScene(view);
//        stage.show();
//    }
//
//}
