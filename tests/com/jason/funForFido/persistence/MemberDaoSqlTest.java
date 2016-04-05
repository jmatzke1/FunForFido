package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.MemberEntity;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 4/5/16.
 */
public class MemberDaoSqlTest {

    private final Logger log = Logger.getLogger(this.getClass());

    @Test
    public void testGetAllMembers() throws Exception {
        MemberDaoSql daoSql = new MemberDaoSql();
        List<MemberEntity> memberEntities = daoSql.getAllMembers();
        log.info("Size of list" +memberEntities.size());
        assertTrue(memberEntities.size() > 0);

    }

    @Test
    public void testUpdateMember() throws Exception {

        MemberDaoSql daoSql = new MemberDaoSql();
    }

    @Test
    public void testDeleteMember() throws Exception {

    }

    @Test
    public void testAddMember() throws Exception {

    }
}