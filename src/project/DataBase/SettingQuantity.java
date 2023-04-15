package project.DataBase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author alokpandey181
 */
public class SettingQuantity extends SetConnection
    {
    public void setZero()
    {
        try {
            String sql2 = "update products set quantity=?;";
            PreparedStatement pstmt = con.prepareStatement(sql2);
            pstmt.setInt(1, 0);
            pstmt.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

    }
}
