package com.jason.funForFido.utility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


/**
 * @author jjjasonm
 *         Created on 5/12/16.
 */
public class PropertyTest {
    Property property;

    @Before
    public void setUp() {
        
        property = new Property();
    }

    @Test
    public void testGetProjectName() throws Exception {
        assertNotNull(property.getProjectName());

    }

    @Test
    public void testGetUrl() throws Exception {
        assertNotNull(property.getUrl());
    }

    @Test
    public void testGetStatus() throws Exception {
        assertNotNull(property.getStatus());
    }

    @Test
    public void testGetProperties() throws Exception {
        assertNotNull(property.getProperties());
    }

    @Test
    public void testGetLatcompilepath() throws Exception {
        assertNotNull(property.getLatcompilepath());
    }

    @Test
    public void testGetAuthor() throws Exception {
        assertNotNull(property.getLatcompilepath());
    }


    @Test
    public void testGetLongcompilepath() throws Exception {
        assertNotNull(property.getLongcompilepath());
    }

}