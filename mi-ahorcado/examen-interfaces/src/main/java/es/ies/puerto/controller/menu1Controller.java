package es.ies.puerto.controller;

import java.io.IOException;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class menu1Controller {

    @FXML
    Button loginButton;

    @FXML
    Button registerButton;

    @FXML
    Button recoveryButton;

    /**
     * Metodo que cambia a la pantalla "Confirmacion de Ususario"
     * @throws IOException
     */
    @FXML
    protected void onLoginButtonClick() throws IOException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Confirmacion de Ususario");
        stage.setScene(scene);
        stage.show();     
    }

    /**
     * Metodo que cambia a la pantalla "Registro"
     * @throws IOException
     */
    @FXML
    protected void onRegisterButtonClick() throws IOException{
        Stage stage = (Stage) registerButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu4.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Registro");
        stage.setScene(scene);     
        stage.show();
    }

    
}