package com.jason.funForFido.persistence;

import com.jason.funForFido.entity.UsersEntity;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;


/**
 * @author jjjasonm
 *         Created on 5/8/16.
 */
public class UsersDaoTest {

    private final Logger log = Logger.getLogger(this.getClass());
    UsersDao usersDao;
    UsersEntity usersEntity;

    @Before
    public void setUp() {
        usersDao = new UsersDao();
        usersEntity  = new UsersEntity();
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<UsersEntity> list = usersDao.getAllUsers();
        log.info(usersDao.getAllUsers());
        assertTrue(list.size() > 0);
    }

    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testDeleteUser() throws Exception {
        List<UsersEntity> list = usersDao.getAllUsers();
        int sizeBeforeAdd = list.size();

    }

    @Test
    public void testAddUser() throws Exception {

        int insertedUsersId = 0;

        usersEntity.setUsername("newusername");
        usersEntity.setPassword("greatpassword");

        insertedUsersId = usersDao.addUser(usersEntity);

        assertTrue("New user not added", insertedUsersId > 0 );

        usersDao.deleteUser(usersEntity);
    }

    @Test
    public void testSearchUsers() throws Exception {

    }

    @Test
    public void testGetUsers() throws Exception {

    }

}