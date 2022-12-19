import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {
    private String mensaje;

    public String add(ConectividadBBDD con, DDBBUsuarios value) {
        PreparedStatement pst = null;

        String scriptSql = "insert into USUARIO " +
                "(ID_USUARIO, NOMBRE, APELLIDOS, CONTRASENA, EMPRESA, NICK, NIVEL)" +
                " values (SEQUENCE_USUARIO.nextcal, ?,?,?,?,?,? )";


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

    public String delete(ConectividadBBDD con, DDBBUsuarios value) {
        PreparedStatement pst = null;

        String scriptSql = "delete from USUARIO where USUARIO = ?";


        try {
            pst = con.PreparedStatement(scriptSql);

            pst.setInt(1,value.getId_usuario());


            mensaje = "borrado correctamente";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }
        return mensaje;
    }

    public String edit(ConectividadBBDD con, DDBBUsuarios value, String column, String[] tables) {
        PreparedStatement pst = null;

        String scriptSql = "update USUARIO set NOMBRE = ?, " +
                "APELLIDOS = ?, CONTRASENA = ?, EMPRESA = ?, NICK = ?, NIVEL = ? where ID_USUARIO = ?";


        try {
            pst = con.PreparedStatement(scriptSql);

            pst.setString(1, value.getNombre());
            pst.setString(2, value.getApellidos());
            pst.setString(3, value.getContrasena());
            pst.setInt(4, value.getEmpresa());
            pst.setString(5, value.getNick());
            pst.setInt(6, value.getNivel());
            pst.setInt(7,value.getId_usuario());

            mensaje = "actualizado correctamente";
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }
        return mensaje;
    }

    //    ajustar para mostrar
    public void show(String column, String[] tables){

    }
}
