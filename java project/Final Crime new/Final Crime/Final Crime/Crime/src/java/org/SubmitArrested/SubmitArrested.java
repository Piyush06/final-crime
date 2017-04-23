/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitArrested;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.DBconnect.DBconnect;

/**
 *
 * @author Vishal
 */
public class SubmitArrested extends HttpServlet {

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
        String persn_Name = request.getParameter("prsn_name");
        String S_Head = request.getParameter("st_head");
        String matter = request.getParameter("matter");
        String Arr_Date = request.getParameter("arr_date");
        String Arr_Time = request.getParameter("arr_time");
        String S_Name = request.getParameter("st_name");
        String Prsn_Address = request.getParameter("address");
        String City = request.getParameter("city");
        String State = request.getParameter("state");
        
        try {
              DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String str3="INSERT INTO arrestdetails (arrest_personname, StationHead, Matter, ArrestDate, ArrestTime, StationName, ArrestedPersonAddress, City, State) VALUES (?,?,?,?,?,?,?,?,?)";
             PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
            
                pst1.setString(1,persn_Name );
                pst1.setString(2,S_Head );
                pst1.setString(3,matter );
                pst1.setString(4,Arr_Date );
                pst1.setString(5, Arr_Time);
                pst1.setString(6, S_Name);
                pst1.setString(7, Prsn_Address);
                pst1.setString(8, City);
                pst1.setString(9, State);
                  int chk1 = pst1.executeUpdate();
                  if (chk1 != 0 )
                  {
                  
                      RequestDispatcher rd = getServletContext().getRequestDispatcher("/HomePage.jsp");
                out.println("<font color=red>Successfully  Submited</font>");
                rd.include(request, response);
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
