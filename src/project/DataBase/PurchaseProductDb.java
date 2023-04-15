/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static project.DataBase.SetConnection.con;

/**
 *
 * @author atulkumarsethi
 */
public class PurchaseProductDb extends SetConnection {

    public void addToCart(int x, int y) {
        String sql = "update products set quantity=? where id=?;";

        PreparedStatement pstmt;
        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, y);
            pstmt.setInt(2, x);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseProductDb.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    ResultSet st;    
    public ResultSet list() {
        try {
            String sql = "SELECT id as 'Item Id',pName as 'Product Name',stocksAvailable as 'Stocks Available',pPrice as 'Price' FROM products;";
            java.sql.Statement stmt = con.createStatement();
            st = stmt.executeQuery(sql);

            return st;
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
                    return st;

        }
    }
}
