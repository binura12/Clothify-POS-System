package service.custom;

import dto.Admin;
import service.SuperService;

public interface AdminService extends SuperService{
    boolean addAdmin(Admin admin);
    boolean loginAdmin(String enteredGmail, String enteredPassword);
}
