package dao.Custom;

import dao.CrudDAO;
import dto.ProgrammeDTO;
import entity.Programme;

import java.sql.SQLException;

public interface ProgrammeDAO{
    public boolean add(Programme p) throws SQLException, ClassNotFoundException;
}
