package service.custom.impl;

import dto.Admin;
import entity.AdminEntity;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.custom.AdminDao;
import service.custom.AdminService;
import util.DaoType;

public class AdminServiceImpl implements AdminService {
    @Override
    public boolean addAdmin(Admin admin) {
        AdminEntity adminEntity = new ModelMapper().map(admin, AdminEntity.class);

        AdminDao adminDao = DaoFactory.getInstance().getDaoType(DaoType.admin);
        adminDao.save(adminEntity);

        return false;
    }
}
