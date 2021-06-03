/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dabar;

/**
 *
 * @author RANINO
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection databasekoneksi;
    public static Connection koneksiDB() throws SQLException {
        if (databasekoneksi == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/dabar";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                databasekoneksi = (Connection) DriverManager.getConnection(DB,user,pass);
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi GAGAL!");
            }
        } return databasekoneksi;
    }
    
}
