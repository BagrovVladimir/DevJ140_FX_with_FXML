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
import javafx.scene.control.TextField;
import settings.Settings;

public class ContConnectionStage implements Initializable {
    
    @FXML
    private Label infoLabel;
    private TextField urlField;
    private TextField loginField;
    private TextField passwordField;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Settings settings = new Settings();
            if(!urlField.getText().equals(settings.getValue(Settings.URL))
                    || !loginField.getText().equals(settings.getValue(Settings.LOGIN))
                    || !passwordField.getText().equals(settings.getValue(Settings.PSW)))
                {infoLabel.setText("Something wrong");}
            else {infoLabel.setText("Everything ok");
//            try {
//                System.out.println("!!!!!!!");
//                //TableStage tableStage = new TableStage();
//            } catch (IOException ex) {
//                Logger.getLogger(ContConnectionStage.class.getName()).log(Level.SEVERE, null, ex);
//            }
}

            
            System.out.println("Done");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
