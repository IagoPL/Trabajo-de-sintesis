import java.util.Date;

public class DDBBAnuncios {

    private int idAnuncio;
    private String tituloAnuncio;
    private Date caducidad;
    private Date inicio;
    private int precioAnuncio;
    private int formatoAnuncio;
    private int pagado;

    public DDBBAnuncios() {
    }

    public DDBBAnuncios(int idAnuncio, String tituloAnuncio, Date caducidad, Date inicio, int precioAnuncio, int formatoAnuncio, int pagado) {
        this.idAnuncio = idAnuncio;
        this.tituloAnuncio = tituloAnuncio;
        this.caducidad = caducidad;
        this.inicio = inicio;
        this.precioAnuncio = precioAnuncio;
        this.formatoAnuncio = formatoAnuncio;
        this.pagado = pagado;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getTituloAnuncio() {
        return tituloAnuncio;
    }

    public void setTituloAnuncio(String tituloAnuncio) {
        this.tituloAnuncio = tituloAnuncio;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public int getPrecioAnuncio() {
        return precioAnuncio;
    }

    public void setPrecioAnuncio(int precioAnuncio) {
        this.precioAnuncio = precioAnuncio;
    }

    public int getFormatoAnuncio() {
        return formatoAnuncio;
    }

    public void setFormatoAnuncio(int formatoAnuncio) {
        this.formatoAnuncio = formatoAnuncio;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }
}
