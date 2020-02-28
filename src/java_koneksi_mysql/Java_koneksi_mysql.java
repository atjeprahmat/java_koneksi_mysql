/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_koneksi_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author atjep
 */
public class Java_koneksi_mysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Connection conn = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_java_mysql";
        String user = "root";
        String pass = "";
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            //System.out.println("Koneksi Berhasil");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (SQLException e){
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
    }
    
}
