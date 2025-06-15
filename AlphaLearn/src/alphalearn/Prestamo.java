package alphalearn;

public class Prestamo {
    private String idPrestamo;
    private String matriculaAlumno;
    private String isbnLibro;
    private String fecha;
    
    public Prestamo(String idPrestamo, String matriculaAlumno, String isbnLibro, String fecha) {
        this.idPrestamo = idPrestamo;
        this.matriculaAlumno = matriculaAlumno;
        this.isbnLibro = isbnLibro;
        this.fecha = fecha;
    }
    
    @Override
    public String toString() {
        return "ID Préstamo: " + idPrestamo + "\n" +
               "Matrícula Alumno: " + matriculaAlumno + "\n" +
               "ISBN Libro: " + isbnLibro + "\n" +
               "Fecha: " + fecha + "\n\n";
    }
    
    public String getIdPrestamo() { return idPrestamo; }
    public String getMatriculaAlumno() { return matriculaAlumno; }
    public String getIsbnLibro() { return isbnLibro; }
    public String getFecha() { return fecha; }
}