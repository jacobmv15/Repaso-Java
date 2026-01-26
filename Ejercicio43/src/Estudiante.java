public class Estudiante extends Persona {
    
    double notaMedia;

    public Estudiante(String nombre, String primerApellido, double notaMedia) {
        super(nombre, primerApellido);
        this.notaMedia = notaMedia;
    }

    void mostrarMedia() {
        System.out.println("La nota media de " + this.nombre + " es: " + this.notaMedia);
    }
}
