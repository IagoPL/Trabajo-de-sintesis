import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {
    private String mensaje;

    public String add(ConectividadBBDD con, DDBBUsuarios value, String column, String[] tables) {
        PreparedStatement pst = null;

        String scriptSql = "insert into USUARIO (ID_USUARIO, NOMBRE, APELLIDOS, CONTRASENA, EMPRESA, NICK, NIVEL) values (SEQUENCE_USUARIO.nextcal, ?,?,?,?,?,? )";
        scriptSql = scriptSql.concat(" values(SEQUENCE_USUARIO,)");


        try {
            pst = con.PreparedStatement(scriptSql);
            pst.setString(1, value.getNombre());
            pst.setString(2, value.getApellidos());
            pst.setString(3, value.getContrasena());
            pst.setInt(4, value.getEmpresa());
            pst.setString(5, value.getNick());
            pst.setInt(6, value.getNivel());
            mensaje = "guardadp correctamente";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }


        return mensaje;
    }

    public String delete(ConectividadBBDD con, DDBBUsuarios value, String column, String[] tables) {
        PreparedStatement pst = null;

        String startScripSql = "insert into" + column + "(";
        String scriptSql = insert(startScripSql, tables);
        scriptSql = scriptSql.concat(" values(SEQUENCE_USUARIO,)");


        try {
            pst = con.PreparedStatement(scriptSql);
            pst.setString(1, value.getNombre());
            pst.setString(2, value.getApellidos());
            pst.setString(3, value.getContrasena());
            pst.setInt(4, value.getEmpresa());
            pst.setString(5, value.getNick());
            pst.setInt(6, value.getNivel());
            mensaje = "guardado correctamente";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }
        return mensaje;
    }

    public String edit(ConectividadBBDD con, DDBBUsuarios value, String column, String[] tables) {
        PreparedStatement pst = null;

        String startScripSql = "insert into" + column + "(";
        String scriptSql = insert(startScripSql, tables);
        scriptSql = scriptSql.concat(" values(SEQUENCE_USUARIO,)");


        try {
            pst = con.PreparedStatement(scriptSql);
            pst.setString(1, value.getNombre());
            pst.setString(2, value.getApellidos());
            pst.setString(3, value.getContrasena());
            pst.setInt(4, value.getEmpresa());
            pst.setString(5, value.getNick());
            pst.setInt(6, value.getNivel());
            mensaje = "guardadp correctamente";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }
        return mensaje;
    }

    public void show(String column, String[] tables) {

    }

    public String insert(String str, String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                str = str.concat(array[i] + ",");
            } else {
                str = str.concat(array[i] + ")");
            }
        }
        return str;
    }
}
