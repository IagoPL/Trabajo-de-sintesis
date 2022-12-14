public class DDBBEmpresas {

    private String logo;
    private String correo;
    private String nombreEmpresa;
    private String cuentaBancaria;

    private int telefono;
    private int idEmpresa;

    public DDBBEmpresas(){

    }

    public DDBBEmpresas(String logo, String correo, String nombreEmpresa, String cuentaBancaria, int telefono, int idEmpresa) {
        this.logo = logo;
        this.correo = correo;
        this.nombreEmpresa = nombreEmpresa;
        this.cuentaBancaria = cuentaBancaria;
        this.telefono = telefono;
        this.idEmpresa = idEmpresa;

    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
