/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.AddCompStatus;

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
public class AddCompStatus extends HttpServlet {

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
        Integer id= Integer.parseInt(request.getParameter("cmp_id"));
        String status=request.getParameter("status");
        try {
            DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            String qry="UPDATE firdetails SET status='"+ status +"' WHERE id='"+ id +"'";
            PreparedStatement pst1 = (PreparedStatement) con.prepareStatement(qry);
            int chk=pst1.executeUpdate(qry);
            if (chk != 0 )
                  {
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/welcomestation.jsp");
                out.println("<font color=red>Status Successfully Updates</font>");
                rd.include(request, response);
                  }else{
                 RequestDispatcher rd = getServletContext().getRequestDispatcher("/viewcomplaint.jsp");
                out.println("<font color=red>Sorry Try Again</font>");
                rd.include(request, response);
                      
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
