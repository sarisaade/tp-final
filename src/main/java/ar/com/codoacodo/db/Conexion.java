package ar.com.codoacodo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/producto";
    private static final String user = "rootroot";
    		
    private static final String pass = "rootroot";
    
    static { //Así no llamamos al controlador una y otra vez. Es más eficiente.
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("Error al cargar controlador.");
            e.printStackTrace();
        }
    }
    
    public Connection conectar () {
        
        Connection conexion = null;
        try {
            
            DriverManager.getConnection(url, user, pass);
            
            System.out.println("Conexión correcta");
            
        } catch (SQLException e) {
            
            System.out.println("Error de conexión");
        }
        return conexion;
        
    }
  
    


}