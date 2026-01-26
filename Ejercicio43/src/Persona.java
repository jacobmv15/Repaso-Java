public class Persona {
    
    String nombre;
    String primerApellido;

    public Persona(String nombre, String primerApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
    }
    
    void mostrarNombre() {
        System.out.println(this.nombre + " " + this.primerApellido);
    }
}
