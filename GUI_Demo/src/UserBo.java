public class UserBo {

    private String mensaje;
    private UserCrud UserCrud = new UserCrud();

    public String add(DDBBUsuarios value) {

        ConectividadBBDD conn = (ConectividadBBDD) ConectividadBBDD.getConnection();
        try {
            mensaje = UserCrud.add(conn, value);

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
        ConectividadBBDD conn = (ConectividadBBDD) ConectividadBBDD.getConnection();
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

        return mensaje;
    }

    public String edit(DDBBUsuarios value)  {
        ConectividadBBDD conn = (ConectividadBBDD) ConectividadBBDD.getConnection();
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

        return mensaje;
    }

    public void show(String column) {

    }
}
