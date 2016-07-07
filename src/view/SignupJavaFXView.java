package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by surya on 7/1/16.
 */
public class SignupJavaFXView {
    public SignupJavaFXView() throws IOException{
        Stage signupStage = new Stage();
        signupStage.setTitle("Signup Pge");
        Parent signupView = FXMLLoader.load(getClass().getResource("signupJavaFx.fmxl"));
        signupStage.setScene(new Scene(signupView, 300,275));
        signupStage.show();
    }
}
