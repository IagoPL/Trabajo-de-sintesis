import java.sql.SQLException;
import java.sql.Statement;

public class FlayerCrud {
    private String mensaje;

    public String add(ConectividadBBDD con, DDBBFlyer value) {

        String scriptSql = "insert into FLAYER " +
                "(CP, ID_ANUNCIO, CANTIDAD, ID_FLAYER, COLOR)" +
                " values ('value.getCp()' " + ",  + SEQUENCE_ID_ANUNCIO.nextval " + ", " + value.getColor() +" )";
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

    public String delete(ConectividadBBDD con, DDBBFlyer value) {


        String scriptSql = "delete from USUARIO where USUARIO = value.setIdAnuncio()";

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

    public String edit(ConectividadBBDD con, DDBBFlyer value) {


        String scriptSql = "update USUARIO  set cp = '" +  value.getCp()  +"', cantidad = '" +  value.getCantidadFlyers()  +"', idAnuncio = " + value.getIdAnuncio() + ")" ;

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
