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
import stages.ConnectionStage;

/**
 *
 * @author Владимир
 */
public class ContMainStage implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            ConnectionStage connectionStage = new ConnectionStage();
            System.out.println("You clicked me!");
        } catch (IOException ex) {
            Logger.getLogger(ContMainStage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("You clicked me!");

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
