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
import settings.SettingsFXML;
import stages.TableStage;

/**
 * FXML Controller class
 *
 * @author Владимир
 */
public class ContTableStage implements Initializable {
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
            System.out.println("Done");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
