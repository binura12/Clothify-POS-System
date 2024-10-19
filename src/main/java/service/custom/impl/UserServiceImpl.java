package service.custom.impl;

import dto.User;
import entity.UserEntity;
import org.modelmapper.ModelMapper;
import repository.DaoFactory;
import repository.custom.UserDao;
import service.custom.UserService;
import util.DaoType;

public class UserServiceImpl implements UserService {
    @Override
    public boolean addCashier(User user) {
        UserEntity userEntity = new ModelMapper().map(user, UserEntity.class);

        UserDao userDao = DaoFactory.getInstance().getDaoType(DaoType.cashier);
        userDao.save(userEntity);

        return false;
    }
}
