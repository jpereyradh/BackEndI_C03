package presencial;

import java.util.Date;

public class Persona {
    private String nombre;
    private int cedula;
    private Date fechavacuna;
    private String nombreVacuna;

    public Persona(String nombreVacuna, Date fechavacuna, int cedula, String nombre) {
        this.nombreVacuna = nombreVacuna;
        this.fechavacuna = fechavacuna;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Date getFechavacuna() {
        return fechavacuna;
    }

    public void setFechavacuna(Date fechavacuna) {
        this.fechavacuna = fechavacuna;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }
}
