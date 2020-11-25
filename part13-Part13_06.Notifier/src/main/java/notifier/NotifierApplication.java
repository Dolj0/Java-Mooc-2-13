 package notifier;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application implements EventHandler<ActionEvent> {
    private String trans;
    private TextField textAres;
    private Label label;

    
    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        VBox buttons = new VBox();
        
        this.textAres = new TextField();
        Button button = new Button("Update");
        this.label = new Label();
        
        buttons.setSpacing(10);
        buttons.getChildren().add(textAres);
        buttons.getChildren().add(button);
        buttons.getChildren().add(label);
        
       
//        layout.setTop(textAres);
//        layout.setCenter(button);
//        layout.setBottom(label);
        
        button.setOnAction(this);
       
       
       
        
                
        Scene view = new Scene(buttons);
        
        stage.setScene(view);
        stage.show();
        
    }

    public void handle(ActionEvent t) {
        this.label.setText(textAres.getText());
    }

    
        
        
}


