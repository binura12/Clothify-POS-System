package repository.custom.impl;

import com.sun.javafx.logging.Logger;
import entity.AdminEntity;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import repository.custom.AdminDao;
import util.EncryptionUtil;
import util.HibernateUtil;

import javax.crypto.SecretKey;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

    private static final SecretKey secretKey;

    static {
        try {
            secretKey = EncryptionUtil.generateSecretKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean save(AdminEntity admin) {
        try {
            String EncryptedEmail = EncryptionUtil.encrypt(admin.getEmail(), secretKey);
            String EncryptedPassword = EncryptionUtil.encrypt(admin.getPassword(), secretKey);
            admin.setEmail(EncryptedEmail);
            admin.setPassword(EncryptedPassword);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Session session = HibernateUtil.getSession();

        session.beginTransaction();
        session.persist(admin);
        session.getTransaction().commit();
        session.close();

        return true;
    }

    @Override
    public boolean loginAdmin(String enteredGmail, String enteredPassword) {
        //TODO decrypt entered password and gmail
        return false;
    }

//    public void printAllData(){
//        List<AdminEntity> adminList = null;
//        Session session = HibernateUtil.getSession();
//        session.beginTransaction();
//        adminList = session.createQuery("from AdminEntity").list();
//        session.getTransaction().commit();
//        session.close();
//        for (AdminEntity adminEntity : adminList) {
//            System.out.println("Email: " + adminEntity.getEmail() + ", Password: " + adminEntity.getPassword() + " decrypted: " + EncryptionUtil.decrypt(adminEntity.getEmail(), secretKey) +);
//        }
//    }
}
