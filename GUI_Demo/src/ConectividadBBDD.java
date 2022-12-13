

import javax.swing.*;
import java.sql.*;
import java.sql.DriverManager;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

public class ConectividadBBDD {

    private static Connection conn = null;
    private static String login = "22_23_DAW_BEV";
    private static String clave = "123456";
    private static String urlIlerna = "jdbc:oracle:thin:@192.168.3.26:1521:XE";
    private static String urlGlobal = "jdbc:oracle:thin:@oracle.ilerna.com:1521:XE";

    public static Connection getConnection() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(urlIlerna, login, clave);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion exitosa");
            } else {
                System.out.println("Conexion fallida");
            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"conexion fallida");
        }
        return conn;
    }

    public void desconexion(){
        try{
            conn.close();

        }catch (Exception e ){
            System.out.println("error al desconectar");
        }
    }


    public PreparedStatement PreparedStatement(String scriptSql) {
//    TODO: hacer algo aqui
        return null;
    }
}