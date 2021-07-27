
package dominio;

public class Materia {
    private String nombre;
    private int nroAlumnos;
    private Profesor profesor;

    public Materia(String nombre, int nroAlumnos, Profesor profesor) {
        this.nombre = nombre;
        this.nroAlumnos = nroAlumnos;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroAlumnos() {
        return nroAlumnos;
    }

    public void setNroAlumnos(int nroAlumnos) {
        this.nroAlumnos = nroAlumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre=" + nombre + ", nroAlumnos=" + nroAlumnos + ", profesor=" + profesor + '}';
    }
    
    
}
