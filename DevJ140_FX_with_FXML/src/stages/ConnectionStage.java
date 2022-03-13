
package stages;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ConnectionStage extends Stage{
    
    public ConnectionStage() throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml_package/FXMLConnectionStage.fxml"));
        
        Scene scene = new Scene(root);
        
        setTitle("Connection with DB");
        setScene(scene);
        show();
    }
    
}
