package com.jason.funForFido.controller;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author jjjasonm
 *        This class is for just just directing to the jsp page..
 */

@WebServlet(name = "AddPark", urlPatterns = { "/AddPark" } )

public class AddPark extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request               the HttpRequest
     *@param  response              the HttpResponse
     *@exception ServletException  if there is a general
     *                              servlet exception
     *@exception IOException       if there is a general
     *                              I/O exception
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        // Create the url
        String url = "/member_add_park.jsp";
        HttpSession session = request.getSession();
        //session.setAttribute("username",request.getUserPrincipal());
       // log.info("username: " + session.getAttribute("username"));

        // TODO: set session variable to username
        // Forward to jsp page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

}
