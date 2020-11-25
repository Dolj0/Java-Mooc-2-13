package textstatistics;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application implements EventHandler<ActionEvent>{
    private Label letters;
    private Label words;
    private Label longest;
    private int let;
    private int word;
    private String lon;
    
            
    @Override
    public void start(Stage window){
        BorderPane layout = new BorderPane();
        this.letters = new Label("Letters: ");
        this.words = new Label("Words: ");
        this.longest = new Label("The longest word is: ");
        
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(letters);
        buttons.getChildren().add(words);
        buttons.getChildren().add(longest);
        
        TextArea textField = new TextArea();
        
        
        layout.setCenter(textField);
        layout.setBottom(buttons);
        
        textField.textProperty().addListener(new ChangeListener<String>() {
            
            public void changed(ObservableValue<? extends String> ov, String t, String t1) {
                let = t1.length();
                String[] split = t1.split(" ");
                word = split.length;
                int j = 0;
                String s = "";
                for (int i = 0; i<split.length; i++){
                    if (split[i].length()>j) {
                        j=split[i].length();
                        s = split[i];
                    }
                }
                letters.setText("Letters: "+let);
                words.setText("Words: "+word);
                longest.setText("The longest word is: "+s);
            }
        });
        
        
        
    
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    public void handle(ActionEvent t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}