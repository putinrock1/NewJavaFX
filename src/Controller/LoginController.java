package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import view.SignupJavaFXView;

import java.io.IOException;

/**
 * Created by surya on 7/1/16.
 */
public class LoginController {
    @FXML
    TextField uname;
    @FXML
    PasswordField pw;

    public boolean authenticate(){
        System.out.println("true");
        System.out.println(uname.getText());
        System.out.println(pw.getText());
        return true;

    }
    public void opeSignupView() throws IOException{
        System.out.println("Open signup view");
        SignupJavaFXView signupJavaFXView = new SignupJavaFXView();
    }

}
