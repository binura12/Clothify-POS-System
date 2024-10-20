package repository.custom;

import entity.AdminEntity;
import repository.CrudDao;

public interface AdminDao extends CrudDao <AdminEntity> {
    boolean loginAdmin(String enteredGmail, String enteredPassword);
}
