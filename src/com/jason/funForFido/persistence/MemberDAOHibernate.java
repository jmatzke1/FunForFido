package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.MemberEntity;
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
public class MemberDAOHibernate implements MemberDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method gets all member listed in the database
     *
     * @return members  A list of all members in the member table.
     */
    public List<MemberEntity> getAllMembers() {

        List<MemberEntity> members = new ArrayList<MemberEntity>();

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Criteria cr = session.createCriteria(MemberEntity.class);
        members = cr.list();

        return members;
    }

    /**
     * This method will change a field for the member
     *
     * @param member member the member to be changed
     */
    public void updateMember(MemberEntity member) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            member = (MemberEntity) session.get(MemberEntity.class, member.getZipCode());
            session.update(member);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }

    }


    @Override
    public void deleteMember(MemberEntity member) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
         member = (MemberEntity) session.get(MemberEntity.class, member.getMemberID());
            session.delete(member);
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }


    @Override
    public int addMember(MemberEntity member) {


        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer MemberID = 0;

        try {

            tx = session.beginTransaction();
            MemberID = (Integer) session.save(member);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return MemberID;
    }

}


