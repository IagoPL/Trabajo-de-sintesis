public class bo {

    private String mensaje;
    private Crud UserCrud = new Crud();

    public String add(DDBBUsuarios value) {

        ConectividadBBDD conn = (ConectividadBBDD) ConectividadBBDD.getConnection();
        try {
            mensaje = UserCrud.add(conn, value);

        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally {
            if (conn != null){

            }
        }

        return mensaje;
    }

    public String delete(DDBBUsuarios value, String column) {
        return mensaje;
    }

    public String edit(int id, String column) {
        return mensaje;
    }

    public void show(String column) {

    }
}
