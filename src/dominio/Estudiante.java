
package dominio;

public class Estudiante {
    private String nombre;
    private String edad;
    private String repetidorMateria;
    private int promedio;
    private Materia materia;

    public Estudiante(String nombre, String edad, String repetidorMateria, int promedio, Materia materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.repetidorMateria = repetidorMateria;
        this.promedio = promedio;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRepetidorMateria() {
        return repetidorMateria;
    }

    public void setRepetidorMateria(String repetidorMateria) {
        this.repetidorMateria = repetidorMateria;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", repetidorMateria=" + repetidorMateria + ", promedio=" + promedio + ", materia=" + materia + '}';
    }
    
    
}
