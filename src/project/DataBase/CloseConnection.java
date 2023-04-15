/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static project.DataBase.SetConnection.con;

/**
 *
 * @author atulkumarsethi
 */
public class CloseConnection {
    public void closeConnection()
    {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SetConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
