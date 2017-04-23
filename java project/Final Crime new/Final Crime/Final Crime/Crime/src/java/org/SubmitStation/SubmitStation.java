/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitStation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.DBconnect.DBconnect;

/**
 *
 * @author Vishal
 */
public class SubmitStation extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String S_Name = request.getParameter("s_name");
        String S_HeadName = request.getParameter("s_headname");
        String password = request.getParameter("password1");
        String address = request.getParameter("address");
        String contact = request.getParameter("contactno");
        String email = request.getParameter("email");
        
        try {
            DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String str3="INSERT INTO stationdetails (username, password, StationName, StatonHead, Address, ContactNo, Email) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
            
                pst1.setString(1, uname );
                pst1.setString(2,password );
                pst1.setString(3,S_Name );
                pst1.setString(4,S_HeadName );
                pst1.setString(5, address);
                pst1.setString(6, contact);
                pst1.setString(7, email);
                
                  int chk1 = pst1.executeUpdate();
                  if (chk1 != 0 )
                  {
                   response.sendRedirect("");   
                  }else{
                      
                  }
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
