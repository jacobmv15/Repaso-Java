public class Main {

    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Libro libro1 = new Libro("The Fellow of the Ring", 423);
        Libro libro2 = new Libro("The Two Towers", 352);
        Libro libro3 = new Libro("The Return of the King", 416);

        Libro[] libros = {libro1, libro2, libro3};

        /*for (Libro libro : libros) {
            System.out.println(libro.infoLibro());
        }*/

        Libreria libreria = new Libreria("PS libreria", 2010, libros);
        libreria.mostrarInfoLibreria();
    }
}
