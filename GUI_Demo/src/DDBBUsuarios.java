public class DDBBUsuarios {

    private String nombre;
    private String apellidos;
    private String contrasena;
    private String nick;

    private int nivel;
    private int empresa;
    private int id_usuario;

    public DDBBUsuarios(){

    }

    public DDBBUsuarios(String nombre, String apellidos, String contrasena, String nick, int nivel, int empresa, int id_usuario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.nick = nick;
        this.nivel = nivel;
        this.empresa = empresa;
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEmpresa() {
        return empresa;
    }

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "DDBBUsuarios{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", nick='" + nick + '\'' +
                ", nivel=" + nivel +
                ", empresa=" + empresa +
                ", id_usuario=" + id_usuario +
                '}';
    }
}
