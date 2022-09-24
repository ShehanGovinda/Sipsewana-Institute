package bo.custome;

import bo.SuperBO;
import dto.ProgrammeDTO;
import entity.Programme;

import java.sql.SQLException;

public interface ProgrammerBO  {
    public boolean add(ProgrammeDTO dto) throws Exception;


}
