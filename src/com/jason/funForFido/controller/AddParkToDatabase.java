package com.jason.funForFido.controller;

import com.jason.funForFido.entity.ParkEntity;
import com.jason.funForFido.persistence.ParkDAOHibernate;
import com.jason.funForFido.webservice.LatAndLongPincode;
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
 *
 */
@WebServlet(name = "addParkToDatabase", urlPatterns = { "/addParkToDatabase" } )

public class AddParkToDatabase extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    // todo: same servlet ? for doPost and doGet


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        LatAndLongPincode latAndLongPincode = new LatAndLongPincode();
        String[] latlon = new String[0];

        try {
            latlon = LatAndLongPincode.getLatLongPositions(req.getParameter("zipCode"));
        } catch (Exception e) {
            log.error(e);
        }


        ServletContext context = getServletContext();
        ParkEntity parkEntity = new ParkEntity();
        parkEntity.setParkId(0);
        parkEntity.setParkName(req.getParameter("parkName"));
        parkEntity.setAddress(req.getParameter("address"));
        parkEntity.setCity(req.getParameter("city"));
        parkEntity.setState(req.getParameter("state"));
        parkEntity.setZip(req.getParameter("zipCode"));
        parkEntity.setLatitude(latlon[0]);
        parkEntity.setLatitude(latlon[1]);
        log.info("+++++Adding User+++++: " + parkEntity);
        ParkDAOHibernate daoHibernate = new ParkDAOHibernate();
        daoHibernate.addPark(parkEntity);

        context.setAttribute("object",parkEntity);
        // todo: add conformation page with info ?


        doGet(req,resp);
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/add_confirmation.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);
    }
}