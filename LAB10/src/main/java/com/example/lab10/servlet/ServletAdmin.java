package com.example.lab10.servlet;

import com.example.lab10.beans.Contratos;
import com.example.lab10.daos.DaoCliente;
import com.example.lab10.daos.DaoContratos;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletAdmin", value = "/ServletAdmin")
public class ServletAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action==null){
            RequestDispatcher view = request.getRequestDispatcher("Admin/index.jsp");
            view.forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        DaoCliente daoCliente = new DaoCliente();
        RequestDispatcher requestDispatcher;
        switch (action){
            case "create":
                String nroDoc = request.getParameter("doc");
                String password = request.getParameter("password");
                if(nroDoc!=null && password!=null){
                    daoCliente.createCredentials(nroDoc,password);
                }
                response.sendRedirect(request.getContextPath() + "/ServletAdmin");
                break;
        }
    }
}
