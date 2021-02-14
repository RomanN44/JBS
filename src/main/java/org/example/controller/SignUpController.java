/**
 * Sample Skeleton for 'signUp.fxml' Controller Class
 */

package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SignUpController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="signUpButton"
    private Button signUpButton; // Value injected by FXMLLoader

    @FXML // fx:id="userFirstName"
    private TextField userFirstName; // Value injected by FXMLLoader

    @FXML // fx:id="userSecondName"
    private TextField userSecondName; // Value injected by FXMLLoader

    @FXML // fx:id="userLogin"
    private TextField userLogin; // Value injected by FXMLLoader

    @FXML // fx:id="userSex"
    private RadioButton userSex; // Value injected by FXMLLoader

    @FXML // fx:id="sex"
    private ToggleGroup sex; // Value injected by FXMLLoader

    @FXML // fx:id="userRole"
    private RadioButton userRole; // Value injected by FXMLLoader

    @FXML // fx:id="role"
    private ToggleGroup role; // Value injected by FXMLLoader

    @FXML // fx:id="userPassword"
    private PasswordField userPassword; // Value injected by FXMLLoader

    @FXML // fx:id="userConfirmedPassword"
    private PasswordField userConfirmedPassword; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {


    }
}
