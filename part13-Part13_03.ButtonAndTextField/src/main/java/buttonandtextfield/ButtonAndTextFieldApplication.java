package buttonandtextfield;



import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.setHgap(10);
        componentGroup.setVgap(20);
   
        
        Button buttonComponent = new Button("Button");
        componentGroup.getChildren().add(buttonComponent);
         
        TextField textField = new TextField("TextField");
        componentGroup.getChildren().add(textField);
       
        
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
         
        // set title for the stage 
//        window.setTitle("creating TextField"); 
//  
//        // create a textfield 
//        TextField b = new TextField(); 
//  
//        // create a stack pane 
//        StackPane r = new StackPane(); 
//  
//        // add textfield 
//        r.getChildren().add(b); 
//  
//        // create a scene 
//        Scene sc = new Scene(r, 200, 200); 
//  
//        // set the scene 
//        window.setScene(sc); 
  
        window.show(); 
    } 
        
        
    

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
}
