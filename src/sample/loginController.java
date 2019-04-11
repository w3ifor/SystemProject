package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;


public class loginController extends Main{

    public void signup(ActionEvent event) throws IOException {
                    Parent root=FXMLLoader.load(getClass().getResource("signUp.fxml"));
                    Scene scene=new Scene(root);
                    Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
                    window.setScene(scene);
                    window.show();

    }
}
