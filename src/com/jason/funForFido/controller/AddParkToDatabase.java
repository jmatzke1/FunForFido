package com.jason.funForFido.controller;

import com.jason.funForFido.entity.ParkEntity;
import com.jason.funForFido.persistence.ParkDAOHibernate;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "addParkToDatabase", urlPatterns = { "/addParkToDatabase" } )


public class AddParkToDatabase extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setParkId(0);
        parkEntity.setAddress(req.getParameter("address"));
        parkEntity.setCity(req.getParameter("city"));
        parkEntity.setState(req.getParameter("state"));
        parkEntity.setZip(req.getParameter("zipCode"));
        log.info(parkEntity + "member");
        log.debug("+++++Adding User+++++: " + parkEntity);
        ParkDAOHibernate daoHibernate = new ParkDAOHibernate();
        daoHibernate.addPark(parkEntity);

        String url = "index.jsp";

        resp.sendRedirect(url);
    }
}