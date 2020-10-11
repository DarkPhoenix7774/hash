import java.util.Date;

public class Documento {
    private int idDocumento;
    private int numRegistro;
    private String titulo;
    private String url;
    private long tamaño;
    private Date fechaActualizacion;
    private String checksums;

    public Documento(int idDocumento, int numRegistro, String titulo, String url, long tamaño, Date fechaActualizacion, String checksums) {
        this.setIdDocumento(idDocumento);
        this.setNumRegistro(numRegistro);
        this.setTitulo(titulo);
        this.setUrl(url);
        this.setTamaño(tamaño);
        this.setFechaActualizacion(fechaActualizacion);
        this.setChecksums(checksums);
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getChecksums() {
        return checksums;
    }

    public void setChecksums(String checksums) {
        this.checksums = checksums;
    }
}

