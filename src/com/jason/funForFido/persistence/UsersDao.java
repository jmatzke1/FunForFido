package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.UsersEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

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
    public UsersEntity getUser(String id) {
        UsersEntity user = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            user = (UsersEntity) session.get(com.jason.funForFido.entity.UsersEntity.class, id);
            log.info("User:" + user);
            transaction.commit();
            log.info("Found username: " + id);
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return user;
    }

    public UsersEntity findUserByUsername(String username) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        UsersEntity user = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("from UsersEntity where username = :searchTerm");
            query.setParameter("searchTerm", username);
            user = (UsersEntity) query.list().get(0);


        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } catch (IndexOutOfBoundsException e) {
            log.debug("Username not found!");

            return null;
        }finally {

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
        Integer memberId = 0;

        try {
            transaction = session.beginTransaction();
            log.info("print something " + session.save(user).getClass().getName());
            memberId = (Integer) session.save("UserEntity", user);
            transaction.commit();
            log.info("Added user: " + user.getUsername());

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        // TODO: keeps returning zero
        log.info(memberId + "eeeeeeee");
        return memberId;
    }

}