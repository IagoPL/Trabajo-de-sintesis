public class DDBBMensajeria {

    private int idMensaje;
    private String tituloMensaje;
    private int idRemitente;
    private String textoMensaje;

    public DDBBMensajeria() {
    }

    public DDBBMensajeria(int idMensaje, String tituloMensaje, int idRemitente, String textoMensaje) {
        this.idMensaje = idMensaje;
        this.tituloMensaje = tituloMensaje;
        this.idRemitente = idRemitente;
        this.textoMensaje = textoMensaje;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getTituloMensaje() {
        return tituloMensaje;
    }

    public void setTituloMensaje(String tituloMensaje) {
        this.tituloMensaje = tituloMensaje;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public String getTextoMensaje() {
        return textoMensaje;
    }

    public void setTextoMensaje(String textoMensaje) {
        this.textoMensaje = textoMensaje;
    }
}
