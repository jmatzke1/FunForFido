package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.ParkEntity;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author jjjasonm
 *         Created on 3/17/16.
 */


public class ParkDAOHibernateTest {

    private final Logger log = Logger.getLogger(this.getClass());
    ParkEntity parkEntity;
    ParkDAOHibernate dao;

    @Before
    public void setUp() throws Exception {

        parkEntity = new ParkEntity();
        dao = new ParkDAOHibernate();
        parkEntity.setParkName("TestName");
        parkEntity.setAddress("TestAddress");
        parkEntity.setCity("TestCity");
        parkEntity.setState("TestState");
        parkEntity.setZip("32445");

    }



    @Test
    public void testAddPark() {

        int insertedID;
        insertedID = dao.addPark(parkEntity);
        log.info( "++ " + parkEntity.getParkName() + "++");
        log.info("ID inserted: " + insertedID);
        assertTrue("Member was added: " + parkEntity.getParkName(), insertedID > 0);

        dao.deletePark(parkEntity);

    }


}
