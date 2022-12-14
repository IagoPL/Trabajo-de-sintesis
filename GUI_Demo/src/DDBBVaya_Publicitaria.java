public class DDBBVaya_Publicitaria {

    private int idAnuncio;
    private int idVaya;

    public DDBBVaya_Publicitaria() {
    }

    public DDBBVaya_Publicitaria(int idAnuncio, int idVaya) {
        this.idAnuncio = idAnuncio;
        this.idVaya = idVaya;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public int getIdVaya() {
        return idVaya;
    }

    public void setIdVaya(int idVaya) {
        this.idVaya = idVaya;
    }
}
