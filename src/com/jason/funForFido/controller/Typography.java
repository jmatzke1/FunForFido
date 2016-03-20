package com.jason.funForFido.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author jjjasonm
 *         Created on 3/20/16.
 */


@WebServlet(name = "typography", urlPatterns = { "/typography" } )


public class Typography extends HttpServlet {

        /**
         *  Handles HTTP GET requests.
         *
         *@param  request               the HttpRequest
         *@param  response              the HttpResponse
         *@exception  ServletException  if there is a general
         *                              servlet exception
         *@exception  IOException       if there is a general
         *                              I/O exception
         */
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            // Create the url
            String url = "/typography.jsp";

            // Forward to jsp page
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        }

    }

