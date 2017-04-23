/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.DBconnect;

import java.sql.*;

/**
 *
 * @author Vishal
 */
public class DBconnect {
    public Connection getDBconnection(){
         Connection con=null;
        try {
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime", "root", "supriya");
             
        } catch (Exception e) {
        }
        return con;
        
    }
    
    
}
