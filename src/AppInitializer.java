import entity.Programme;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {



        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

       /* Programme p = new Programme();
        p.setProgrammeID("C001");
        p.setProgrammeName("Automobile");
        p.setProgrammeDuration("6");
        p.setProgrammeFee("2500");


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.save(p);*/

         Parent load = FXMLLoader.load(this.getClass().getResource("view/LoginForm.fxml"));
        // new FadeIn(load).play();
        primaryStage.setScene(new Scene(load));
        primaryStage.show();
    }
}
