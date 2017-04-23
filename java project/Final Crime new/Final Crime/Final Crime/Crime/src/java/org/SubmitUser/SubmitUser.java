/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.SubmitUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.DBconnect.DBconnect;

/**
 *
 * @author Vishal
 */
public class SubmitUser extends HttpServlet {

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
        String fname = request.getParameter("fname");
        String mname = request.getParameter("mname");
        String lname = request.getParameter("lname");
        String uname = request.getParameter("txtusername");
        String pass = request.getParameter("txtpassword");
        String Gender = request.getParameter("Gender");
        String Address = request.getParameter("address");
        String Contact = request.getParameter("contactno");
        String email = request.getParameter("email");
        String dob = request.getParameter("DOB");
        try {
            DBconnect db=new DBconnect();
            
            Connection con = db.getDBconnection();
            Statement st = (Statement) con.createStatement();
            String str1 = "select * from userlogin where username='" + uname + "'";
            ResultSet rs = st.executeQuery(str1);
             if (rs.next()) {
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/userreg.jsp");

                out.println("<font color=red>Sorry UserName You Have Entered is not available....</font>");
                rd.include(request, response);
               
            }else{
                 
                 try {
                     DBconnect db1=new DBconnect();
                     Connection con1=db1.getDBconnection();
                     String str3 = "INSERT INTO userdetail(fname, mname, lname, Gender, password, uname, Address, Mob, email, DOB) VALUES (?,?,?,?,?,?,?,?,?,?)";
                String str2 = "insert into userlogin(username,password) values(?,?)";
                PreparedStatement pst = (PreparedStatement) con1.prepareStatement(str2);
                PreparedStatement pst1 = (PreparedStatement) con1.prepareStatement(str3);

                pst.setString(1, uname);
                pst.setString(2, pass);
                pst1.setString(1, fname);
                pst1.setString(2, mname);
                pst1.setString(3, lname);
                pst1.setString(4, Gender);
                pst1.setString(5, pass);
                pst1.setString(6, uname);
                pst1.setString(7, Address);
                pst1.setString(8, Contact);
                pst1.setString(9, email);
                pst1.setString(10, dob);
                
                int chk1 = pst1.executeUpdate();
                int chk = pst.executeUpdate();

                if (chk1 != 0 && chk != 0) {
                    
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/HomePage.jsp");

                out.println("<font color=red>Welcome .. You have registered.. Now You Can Log In..</font>");
                rd.include(request, response);
                } else {
                    response.sendRedirect("userreg.jsp");
                    out.println("<font color=red>Sorry Retry the Registration Process</font>");
                }
                pst1.close();
 
                     
                 } catch (Exception e) {
                 }
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
