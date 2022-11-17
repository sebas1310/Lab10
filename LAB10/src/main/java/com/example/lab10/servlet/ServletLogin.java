package com.example.lab10.servlet;

import com.example.lab10.beans.Credentials;
import com.example.lab10.daos.DaoCliente;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletLogin", urlPatterns = {"","/ServletLogin"} )
public class ServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
            view.forward(request,response);
        }
        else{
            switch (action){
                case "":
                    /*BUsuarios user = (BUsuarios) request.getSession().getAttribute("userlogged");
                    if (user != null && user.getIdUsuario() != 0 && user.getIdUsuario() != 1) {
                        requestDispatcher = request.getRequestDispatcher("Admi/AdminInicio.jsp");
                        requestDispatcher.forward(request, response);
                    } else {
                        HttpSession session = request.getSession();
                        session.invalidate();
                        response.sendRedirect(request.getContextPath() + "/ServletInicio");
                        //requestDispatcher = request.getRequestDispatcher("inicioDeSesion.jsp");
                        //requestDispatcher.forward(request, response);
                    }
                    break;*/
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DaoCliente daoCliente = new DaoCliente();

        String documento = request.getParameter("documento");
        String contrasena  = request.getParameter("contrasena");
        Credentials credentials = daoCliente.buscarUsuario(documento,contrasena);
        if(credentials !=null){
            HttpSession session = request.getSession();
            session.setAttribute("credentials",credentials);
            if (credentials.getTipoUsuario()==1){
                System.out.println("EDFFF");
                response.sendRedirect(request.getContextPath() + "/ServletAdmin");
            }else if (credentials.getTipoUsuario()==2){
                response.sendRedirect(request.getContextPath() + "/ServletUser");
            }
        }else{
            response.sendRedirect(request.getContextPath() + "ServletLogin");
        }
    }
}
