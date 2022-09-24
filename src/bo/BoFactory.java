package bo;

import bo.custome.impl.ProgrammerBOImpl;

public class BoFactory {
    /*private static BoFactory boFactory;

    private BoFactory() {
    }

    public static BoFactory getBOFactory() {
        if (boFactory == null) {
            boFactory = new BoFactory();
        }
        return boFactory;
    }

    public SuperBO getBO(BoTypes types) {
        switch (types) {
            case Programme:
                return new ProgrammerBOImpl();
            *//*case CUSTOMER:
                return new CustomerBOImpl();
            case SavedOrder:
                return new SaveOrderBOImpl();
            case PURCHASE_ORDER:
                return new PurchaseOrderBOImpl();*//*
            default:
                return null;
        }
    }
    public enum BoTypes {
        Programme
        *//*, ITEM,SavedOrder, PURCHASE_ORDER*//*
    }*/
}
