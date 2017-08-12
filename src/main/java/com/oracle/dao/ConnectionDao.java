
package com.oracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDao {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectar(){
        String url = "jdbc:derby://localhost:1527/BDTest";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName= "root";
        String password= "root";
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Coneccion exitosa");
        } catch (Exception ex) {
            Logger.getLogger(ConnectionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cerrar(){
        try {
            if(con != null && !con.isClosed()){
                
            }
            } catch (Exception ex) {
            Logger.getLogger(ConnectionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        ConnectionDao con = new ConnectionDao();
        con.conectar();
    }
}
