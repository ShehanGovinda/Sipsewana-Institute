package dao;

import dto.ProgrammeDTO;
import entity.Programme;

import java.sql.SQLException;

public interface CrudDAO {
     boolean saveProgrammes(Programme id) throws SQLException, ClassNotFoundException;
}
