/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.DBconnect.DBconnect;

/**
 *
 * @author Vishal
 */
public class Login extends HttpServlet {

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
        String pass = request.getParameter("pass");
        String category = request.getParameter("select");

        try {

            DBconnect db = new DBconnect();

            Connection con = db.getDBconnection();
            Statement st = (Statement) con.createStatement();
            ResultSet rs = null;
            if ("u".equals(category)) {
                String str1 = "select * from userlogin where username='" + uname + "' and password='" + pass + "'";
                rs = st.executeQuery(str1);

            } else {
                if ("s".equals(category)) {
                    String str1 = "select * from stationdetails where username='" + uname + "' and password='" + pass + "'";
                    rs = st.executeQuery(str1);
                } else {


                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/HomePage.jsp");
                    out.println("Please Select Category User OR Station");
                }

            }

            if (rs.next()) {


                if ("u".equals(category)) {
                   
                    Cookie loginCookie = new Cookie("user", uname);
                    //setting cookie to expiry in 30 mins
                    loginCookie.setMaxAge(600 * 60);
                    response.addCookie(loginCookie);
                    response.sendRedirect("welcomeuser.jsp");
                }
                if ("s".equals(category)) {
                   
                    Cookie loginCookie = new Cookie("station", uname);
                    //setting cookie to expiry in 30 mins
                    loginCookie.setMaxAge(600 * 60);
                    response.addCookie(loginCookie);
                    response.sendRedirect("welcomestation.jsp");
                }


            } else {

                RequestDispatcher rd = getServletContext().getRequestDispatcher("/HomePage.jsp");
                out.println("<font color=red>Please Check UserName And Password... Either of one is Invalid</font>");
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
