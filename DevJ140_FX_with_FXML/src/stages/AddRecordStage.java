
package stages;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddRecordStage extends Stage{
    
    public AddRecordStage() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml_package/FXMLAddRecordStage.fxml"));
        
        Scene scene = new Scene(root);
        
        setTitle("Add Record");
        setScene(scene);
        show();
    }
    
}
