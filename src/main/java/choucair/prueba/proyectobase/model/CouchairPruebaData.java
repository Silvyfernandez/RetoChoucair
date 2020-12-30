package choucair.prueba.proyectobase.model;

public class CouchairPruebaData {

    private String nombre;
    private String apellido;
    private String email;
    private String mes_Cumpleanio;
    private String dia_cumpleanio;
    private String anio_cumpleanio;
    private String ciudad;
    private String codigo_postal;
    private String pais;


    public CouchairPruebaData(String nombre, String apellido, String email, String mes_Cumpleanio, String dia_cumpleanio, String anio_cumpleanio, String ciudad,String codigo_postal,String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.mes_Cumpleanio=mes_Cumpleanio;
        this.dia_cumpleanio = dia_cumpleanio;
        this.anio_cumpleanio = anio_cumpleanio;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getMes_Cumpleanio() {
        return mes_Cumpleanio;
    }

    public String getDia_cumpleanio() {
        return dia_cumpleanio;
    }

    public String getAnio_cumpleanio() {
        return anio_cumpleanio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMes_Cumpleanio(String mes_Cumpleanio) {
        this.mes_Cumpleanio = mes_Cumpleanio;
    }

    public void setDia_cumpleanio(String dia_cumpleanio) {
        this.dia_cumpleanio = dia_cumpleanio;
    }

    public void setAnio_cumpleanio(String anio_cumpleanio) {
        this.anio_cumpleanio = anio_cumpleanio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
