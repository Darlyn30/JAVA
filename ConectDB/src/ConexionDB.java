import java.sql.*;

import javax.swing.JOptionPane;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/prueba";
    private static final String USER = "NAYELYPC";
    private static final String PASS = "";

    public static Connection conectar(){
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException exception) {
            JOptionPane.showMessageDialog(null,"Error al conectar la base de datos");
            return null;
        }
    }
}