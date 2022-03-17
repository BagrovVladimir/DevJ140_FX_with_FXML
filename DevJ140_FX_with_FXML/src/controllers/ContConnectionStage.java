/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import settings.SettingsFXML;
import stages.TableStage;

public class ContConnectionStage implements Initializable {
    
    @FXML
    Label infoLabel;
    @FXML
    TextField urlField;
    @FXML
    TextField loginField;
    @FXML
    PasswordField passwordField;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        SettingsFXML settings = new SettingsFXML();
        boolean invalidURL = !urlField.getText().equals(settings.getValue(SettingsFXML.URL));
        boolean invalidLogin = !loginField.getText().equals(settings.getValue(SettingsFXML.LOGIN));
        boolean invalidPassword = !passwordField.getText().equals(settings.getValue(SettingsFXML.PSW));
            if(invalidURL || invalidLogin || invalidPassword)
                {infoLabel.setText("Something wrong");}
            else {infoLabel.setText("Everything ok");
                try {
                TableStage tableStage = new TableStage();
                } catch (IOException ex) {
                Logger.getLogger(ContConnectionStage.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
            System.out.println("DoneConnectionStage");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
