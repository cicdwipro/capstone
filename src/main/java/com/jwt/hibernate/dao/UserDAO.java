package com.jwt.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
import com.jwt.hibernate.bean.User;
 
public class UserDAO {
 
    public static void addUserDetails(String userName, String password1, String password2, String email,
            String phone, String city ,String gender) {
        try {
            // 1. configuring hibernate
            Configuration configuration = new Configuration().configure();
 
            // 2. create sessionfactory
            SessionFactory sessionFactory = configuration.buildSessionFactory();
 
            // 3. Get Session object
            Session session = sessionFactory.openSession();
 
            // 4. Starting Transaction
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setUserName(userName);
            user.setPassword1(password1);
            user.setPassword2(password2);
            user.setEmail(email);
            user.setCity(city);
            user.setPhone(phone);
            user.setGender(gender);
            session.save(user);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
 
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }
}
 
 
