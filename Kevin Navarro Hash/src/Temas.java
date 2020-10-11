public class Temas {

    private int idTemas ;
    private String nombre;
    private Categoria supertema;

    public Temas(int idTemas, String nombre, Categoria supertema) {
        this.idTemas = idTemas;
        this.nombre = nombre;
        this.supertema = supertema;
    }

    public int getIdTemas() {
        return idTemas;
    }

    public void setIdTemas(int idTemas) {
        this.idTemas = idTemas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getSupertema() {
        return supertema;
    }

    public void setSupertema(Categoria supertema) {
        this.supertema = supertema;
    }
}
