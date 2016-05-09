package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.ParkEntity;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jjjasonm
 *         Created on 3/17/16.
 */
public class    ParkDAOHibernate {

    private final Logger log = Logger.getLogger(this.getClass());
    /*
       todo: javadoc
    */
    public List<ParkEntity> getAllParks() {

        List<ParkEntity> parks = new ArrayList<ParkEntity>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        parks = (ArrayList<ParkEntity>)session.createCriteria(ParkEntity.class).list();

        return parks;

    }
    /*
       todo: javadoc
    */
    public ParkEntity getParkById(int id) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        return (ParkEntity)session.get(ParkEntity.class, id);
    }
    /*
       todo: javadoc
    */
    public int addPark(ParkEntity park) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        // TODO: check to see if this matches the database
        Integer parkID = null;

        try {

            tx = session.beginTransaction();
            parkID = (Integer) session.save(park);
            tx.commit();
            log.info("Added park" + park);

        } catch (HibernateException e) {

            if(tx!=null) tx.rollback();
            log.error(e);

        } finally {

            session.close();
        }

        return parkID;
    }
}
