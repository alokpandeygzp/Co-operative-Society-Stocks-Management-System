/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atulkumarsethi
 */
public class SetConnection {

    static Connection con;
    public SetConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coops","root","");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
}
