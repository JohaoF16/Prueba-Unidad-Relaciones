
package dominio;

public class Carrera {
    private String nombre;
    private int cupos;
    private Facultad facultad;

    public Carrera(String nombre, int cupos, Facultad facultad) {
        this.nombre = nombre;
        this.cupos = cupos;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", cupos=" + cupos + ", facultad=" + facultad + '}';
    }
    
}
