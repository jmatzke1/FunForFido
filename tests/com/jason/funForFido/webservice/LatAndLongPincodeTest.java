package com.jason.funForFido.webservice;

import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 5/10/16.
 */
public class LatAndLongPincodeTest {

    private final Logger log = Logger.getLogger(this.getClass());


    @Test
    public void testGetLatLongPositions() throws Exception {
        LatAndLongPincode latAndLongPincode = new LatAndLongPincode();

        String[] latlon =  latAndLongPincode.getLatLongPositions("2933+Sachs+St+madison+wi");
        String[] latlon1 =  latAndLongPincode.getLatLongPositions("las+vegas");
        String[] latlon2 =  latAndLongPincode.getLatLongPositions("11111");

        assertTrue(latlon != null);

        log.info("Address: " + latlon[0] + ", " + latlon[1]);
        log.info("City: " + latlon1[0] + ", " + latlon1[1]);
        log.info("Zip: " + latlon2[0] + ", " + latlon2[1]);
    }
}