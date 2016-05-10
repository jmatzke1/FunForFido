package com.jason.funForFido.persistence;


import com.jason.funForFido.entity.ParkEntity;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jjjasonm
 *         Created on 3/17/16.
 */


public class ParkDAOHibernateTest {

    private final Logger logger = Logger.getLogger(this.getClass());

    private int insertTestRecord = 0;

    @Before
    public void setUp() throws Exception {


        ParkEntity parkEntity = new ParkEntity();
    }



    @Test
    public void addPark() {

    }


}
