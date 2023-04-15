/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static project.DataBase.SetConnection.con;

/**
 *
 * @author atulkumarsethi
 */
public class FarmerAuthenticationDb extends SetConnection {

    ResultSet st;

    public void reduceStocks() {
        try {
            String sql1 = "update products set stocksAvailable=stocksAvailable-quantity;";
            PreparedStatement pstmt1 = con.prepareStatement(sql1);
            pstmt1.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FarmerAuthenticationDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet checkFarmer() {
        try {
            String sql = "SELECT * FROM farmers;";
            Statement stmt = con.createStatement();
            st = stmt.executeQuery(sql);

            return st;
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
            return st;
        }
    }

    public ResultSet productList() {
        String sql = "SELECT pName as 'Product Name',pPrice as 'Price', quantity as 'Quantity' FROM products where quantity!=0;";

        Statement stmt;
        try {
            stmt = con.createStatement();
            st = stmt.executeQuery(sql);
            return st;
        } catch (SQLException ex) {
            Logger.getLogger(FarmerAuthenticationDb.class.getName()).log(Level.SEVERE, null, ex);
            return st;
        }
    }
}
