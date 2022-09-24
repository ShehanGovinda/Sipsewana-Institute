package dao;

import dao.Custom.impl.ProgrammeDAOImpl;

public class DAOFactory {

    /*private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDAOFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    //factory method
    public SuperDAO getDAO(DAOTypes types) {
        switch (types) {
            case Programme:
                return new ProgrammeDAOImpl();
            *//*case ITEM:
                return new ItemDAOImpl();
            case ORDER:
                return new OrderDAOImpl();
            case REGISTER:
                return new RegisterDAOImpl();
            case saveorder:
                return new SavedOrderDAOImpl();*//*

            default:
                return null;
        }
    }

    public enum DAOTypes {
        Programme
        //, ITEM, ORDER,REGISTER,saveorder
    }*/

}
