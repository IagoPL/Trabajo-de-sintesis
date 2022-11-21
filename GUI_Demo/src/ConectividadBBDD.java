

import java.sql.*;
import java.sql.DriverManager;
import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;

public class ConectividadBBDD {

    public ConectividadBBDD() {
    }
    public Statement conn(){
        try{
            DriverManager.registerDriver(new OracleDriver());
            System.out.println("Conectando con la base de datos...");
            Connection connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@192.168.3.26:1521:XE", "22_23_DAW_BEV","123456");
            Statement statement = connection.createStatement();
            return statement;
        }catch(Exception e){
            System.out.println("The exception raised is:" + e);
            return null;
        }
    }
    public LinkedList<String> query (String from){
        try{
            Statement st = conn();
            ResultSet resultSet = st.executeQuery(from);

            LinkedList<String> result = new LinkedList();
            while(resultSet.next()){
                for(int i=1;i< resultSet.getMetaData().getColumnCount(); i++){
                    result.add(resultSet.getString(i));
                }
            }
            return result;
        }catch (Exception e){
            return null;
        }
    }

    private class OracleDriver implements Driver {
        @Override
        public Connection connect(String url, Properties info) throws SQLException {
            return null;
        }

        @Override
        public boolean acceptsURL(String url) throws SQLException {
            return false;
        }

        @Override
        public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
            return new DriverPropertyInfo[0];
        }

        @Override
        public int getMajorVersion() {
            return 0;
        }

        @Override
        public int getMinorVersion() {
            return 0;
        }

        @Override
        public boolean jdbcCompliant() {
            return false;
        }

        @Override
        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }
    }
}