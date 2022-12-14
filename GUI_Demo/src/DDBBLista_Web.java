public class DDBBLista_Web {

    private String webURL;
    private int numeroDeAnuncios;
    private int tamañoDeLosAnuncios;

    public DDBBLista_Web() {
    }

    public DDBBLista_Web(String webURL, int numeroDeAnuncios, int tamañoDeLosAnuncios) {
        this.webURL = webURL;
        this.numeroDeAnuncios = numeroDeAnuncios;
        this.tamañoDeLosAnuncios = tamañoDeLosAnuncios;
    }

    public String getWebURL() {
        return webURL;
    }

    public void setWebURL(String webURL) {
        this.webURL = webURL;
    }

    public int getNumeroDeAnuncios() {
        return numeroDeAnuncios;
    }

    public void setNumeroDeAnuncios(int numeroDeAnuncios) {
        this.numeroDeAnuncios = numeroDeAnuncios;
    }

    public int getTamañoDeLosAnuncios() {
        return tamañoDeLosAnuncios;
    }

    public void setTamañoDeLosAnuncios(int tamañoDeLosAnuncios) {
        this.tamañoDeLosAnuncios = tamañoDeLosAnuncios;
    }
}
