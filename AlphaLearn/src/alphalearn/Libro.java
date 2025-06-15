package alphalearn;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;
    
    public Libro(String isbn, String titulo, String autor, boolean disponible) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
    
    @Override
    public String toString() {
        return "ISBN: " + isbn + "\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Disponible: " + (disponible ? "Sí" : "No") + "\n\n";
    }
    
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isDisponible() { return disponible; }
}