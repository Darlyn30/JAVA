import java.sql.*;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Connection conexion = ConexionDB.conectar();
        if(conexion != null){
            try {
                PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM pruebaInfo");
                ResultSet resultado = consulta.executeQuery();
                while(resultado.next()){
    
                }
                consulta.close();
                conexion.close();
            } catch(SQLException exception){
                JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta " + exception.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null,"no se pudo establecer la conexion");
        }
    }
}
