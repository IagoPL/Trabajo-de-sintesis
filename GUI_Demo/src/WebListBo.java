public class WebListBo {

    private String mensaje;
    private WebListCrud WebListCrud = new WebListCrud();

    public String add(WebListCrud value) {

        ConectividadBBDD conn = new ConectividadBBDD();
        conn.getConnection();
        try {
            mensaje = WebListCrud.add(conn, value);

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
//            TODO:revisar esto    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }


        }

        return mensaje;
    }

    public String delete(int id) {
        /*ConectividadBBDD conn = (ConectividadBBDD) ConectividadBBDD.getConnection();
        try {
            mensaje = UserCrud.delete(conn, id);

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
//            TODO:revisar esto    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }


        }

        return mensaje;*/
        return null;
    }

    public String edit(DDBBUsuarios value)  {
        /*ConectividadBBDD conn = (ConectividadBBDD) ConectividadBBDD.getConnection();
        try {
            mensaje = UserCrud.edit(conn, value);

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        } finally {
            try {
                if (conn != null) {
//            TODO:revisar esto    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }


        }

        return mensaje;*/
        return  null;
    }

    public void show(String column) {

    }
}
