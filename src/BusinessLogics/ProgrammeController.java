package BusinessLogics;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.sql.SQLException;

public class ProgrammeController {

    public String setProgrammeIDS() throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        NativeQuery sqlQuery = session.createSQLQuery("SELECT programmeID FROM Programme ORDER BY programmeID DESC LIMIT 1");
        String id = (String) sqlQuery.uniqueResult();
        System.out.println(id);
        transaction.commit();
        session.close();
        // ResultSet rst = DbConnection.getInstance().getConnection().prepareStatement("SELECT empId FROM Employee ORDER BY empId DESC LIMIT 1").executeQuery();
        if (id!=null){

            int tempId = Integer.
                    parseInt(id.split("")[1]);
            tempId=tempId+1;
            if (tempId<=9){
                return "CT00"+tempId;
            }else if(tempId<=99){
                return "CT0"+tempId;
            }else{
                return "CT"+tempId;
            }

        }else{
            return "CT001";
        }
    }


}
