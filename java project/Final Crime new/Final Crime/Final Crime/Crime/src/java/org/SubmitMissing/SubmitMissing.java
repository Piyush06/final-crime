/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitMissing;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class SubmitMissing extends HttpServlet {

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
        String persn_Name = request.getParameter("p_name");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String contact = request.getParameter("contact");
        String address = request.getParameter("address");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String S_name = request.getParameter("s_name");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
         String filename = request.getParameter("file");

        try {
            DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String str3="INSERT INTO missingdetails (mis_name, age, gender, contact, address, date, time, s_name, city, state,img_address) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
       PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
            
                pst1.setString(1,persn_Name );
                pst1.setString(2,age );
                pst1.setString(3,gender );
                pst1.setString(4,contact );
                pst1.setString(5, address);
                pst1.setString(6, date);
                pst1.setString(7, time);
                pst1.setString(8, S_name);
                pst1.setString(9, city);
                pst1.setString(10, state);
                pst1.setString(11, filename);
                  int chk1 = pst1.executeUpdate();
                  if (chk1 != 0 )
                  { RequestDispatcher rd = getServletContext().getRequestDispatcher("/HomePage.jsp");
                out.println("Successfully Submited Data");

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
