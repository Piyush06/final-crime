/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitWitness;

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
public class SubmitWitness extends HttpServlet {

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
         String w_Name = request.getParameter("wname");
        String cr_date = request.getParameter("date");
        String s_name = request.getParameter("sname");
        String w_address = request.getParameter("address");
        String w_contact = request.getParameter("w_contact");
        String city = request.getParameter("city");
       String state = request.getParameter("state");
        String gender = request.getParameter("Gender");
        String age = request.getParameter("age");
        String cr_id = request.getParameter("crid");
        try {
             DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String str3="INSERT INTO witnessdetails (w_name, date, s_name, w_address, w_cnct, city, state, gender, age, cr_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
            
                pst1.setString(1,w_Name );
                pst1.setString(2,cr_date );
                pst1.setString(3,s_name );
                pst1.setString(4,w_address );
                pst1.setString(5, w_contact);
                pst1.setString(6, city);
                pst1.setString(7, state);
                pst1.setString(8, gender);
                pst1.setString(9, age);
                pst1.setString(10, cr_id);
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
