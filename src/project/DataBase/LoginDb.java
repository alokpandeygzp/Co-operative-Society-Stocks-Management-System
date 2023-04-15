/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static project.DataBase.SetConnection.con;

/**
 *
 * @author atulkumarsethi
 */
public class LoginDb extends SetConnection{
    ResultSet st;
//                SetConnection connection = new SetConnection();

    public ResultSet loginDetails()
    {
        try {
            SetConnection connection = new SetConnection();
            String sql = "SELECT * FROM admin;";
            Statement stmt = con.createStatement();
            st = stmt.executeQuery(sql);           
            return st;
        } catch (Exception ex) {
            System.out.print("abc");
            Logger.getLogger(LoginDb.class.getName()).log(Level.SEVERE, null, ex);
            
                    return st;

        }
        
    }
    
}
