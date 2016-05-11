package com.jason.funForFido.controller;

import com.jason.funForFido.entity.MemberEntity;
import com.jason.funForFido.entity.UserRolesEntity;
import com.jason.funForFido.entity.UsersEntity;
import com.jason.funForFido.persistence.MemberDAOHibernate;
import com.jason.funForFido.persistence.UserRoleDao;
import com.jason.funForFido.persistence.UsersDao;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Jason Matzke.
 */

@WebServlet(name = "addMemberToDatabase", urlPatterns = { "/addMemberToDatabase" } )


public class AddMemberToDatabase extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * todo: javadoc
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        MemberEntity memberEntity = new MemberEntity();
        //Set all member info
        memberEntity.setMemberID(0);
        memberEntity.setFirstName(req.getParameter("FirstName"));
        memberEntity.setLastName(req.getParameter("LastName"));
        memberEntity.setEmailAddress(req.getParameter("emailAddress"));
        memberEntity.setLastName(req.getParameter("username"));
        memberEntity.setPassword(req.getParameter("password"));
        memberEntity.setAddress(req.getParameter("address"));
        memberEntity.setCity(req.getParameter("city"));
        memberEntity.setState(req.getParameter("state"));
        memberEntity.setZipCode(req.getParameter("zipCode"));
        MemberDAOHibernate daoHibernate = new MemberDAOHibernate();
        daoHibernate.addMember(memberEntity);

        // set user login
        UsersEntity user = new UsersEntity();

        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        UsersDao usersDao = new UsersDao();
        usersDao.addUser(user);

        //add role
        UserRolesEntity userRolesEntity = new UserRolesEntity();
        userRolesEntity.setUsername(user.getUsername());
        UserRoleDao userRoleDao = new UserRoleDao();
        userRoleDao.addUserRole(userRolesEntity);


        // TODO: servlet context for display
        String url = "index.jsp";

        resp.sendRedirect(url);
    }
}
