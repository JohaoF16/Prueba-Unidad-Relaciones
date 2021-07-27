
package dominio;

public class Profesor {
    private String nombre;
    private int edad;
    private String antiguedad;
    private Facultad facultad;

    public Profesor(String nombre, int edad, String antiguedad, Facultad facultad) {
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + ", antiguedad=" + antiguedad + ", facultad=" + facultad + '}';
    }
    
}
