package alphalearn;

public class Alumno {
    private String matricula;
    private String nombre;
    private String carrera;
    private int semestre;
    
    public Alumno(String matricula, String nombre, String carrera, int semestre) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\n" +
               "Nombre: " + nombre + "\n" +
               "Carrera: " + carrera + "\n" +
               "Semestre: " + semestre + "\n\n";
    }
    
    public String getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public String getCarrera() { return carrera; }
    public int getSemestre() { return semestre; }
}