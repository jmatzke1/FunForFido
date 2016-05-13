package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.UserRolesEntity;
import com.jason.funForFido.entity.UserRolesEntityPK;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class UserRoleDao {

    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * This method adds a role to the username for authenication
     *
     * @param userRole role of the new member
     */
    public void addUserRole(UserRolesEntity userRole) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;
        UserRolesEntityPK username;

        try {
            transaction = session.beginTransaction();
            username = (UserRolesEntityPK)session.save(userRole);
            transaction.commit();
            log.info("Added employee: " + username);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }
}