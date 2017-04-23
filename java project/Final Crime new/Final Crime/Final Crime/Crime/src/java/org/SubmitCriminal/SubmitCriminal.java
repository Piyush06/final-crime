/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitCriminal;

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
public class SubmitCriminal extends HttpServlet {

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
        String Cr_name = request.getParameter("cr_name");
        String Date = request.getParameter("date");
        String Time = request.getParameter("time");
        String S_name = request.getParameter("s_name");
        String Cr_address = request.getParameter("cr_address");
        String City = request.getParameter("city");
        String State = request.getParameter("state");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String filename = request.getParameter("file");
        try {
             DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String str3="INSERT INTO criminaldetails (CriminalName, Date, Time, StationName, CrimrAddress, City, State, Gender, Age,imgaddress) VALUES (?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
              pst1.setString(1,Cr_name );
                pst1.setString(2,Date );
                pst1.setString(3,Time );
                pst1.setString(4,S_name );
                pst1.setString(5, Cr_address);
                pst1.setString(6, City);
                pst1.setString(7, State);
                pst1.setString(8, gender);
                pst1.setString(9, age);
                pst1.setString(10, filename);
                  int chk1 = pst1.executeUpdate();
                  if (chk1 != 0 )
                  {
                   response.sendRedirect("welcomestation.jsp");   
                  }else{
                      
                  }
            
            
        } catch(Exception e){
            
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
