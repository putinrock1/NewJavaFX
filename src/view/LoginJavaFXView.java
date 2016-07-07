package view;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Created by surya on 7/1/16.
 */
public class LoginJavaFXView {
    @FXML
    TextField uname;

    public TextField getPw() {
        return pw;
    }

    public void setPw(TextField pw) {
        this.pw = pw;
    }

    @FXML

    TextField pw;

    @Override
    public String toString() {
        return "LoginJavaFXView{" +
                "uname=" + uname +
                ", pw=" + pw +
                '}';

    }
    System.out.println();
}
