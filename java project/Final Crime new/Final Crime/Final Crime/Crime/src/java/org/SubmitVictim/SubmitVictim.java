/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitVictim;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.DBconnect.DBconnect;

/**
 *
 * @author Vishal
 */
public class SubmitVictim extends HttpServlet {

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
         String v_Name = request.getParameter("vname");
        String cr_date = request.getParameter("date");
        String s_name = request.getParameter("sname");
        String v_address = request.getParameter("vaddress");
        String v_contact = request.getParameter("vcontact");
        String city = request.getParameter("city");
       String state = request.getParameter("state");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String cr_id = request.getParameter("crid");
        
        try {
            DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String str3="INSERT INTO victimdetails (v_name, s_name, v_address, v_contact, city, state, gender, age, cr_id) VALUES (?,?,?,?,?,?,?,?,?)";
             PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
            
                pst1.setString(1,v_Name );
                pst1.setString(2,s_name );
                pst1.setString(3,v_address );
                pst1.setString(4,v_contact );
                pst1.setString(5, city);
                pst1.setString(6, state);
                pst1.setString(7, gender);
                pst1.setString(8, age);
                pst1.setString(9, cr_id);
                 int chk1 = pst1.executeUpdate();
                 if (chk1 != 0 )
                  {
                  
                      RequestDispatcher rd = getServletContext().getRequestDispatcher("/welcomestation.jsp");
                out.println("<font color=red>Successfully  Submited</font>");
                rd.include(request, response);
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
