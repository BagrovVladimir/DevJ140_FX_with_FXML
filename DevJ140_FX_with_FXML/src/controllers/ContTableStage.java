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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Champions;
import settings.SettingsFXML;
import stages.AddRecordStage;
import stages.TableStage;

/**
 * FXML Controller class
 *
 * @author Владимир
 */
public class ContTableStage implements Initializable {
    
    @FXML
    TableView table;
    @FXML
    TableColumn<Champions, Integer> id;
    @FXML
    TableColumn<Champions, Integer> season;
    @FXML
    TableColumn<Champions, String> racer;
    @FXML
    TableColumn<Champions, Integer> points;
    @FXML
    TableColumn<Champions, String> shassis;
    @FXML
    TableColumn<Champions, String> engine;
    
    @FXML
    private void handleButtonActionUpdateTable(ActionEvent event) {
        updateTable();
        System.out.println("DoneUpdateTable");
    }
    
    @FXML
    private void handleButtonActionAddRecord(ActionEvent event) {
        try {
            System.out.println("Before AddRecordStage");
            AddRecordStage addRecordStage = new AddRecordStage();
        } catch (IOException ex) {
            Logger.getLogger(ContTableStage.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("AddRecord");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    private void updateTable(){
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        season.setCellValueFactory(new PropertyValueFactory<>("season"));
        racer.setCellValueFactory(new PropertyValueFactory<>("racer"));
        points.setCellValueFactory(new PropertyValueFactory<>("points"));
        shassis.setCellValueFactory(new PropertyValueFactory<>("shassis"));
        engine.setCellValueFactory(new PropertyValueFactory<>("engine"));
        
        table.setItems(Champions.getChampionsList()); 
    }  
}
