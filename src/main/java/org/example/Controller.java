/**
 * Sample Skeleton for 'main.fxml' Controller Class
 */

package org.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="passwordField"
    private PasswordField passwordField; // Value injected by FXMLLoader

    @FXML // fx:id="signInButton"
    private Button signInButton; // Value injected by FXMLLoader

    @FXML // fx:id="loginField"
    private TextField loginField; // Value injected by FXMLLoader

    @FXML // fx:id="signUpButton"
    private Button signUpButton; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'main.fxml'.";
        assert signInButton != null : "fx:id=\"signInButton\" was not injected: check your FXML file 'main.fxml'.";
        assert loginField != null : "fx:id=\"loginField\" was not injected: check your FXML file 'main.fxml'.";
        assert signUpButton != null : "fx:id=\"signUpButton\" was not injected: check your FXML file 'main.fxml'.";

        signInButton.setOnAction(event -> {
            System.out.println("sign in");
        });

    }
}
