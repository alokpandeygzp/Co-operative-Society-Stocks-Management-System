/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static project.DataBase.SetConnection.con;

/**
 *
 * @author atulkumarsethi
 */
public class AddingFarmerDb extends SetConnection{
    
    public int addfarmer(String fName, String fAadhar, String fVillage) {
        try {
            if(fName.equals("") || fAadhar.equals("")  || fVillage.equals(""))
            {
                return -1;
            }
            
            String sql = "insert into farmers(fName,fAadhar,fVillage) values(?,?,?);";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, fName);
            pstmt.setString(2, fAadhar);
            pstmt.setString(3, fVillage);

            pstmt.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
            return -1;
        }
    }
    
}
