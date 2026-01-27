public class Libreria {
    
    String nombre;
    int año;
    Libro[] libros;

    public Libreria(String nombre, int año, Libro[] libros) {
        this.nombre = nombre;
        this.año = año;
        this.libros = libros;
    }

    void mostrarInfoLibreria() {
        System.out.println("La librería " + nombre + " fue fundada en " + año);
        System.out.println("Libros disponibles: ");

        for (Libro libro : libros) {
            System.out.println(libro.infoLibro());
        }
    }
}
