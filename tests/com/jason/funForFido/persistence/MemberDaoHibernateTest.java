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
    int insertedID;

    MemberEntity member = new MemberEntity();
    member.setLastName("TestLast");
    member.setFirstName("TestFirst");
    member.setAddress("TestAddress");
    member.setCity("Testcity");
    member.setState("TestState");
    member.setZipCode("TestZip");
    member.setEmailAddress("Testmyemail");

    logger.info(member.getFirstName());

    insertedID = dao.addMember(member);

    assertTrue("Member was added: " + member.getMemberID(), insertedID > 0);

    dao.deleteMember(member);

    }


}
