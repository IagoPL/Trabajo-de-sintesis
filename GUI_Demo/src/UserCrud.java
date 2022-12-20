import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserCrud {
    private String mensaje;

    public String add(ConectividadBBDD con, DDBBUsuarios value) {

        String scriptSql = "insert into USUARIO " +
                "(ID_USUARIO, NOMBRE, APELLIDOS, CONTRASENA, EMPRESA, NICK, NIVEL)" +
                " values (SEQUENCE_USUARIO.nextval,'" + value.getNombre() + "', '" + value.getApellidos() + "', '" + value.getContrasena() + "' , " + value.getEmpresa() + ", '" + value.getNick() + "', " + value.getNivel() + ")";
        System.out.println(scriptSql);

        try {
            Statement pst = con.getConn().createStatement();
            mensaje = "guardadp correctamente";
            pst.execute(scriptSql);
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }


        return mensaje;
    }

    public String delete(ConectividadBBDD con, DDBBUsuarios value) {


        String scriptSql = "delete from USUARIO where USUARIO = value.getID()";

        System.out.println(scriptSql);

        try {
            Statement pst = con.getConn().createStatement();
            mensaje = "borrado correctamente";
            pst.execute(scriptSql);
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }


        return mensaje;
    }

    public String edit(ConectividadBBDD con, DDBBUsuarios value) {


        String scriptSql = "update USUARIO  set NOMBRE = '" +  value.getNombre()  +"', APELLIDOS = '" +  value.getNombre()  +"', CONTRASENA = '" +  value.getNombre()  +"', EMPRESA = '" +  value.getNombre() +"', NICK = '" +  value.getNombre() +"', NIVEL = '" +  value.getNombre()+ "')"  ;

        System.out.println(scriptSql);

        try {
            Statement pst = con.getConn().createStatement();
            mensaje = "borrado correctamente";
            pst.execute(scriptSql);
            pst.close();

        } catch (SQLException e) {
            mensaje = "Se produjo un error: " + e.getMessage();
        }


        return mensaje;
    }


    public void show(String column, String[] tables) {

    }
}
