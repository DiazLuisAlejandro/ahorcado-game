package es.ies.puerto.controller;

import java.io.IOException;

import es.ies.puerto.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class menu4Controller {
    

    @FXML
    Button returnButton;

    /**
     * Metodo que regresa a la pantalla "Inicio" o "Confirmacion de Usuario"
     * @throws IOException
     */
    @FXML
    protected void onReturnButtonClick() throws IOException{

        
        Stage stage=(Stage) returnButton.getScene().getWindow();

        if (stage.titleProperty().getName().equals("Registro")) {
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 360, 500);
            stage.setTitle("Inicio");
            stage.setScene(scene);
            stage.show();        
        }
         FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("menu3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 500);
        stage.setTitle("Confirmacion de Ususario");
        stage.setScene(scene);
        stage.show();        
       
    }
}
