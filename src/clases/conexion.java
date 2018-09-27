/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 * @author WELLINGTON
 */
public class conexion {
    static Connection con = null;
    
    static String url="";
    static String user="";
    static String pass="";
    
    public static void nomvar(String var, String var2, String var3){
        url=var;
        user=var2;
        pass=var3;
    }
    
   
    public static Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            try {
                con = (Connection) DriverManager.getConnection(url, user, pass);
//                JOptionPane.showMessageDialog(null, "conectado");
            } catch (SQLException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con; 
    }
}
