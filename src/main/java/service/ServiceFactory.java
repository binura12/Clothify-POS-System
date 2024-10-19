package service;

import service.custom.impl.AdminServiceImpl;
import service.custom.impl.UserServiceImpl;
import service.custom.impl.EmployeeServiceImpl;
import util.ServiceType;

public class ServiceFactory {
    private static ServiceFactory instance;
    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance == null? instance = new ServiceFactory() : instance;
    }

    public <T extends SuperService> T getServiceType(ServiceType type){
        switch (type) {
            case admin:
                return (T) new AdminServiceImpl();
            case cashier:
                return (T) new UserServiceImpl();
            case employee:
                return (T) new EmployeeServiceImpl();
        }
        return null;
    }
}
