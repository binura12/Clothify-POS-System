package repository.custom.impl;

import dto.Admin;
import entity.AdminEntity;
import org.hibernate.Session;
import repository.custom.AdminDao;
import util.HibernateUtil;

public class AdminDaoImpl implements AdminDao {
    @Override
    public boolean save(AdminEntity admin) {
        Session session = HibernateUtil.getSession();

        session.beginTransaction();
        session.persist(admin);
        session.getTransaction().commit();
        session.close();

        return true;
    }
}
