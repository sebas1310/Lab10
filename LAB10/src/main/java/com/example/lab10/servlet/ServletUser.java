package com.example.lab10.servlet;

import com.example.lab10.beans.Contratos;
import com.example.lab10.daos.DaoContratos;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ServletUser", value = "/ServletUser")
public class ServletUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action==null){
            RequestDispatcher view = request.getRequestDispatcher("User/index.jsp");
            view.forward(request,response);
        }
        DaoContratos ContratosDao = new DaoContratos();

        //asignar
        switch (action) {

            case "listarContratos":
                request.setAttribute("listaContratos", ContratosDao.listaContratos());
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("User/misContratos.jsp");
                //enviar
                requestDispatcher.forward(request, response);
                break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
