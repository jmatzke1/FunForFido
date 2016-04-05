package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.MemberEntity;
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
public class MemberDAOHibernate implements MemberDao {

    // TODO: do i have to use this.getclass?
    private final Logger log = Logger.getLogger(this.getClass());

    // TODO: Finish out these methods in MemberDao

    public List<MemberEntity> getAllMembers() {

        List<MemberEntity> members = new ArrayList<MemberEntity>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        session.createCriteria(MemberEntity.class).list();

        return members;
    }


    public void updateMember(MemberEntity member) {

    }

    @Override
    public void deleteMember(MemberEntity member) {

    }

    @Override
    public int addMember(MemberEntity member) {


        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer MemberID = null;

        try {
            tx = session.beginTransaction();
            MemberID = (Integer) session.save(member);
            tx.commit();
            log.info("Added user: " + member + "with Id of: " + MemberID);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return MemberID;
    }


}


