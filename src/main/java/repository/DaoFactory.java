package repository;

import repository.custom.impl.AdminDaoImpl;
import repository.custom.impl.CashierDaoImpl;
import repository.custom.impl.EmployeeDaoImpl;
import util.DaoType;

public class DaoFactory {
    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance == null? instance = new DaoFactory() : instance;
    }

    public <T extends SuperDao> T getDaoType(DaoType type){
        switch (type){
            case cashier:
                return (T) new CashierDaoImpl();
            case admin:
                return (T) new AdminDaoImpl();
            case employee:
                return (T) new EmployeeDaoImpl();
        }
        return null;
    }
}
