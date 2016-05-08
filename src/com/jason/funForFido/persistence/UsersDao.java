package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.UsersEntity;
import org.apache.log4j.Logger;
import org.hibernate.*;

import java.util.ArrayList;
import java.util.List;

public class UsersDao {

    private final Logger log = Logger.getLogger(this.getClass());

    public List<UsersEntity> getAllUsers() {

        List<UsersEntity> users = new ArrayList<>();
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

    public void updateUser(UsersEntity user) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
            log.info("Employee updated");
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

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

    public void deleteUser(UsersEntity user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
            log.info("employee deleted");
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    public int addUser(UsersEntity user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;
        Integer employeeId = 0;

        try {
            transaction = session.beginTransaction();
            employeeId = (Integer) session.save(user);
            transaction.commit();
            log.info("Added employee: " + employeeId);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return employeeId;
    }

    public List<UsersEntity> searchUsers(int pageSize, int offset, String search) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        try {
//            Query query = session.createQuery();
//            query.setFirstResult(offset);
//            query.setMaxResults(offset + pageSize);
//            return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public List<UsersEntity> getUsers(int pageSize, int offset) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        try {
//            Query query = session.createQuery("From users ");
//            query.setFirstResult(offset);
//            query.setMaxResults(offset + pageSize);
          //  return query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return null;
    }
}