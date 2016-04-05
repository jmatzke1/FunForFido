package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.MemberEntity;
import org.apache.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 3/17/16.
 */
public class MemberDaoHibernateTest {

    private final Logger logger = Logger.getLogger(this.getClass());

@Test
    public void testAddMember() throws Exception {

    MemberDAOHibernate dao = new MemberDAOHibernate();
    int insertedID = 0;

    MemberEntity member = new MemberEntity();
    member.setLastName("Last");
    member.setFirstName("First");
    member.setAddress("Address");
    member.setCity("city");
    member.setState("State");
    member.setZipCode("Zip");
    member.setEmailAddress("Email");

    insertedID = dao.addMember(member);

    logger.info("*************************");
    logger.info("ID: " + insertedID);
    assertTrue(insertedID > 0);
    // TODO: return null, could not open connection

    }

}
