package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.ParkEntity;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
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

    /**
     *  get all parks in the  database
     * @return list of parks
     */
    public List<ParkEntity> getAllParks() {

        List<ParkEntity> parks = new ArrayList<ParkEntity>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        parks = (ArrayList<ParkEntity>)session.createCriteria(ParkEntity.class).list();

        Criteria cr = session.createCriteria(ParkEntity.class);
        parks = cr.list();

        return parks;

    }

    /**
     *
     * @param park park object
     * @return parkid - the id of the park entered
     */
    public int addPark(ParkEntity park) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
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

    /**
     *  deletes the park
     *
     * @param parkEntity park to be deleted
     */
    public void deletePark(ParkEntity parkEntity) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            parkEntity = (ParkEntity) session.get(ParkEntity.class, parkEntity.getParkId());
            session.delete(parkEntity);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        }finally {
            session.close();
        }
    }

}
