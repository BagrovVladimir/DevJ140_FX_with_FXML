/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Champions;
import settings.SettingsFXML;

/**
 * FXML Controller class
 *
 * @author Владимир
 */
public class ContAddRecordStage implements Initializable {
    
    @FXML
    Label infoLabel;
    @FXML
    public TextField seasonField;
    @FXML
    public TextField racerField;
    @FXML
    public TextField pointsField;
    @FXML
    public TextField shassisField;
    @FXML
    public TextField engineField;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String seasonText = seasonField.getText();
        String racerText = racerField.getText();
        String pointsText = pointsField.getText();
        String shassisText = shassisField.getText();
        String engineText = engineField.getText();
        
        if(seasonText.trim().isEmpty()
                    || racerText.trim().isEmpty()
                    || pointsText.trim().isEmpty()
                    || shassisText.trim().isEmpty()
                    || engineText.trim().isEmpty())
            {infoLabel.setText("All fields must be filled");}
        else{
            SettingsFXML settings = new SettingsFXML();
        try (Connection connection = DriverManager.getConnection(
                    settings.getValue(SettingsFXML.URL),
                    settings.getValue(SettingsFXML.LOGIN),
                    settings.getValue(SettingsFXML.PSW));){
            Statement stm = connection.createStatement();
            String sql = "INSERT INTO Personal_championships "
                    + "(season, racer, points, chassis, engine) "
                    + "VALUES (" + seasonText + ", '"
                    + racerText + "', "
                    + pointsText + ", '"
                    + shassisText + "', '"
                    + engineText + "')";

            stm.executeUpdate(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(Champions.class.getName()).log(Level.SEVERE, null, ex);
        }
//            addChampions();
//            Champions.addChampions();
            infoLabel.setText("Everything ok");}
            System.out.println("DoneAddRecord");
    }
    
//    public void addChampions(){
//    
//        SettingsFXML settings = new SettingsFXML();
//        try (Connection connection = DriverManager.getConnection(
//                    settings.getValue(SettingsFXML.URL),
//                    settings.getValue(SettingsFXML.LOGIN),
//                    settings.getValue(SettingsFXML.PSW));){
//            Statement stm = connection.createStatement();
//            String sql = "INSERT INTO Personal_championships "
//                    + "(season, racer, points, chassis, engine) "
//                    + "VALUES (" + seasonText + ", '"
//                    + racerText + "', "
//                    + pointsText + ", '"
//                    + shassisText + "', '"
//                    + engineText + "')";
//
//            stm.executeUpdate(sql);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Champions.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

//    public static String getTextSeasonField(){
//        return seasonField.getText();
//    }
//    
//    public static String getTextRacerField(){
//        return racerField.getText();
//    }
//    
//    public static String getTextPointsField(){
//        return pointsField.getText();
//    }
//    
//    public static String getTextShassisField(){
//        return shassisField.getText();
//    }
//    
//    public static String getTextEngineField(){
//        return engineField.getText();
//    }
    
    
}
