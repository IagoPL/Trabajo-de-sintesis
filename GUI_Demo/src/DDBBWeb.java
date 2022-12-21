public class DDBBWeb {

    private int idAnuncio;
    private String webURL;

    public DDBBWeb() {
    }

    public DDBBWeb(int idAnuncio, String webURL) {
        this.idAnuncio = idAnuncio;
        this.webURL = webURL;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }
}
