
package stages;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TableStage extends Stage{
    
    public TableStage() throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml_package/FXMLTableStage.fxml"));
        
        Scene scene = new Scene(root);
        
        setTitle("Personal championships");
        setScene(scene);
        show();
    }
    
}
