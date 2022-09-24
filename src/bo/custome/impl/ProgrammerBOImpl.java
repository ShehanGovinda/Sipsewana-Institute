package bo.custome.impl;

import bo.custome.ProgrammerBO;
import dao.Custom.ProgrammeDAO;
import dao.Custom.impl.ProgrammeDAOImpl;
import dao.DAOFactory;
import dto.ProgrammeDTO;
import entity.Programme;

import java.sql.SQLException;

public class ProgrammerBOImpl implements ProgrammerBO {
    private ProgrammeDAO programmeDAO= new ProgrammeDAOImpl();/*;DAOFactory.getInstance().getDAO(DAOType.PROGRAMME);*/

    @Override
    public boolean add(ProgrammeDTO dto) throws Exception{
        return programmeDAO.add(new Programme(dto.getProgrammeID(),dto.getProgrammeName(),dto.getProgrammeDuration(),dto.getProgrammeFee()));

    }



}
