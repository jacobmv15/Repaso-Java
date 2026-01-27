public class Libro {
    
    String titulo;
    int paginas;

    Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    String infoLibro() {
        return titulo + " tiene " + paginas + " páginas";
    }
}
