/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FIRSubmit;

import org.DBconnect.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vishal
 */
public class FIRSubmit extends HttpServlet {

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
        String crName = request.getParameter("cr_name");
        String S_Head = request.getParameter("s_head");
        String matter = request.getParameter("matter");
        String Date = request.getParameter("date");
        String Time = request.getParameter("time");
        String S_Name = request.getParameter("s_name");
        String crAddress = request.getParameter("cr_address");
        String City = request.getParameter("city");
        String State = request.getParameter("state");
        String username="";
        try {
            DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            Cookie[] cookies = request.getCookies();
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("station") || cookie.getName().equals("user")) {
                        username = cookie.getValue();
                    }
                }
            }
            String str3="INSERT INTO firdetails (cr_name, StationHead, matter, date, time, StationName, cr_address, city, state,user) VALUES (?,?,?,?,?,?,?,?,?,?)";
             PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(str3);
             pst1.setString(1, crName);
                pst1.setString(2,S_Head );
                pst1.setString(3, matter);
                pst1.setString(4, Date);
                pst1.setString(5, Time);
                pst1.setString(6, S_Name);
                pst1.setString(7, crAddress );
                pst1.setString(8,City );
                pst1.setString(9,State );
                pst1.setString(10,username );
                int chk1 = pst1.executeUpdate();
                  if (chk1 != 0 )
                  {
                  RequestDispatcher rd = getServletContext().getRequestDispatcher("/HomePage.jsp");
                out.println("<font color=red>Successfully FIR Submited</font>");
                rd.include(request, response);
                  }else{
                       RequestDispatcher rd = getServletContext().getRequestDispatcher("/addfir.jsp");
                out.println("<font color=red>Please Try Again Error Occured</font>");
                rd.include(request, response);
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
