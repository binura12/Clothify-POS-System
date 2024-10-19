package repository.custom.impl;

import entity.UserEntity;
import org.hibernate.Session;
import repository.custom.UserDao;
import util.HibernateUtil;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(UserEntity cashier) {
        Session session = HibernateUtil.getSession();

        session.beginTransaction();
        session.persist(cashier);
        session.getTransaction().commit();
        session.close();

        return true;
    }
}
