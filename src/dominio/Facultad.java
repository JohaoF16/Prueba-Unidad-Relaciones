
package dominio;

public class Facultad {
    private String nombre;
    private Universidad universidad;

    public Facultad(String nombre, Universidad universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Facultad{" + "nombre=" + nombre + ", universidad=" + universidad + '}';
    }
    
    
}
