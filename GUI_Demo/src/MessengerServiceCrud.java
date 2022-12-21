import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MessengerServiceCrud {
    private String mensaje;

    public String add(ConectividadBBDD con, DDBBMensajeria value) {

        String scriptSql = "insert into MENSAJERIA " +
                "(URL, NUMERO_ANUNCIOS, TAMANO_DE_LOS_ANUNCIOS)" +
                " values (SEQUENCE_MENSAJERIA.nextval,'" + value.getTextoMensaje() + "'," + value.getIdRemitente() + ", '" + value.getTextoMensaje() + "')";
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

    public String delete(ConectividadBBDD con, DDBBMensajeria value) {


        String scriptSql = "delete from LISTA_WEB where LISTA_WEB = value.getIdMensaje()";

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

    public String edit(ConectividadBBDD con, DDBBLista_Web value) {


        String scriptSql = "update LISTA_WEBv  set URL = '" + value.getWebURL() + "', NUMERO_ANUNCIOS = " + value.getNumeroDeAnuncios() + ", TAMANO_DE_LOS_ANUNCIOS = " + value.getTamañoDeLosAnuncios() + ")";

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
