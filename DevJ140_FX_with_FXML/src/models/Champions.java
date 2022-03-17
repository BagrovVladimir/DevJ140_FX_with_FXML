
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import settings.SettingsFXML;
import controllers.ContAddRecordStage;


public class Champions {
    
    private Integer id;
    private Integer season;
    private String racer;
    private Integer points;
    private String shassis;
    private String engine;

    public Champions(Integer id, Integer season, String racer, Integer points, String shassis, String engine) {
        this.id = id;
        this.season = season;
        this.racer = racer;
        this.points = points;
        this.shassis = shassis;
        this.engine = engine;
    }
    
    public static ObservableList<Champions> getChampionsList(){
        List<Champions> list = new ArrayList<>();
        SettingsFXML settings = new SettingsFXML();
        
        try (Connection connection = DriverManager.getConnection(settings.getValue(SettingsFXML.URL),
                    settings.getValue(SettingsFXML.LOGIN),
                    settings.getValue(SettingsFXML.PSW));){
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM Personal_championships");
            Champions champion = null;
            while (rs.next()) {
                champion = new Champions(
                        rs.getInt(1), 
                        rs.getInt(2), 
                        rs.getString(3), 
                        rs.getInt(4), 
                        rs.getString(5), 
                        rs.getString(6));
                list.add(champion);   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Champions.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return FXCollections.observableArrayList(list);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getRacer() {
        return racer;
    }

    public void setRacer(String racer) {
        this.racer = racer;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getShassis() {
        return shassis;
    }

    public void setShassis(String shassis) {
        this.shassis = shassis;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Champions{" + "id=" + id + ", season=" + season + ", racer=" + racer + ", points=" + points + ", shassis=" + shassis + ", engine=" + engine + '}';
    }
    
}
