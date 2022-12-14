public class DDBBFlyer {


    private int cp;
    private int idAnuncio;
    private int cantidadFlyers;
    private int idFlyer;
    private int color;

    public DDBBFlyer() {
    }

    public DDBBFlyer(int cp, int idAnuncio, int cantidadFlyers, int idFlyer, int color) {
        this.cp = cp;
        this.idAnuncio = idAnuncio;
        this.cantidadFlyers = cantidadFlyers;
        this.idFlyer = idFlyer;
        this.color = color;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public int getCantidadFlyers() {
        return cantidadFlyers;
    }

    public void setCantidadFlyers(int cantidadFlyers) {
        this.cantidadFlyers = cantidadFlyers;
    }

    public int getIdFlyer() {
        return idFlyer;
    }

    public void setIdFlyer(int idFlyer) {
        this.idFlyer = idFlyer;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
