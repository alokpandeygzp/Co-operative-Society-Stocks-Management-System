/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.*;

/**
 *
 * @author atulkumarsethi
 */
public class ShowProductDb extends SetConnection{

    ResultSet st;    
    public ResultSet list() {
        try {
            String sql = "SELECT pName as 'Product Name',stocksAvailable as 'Stocks Available',pPrice as 'Price' FROM products;";
            java.sql.Statement stmt = con.createStatement();
            st = stmt.executeQuery(sql);

            return st;
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
                    return st;

        }
    }

}
