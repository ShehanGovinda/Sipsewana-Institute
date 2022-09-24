package Controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public StackPane LoginForm;

    public void goToDashBoardForm(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) LoginForm.getScene().getWindow();
        stage.close();
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.setTitle(" A Plus Education Institute ");
        stage1.show();
        stage1.setResizable(true);


    }
}
