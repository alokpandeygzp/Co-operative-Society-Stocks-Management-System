/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.DataBase;

import java.sql.ResultSet;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static project.DataBase.SetConnection.con;

/**
 *
 * @author atulkumarsethi
 */
public class AddingItemsDb extends SetConnection {

    public int addItem(String itemName, int stocks, int price) {
        if (itemName.equals("") || stocks == 0 || price == 0) {
            return -1;
        }
        try {
            int flag = 0;
            String sql3 = "select * from products ;";
            Statement stmt3 = con.createStatement();
            ResultSet st = stmt3.executeQuery(sql3);

            while (st.next()) {
                String iName = st.getString(2);
                System.out.println(iName);
                if (itemName.equalsIgnoreCase(iName)) {
                    System.out.println("update");

                    int id = st.getInt(1);
                    String sql5 = "update products set stocksAvailable=?,pPrice=? where id =?";
                    System.out.println(id);
                    PreparedStatement pstmt = con.prepareStatement(sql5);

                    pstmt.setInt(3, id);
                    pstmt.setInt(1, stocks);
                    pstmt.setInt(2, price);

                    pstmt.executeUpdate();
                    return 2;
                }

            }

            String sql4 = "insert into products(pName,stocksAvailable,pPrice) values(?,?,?);";

            PreparedStatement pstmt = con.prepareStatement(sql4);

            pstmt.setString(1, itemName);
            pstmt.setInt(2, stocks);
            pstmt.setInt(3, price);
            pstmt.executeUpdate();

            String sql2 = "update products set quantity=?;";
            PreparedStatement pstmt2 = con.prepareStatement(sql2);
            pstmt2.setInt(1, 0);
            pstmt2.executeUpdate();

            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(AddingItemsDb.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}
