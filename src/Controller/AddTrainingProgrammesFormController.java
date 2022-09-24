package Controller;

import BusinessLogics.ProgrammeController;
import bo.BoFactory;
import bo.custome.ProgrammerBO;
import bo.custome.impl.ProgrammerBOImpl;
import dao.Custom.impl.ProgrammeDAOImpl;
import dto.ProgrammeDTO;
import entity.Programme;
import entity.Student;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.util.ArrayList;

public class AddTrainingProgrammesFormController {
    public Label lblID;
    public TextField txtName;
    public TextField txtFee;
    public TextField txtDuration;

   // private final ProgrammerBO programmerBO = (ProgrammerBO) BoFactory.getBOFactory().getBO(BoFactory.BoTypes.Programme);
   private ProgrammerBO programmerBO= new ProgrammerBOImpl();
    ArrayList<ProgrammeDTO> allCourses;

    public void initialize() throws SQLException, ClassNotFoundException {
        String id = new ProgrammeController().setProgrammeIDS();
        lblID.setText(id);
    }

    public void btnSaveProgrammingDetails(ActionEvent actionEvent) throws SQLException{
        /*if (!lblID.getText().equals("") && !txtName.getText().equals("") && !txtFee.getText().equals("") &&
                !txtDuration.getText().equals("") )*/
        /*!lblID.getText().isEmpty() && !txtName.getText().isEmpty() && !txtFee.getText().isEmpty() &&
                !txtDuration.getText().isEmpty()*/
       try {
           if (!lblID.getText().isEmpty() && !txtName.getText().isEmpty() && !txtFee.getText().isEmpty() &&
                   !txtDuration.getText().isEmpty())  {
               System.out.println("1");
               ProgrammeDTO programmeDTO = new ProgrammeDTO(lblID.getText(), txtName.getText(), txtFee.getText(), txtDuration.getText());
               System.out.print("2");

               programmerBO.add(programmeDTO);
                   System.out.println("3");
                   new Alert(Alert.AlertType.CONFIRMATION, "Saved..").show();
                   initialize();
                   txtName.clear();
                   txtFee.clear();
                   txtDuration.clear();


               } else {
                   new Alert(Alert.AlertType.WARNING, "Try Again..").show();
               }

       }catch (Exception e){
           new Alert(Alert.AlertType.WARNING, "Not Saved").show();
       }
    }
}
