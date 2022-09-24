package Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public StackPane DashBoardForm;

    public void goToStudentRegisterForm(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) DashBoardForm.getScene().getWindow();
        stage.close();
        URL resource = getClass().getResource("../view/StudentRegisterForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.show();
        stage1.setResizable(false);
    }


    public void goToAddTrainingProgrammesForm(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) DashBoardForm.getScene().getWindow();
        stage.close();
        URL resource = getClass().getResource("../view/AddTrainingProgrammesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.show();
        stage1.setResizable(false);
    }

    public void goToStudentDetailsForm(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) DashBoardForm.getScene().getWindow();
        stage.close();
        URL resource = getClass().getResource("../view/StudentDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage1 = new Stage();
        stage1.setScene(scene);
        stage1.show();
        stage1.setResizable(false);
    }
}
