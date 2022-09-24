package dao.Custom.impl;

import dao.Custom.ProgrammeDAO;
import dto.ProgrammeDTO;
import entity.Programme;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import util.FactoryConfiguration;

import java.sql.SQLException;

public class ProgrammeDAOImpl implements ProgrammeDAO {

    @Override
    public boolean add(Programme programme) throws SQLException, ClassNotFoundException {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(programme);
        transaction.commit();
        session.close();
        return true;
    }


}
