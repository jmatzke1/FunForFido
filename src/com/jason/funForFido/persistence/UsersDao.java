package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.UsersEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class UsersDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method returns all users in user table
     * @return users all users
     */
    public List<UsersEntity> getAllUsers() {

        List<UsersEntity> users = new ArrayList<UsersEntity>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            users = session.createCriteria(UsersEntity.class).list();
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return users;
    }

    /*
       todo: javadoc
    */
    public void updateUser(UsersEntity usersEntity) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(usersEntity);
            transaction.commit();
            log.info("Employee data changed");
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

    /*
       todo: javadoc
    */
    public UsersEntity getUser(int id) {
        UsersEntity user = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            user = (UsersEntity) session.get(UsersEntity.class, id);
            transaction.commit();
            log.info("Found user #" + id);
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return user;
    }

    /*
       todo: javadoc
    */
    public void deleteUser(UsersEntity user) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();

        } catch (HibernateException e) {

            if (transaction != null) transaction.rollback();

            log.error(e);

        } finally {

            session.close();
        }

    }

    /*
       todo: javadoc
    */
    public int addUser(UsersEntity user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;
        Integer memberId = null;

        try {
            transaction = session.beginTransaction();
            log.info(session.save(user).getClass().getName());
            memberId = (Integer) session.save(user);
            transaction.commit();
            log.info("Added user: " + memberId);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        // TODO: keeps returning zero
        return memberId;
    }

}