package logic.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    private Button submitButton;

    @FXML
    void submitClick(ActionEvent event) {
    	//
    }
}
