package com.jason.funForFido.controller;

import com.jason.funForFido.entity.MemberEntity;
import com.jason.funForFido.entity.UserRolesEntity;
import com.jason.funForFido.entity.UsersEntity;
import com.jason.funForFido.persistence.MemberDAOHibernate;
import com.jason.funForFido.persistence.UserRoleDao;
import com.jason.funForFido.persistence.UsersDao;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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

        ServletContext context = getServletContext();
        MemberEntity memberEntity = new MemberEntity();
        UsersEntity user = new UsersEntity();
        //Set all member info
        memberEntity.setMemberID(0);
        memberEntity.setFirstName(req.getParameter("FirstName"));
        memberEntity.setLastName(req.getParameter("LastName"));
        memberEntity.setEmailAddress(req.getParameter("emailAddress"));
        memberEntity.setAddress(req.getParameter("address"));
        memberEntity.setCity(req.getParameter("city"));
        memberEntity.setState(req.getParameter("state"));
        memberEntity.setZipCode(req.getParameter("zipCode"));
        MemberDAOHibernate daoHibernate = new MemberDAOHibernate();
        daoHibernate.addMember(memberEntity);

        // set user login
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        UsersDao usersDao = new UsersDao();
        usersDao.addUser(user);
//
        //add role
        UserRolesEntity userRolesEntity = new UserRolesEntity();
        userRolesEntity.setUsername(user.getUsername());
        UserRoleDao userRoleDao = new UserRoleDao();
        userRoleDao.addUserRole(userRolesEntity);

        context.setAttribute("member", memberEntity);
        context.setAttribute("user", user);

        doGet(req,resp);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/add_member_confirmation.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);
    }
}
