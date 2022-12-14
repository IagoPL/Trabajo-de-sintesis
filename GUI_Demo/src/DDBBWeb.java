public class DDBBWeb {

    private int idAnuncio;
    private int webURL;

    public DDBBWeb() {
    }

    public DDBBWeb(int idAnuncio, int webURL) {
        this.idAnuncio = idAnuncio;
        this.webURL = webURL;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public int getWebURL() {
        return webURL;
    }

    public void setWebURL(int webURL) {
        this.webURL = webURL;
    }
}
