/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.dao.AutoDao;
import com.mycompany.model.Auto;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import java.util.List;
/**
 *
 * @author Jovany
 */
@WebServlet(name = "autoController", urlPatterns = {"/autoController"})
public class AutoController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            
            
         
            /*
            String opcion = request.getParameter("opcion");
            if(opcion.equals("registro") ){
                RequestDispatcher rd = request.getRequestDispatcher("registro.jsp");
                rd.forward(request, response);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }*/
    



    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
            Auto a1= new Auto("a","a","a","a","a","a");
            Auto a2= new Auto("b","b","b","b","b","b");
            Auto a3= new Auto("c","c","c","c","c","c");
            AutoDao autoDao = new AutoDao();
            autoDao.add(a1);
            autoDao.add(a2);
            autoDao.add(a3);
            
            List<Auto> lista=autoDao.get();
            request.setAttribute("autos", lista);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        
            rd.forward(request, response);
        */
            AutoDao autoDao = new AutoDao();
            String opcion = request.getParameter("opcion");
            if(opcion.equals("registro") ){
                RequestDispatcher rd = request.getRequestDispatcher("registro.jsp");
                rd.forward(request, response);
            }
            if(opcion.equals("editar")){
                Auto a = new Auto();
                a=autoDao.getAuto(request.getParameter("placa"));
                request.setAttribute("auto", a);
                RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
                rd.forward(request, response);
            }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AutoDao autoDao = new AutoDao();
        String opcion = request.getParameter("opcion");
            if(opcion.equals("crear") ){
            
            Auto auto= new Auto();
            auto.setMarca(request.getParameter("marca"));
            auto.setModelo(request.getParameter("modelo"));
            auto.setPlaca(request.getParameter("placa"));
            autoDao.add(auto);
            List<Auto> lista=autoDao.get();
            request.setAttribute("autos", lista);
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            }
            if(opcion.equals("actualizar")){
                Auto auto= new Auto();
                auto.setMarca(request.getParameter("marca"));
                auto.setModelo(request.getParameter("modelo"));
                auto.setPlaca(request.getParameter("placa"));
                autoDao.update(auto);
                RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
