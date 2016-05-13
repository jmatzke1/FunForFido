package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.MemberEntity;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 3/17/16.
 */
public class MemberDaoHibernateTest {

    private final Logger log = Logger.getLogger(this.getClass());
    MemberDAOHibernate dao;
    MemberEntity member;

    @Before
    public void setUp() {
        dao = new MemberDAOHibernate();
        member = new MemberEntity();
        member.setLastName("TestLast");
        member.setFirstName("TestFirst");
        member.setAddress("TestAddress");
        member.setCity("Testcity");
        member.setState("TestState");
        member.setZipCode("TestZip");
        member.setEmailAddress("Testmyemail");
    }


    @Test
    public void testAddMember() throws Exception {

    int insertedID;
    insertedID = dao.addMember(member);
    log.info( "++ " + member.getFirstName() + "++");
    log.info("ID inserted: " + insertedID);
    assertTrue("Member was added: " + member.getMemberID(), insertedID > 0);

    dao.deleteMember(member);

    }

    @Test
    public void testGetAllMembers() throws Exception {

        List<MemberEntity> memberEntityList = dao.getAllMembers();
        log.info("++" + memberEntityList + "++");
        assertTrue(memberEntityList.size() > 0);

    }



}
