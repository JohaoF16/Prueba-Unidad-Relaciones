
package dominio;

public class Director {
    private String nombre;
    private String cargo;
    private Facultad facultad;

    public Director(String nombre, String cargo, Facultad facultad) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", cargo=" + cargo + ", facultad=" + facultad + '}';
    }
    
}
