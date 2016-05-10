package com.jason.funForFido.entity;

import org.junit.Before;
import org.junit.Test;


/**
 * @author jjjasonm
 *         Created on 5/8/16
 */
public class UsersEntityTest {

    @Before
    public void setUp() throws Exception {

        UsersEntity users = new UsersEntity();
        users.setMemberId(0);
        users.setUsername("username");
        users.setPassword("password");

    }

    @Test
    public void testSetMethods() throws Exception {

    }

    @Test
    public void testGetPassword() throws Exception {

    }

    @Test
    public void testGetMemberId() throws Exception {

    }

    @Test
    public void testEquals() throws Exception {

    }
}