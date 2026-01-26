public class Empleado extends Persona{
    
    int salario;

    Empleado(String nombre, String primerApellido, int salario) {
        super(nombre, primerApellido);
        this.salario = salario;
    }

    void mostrarSalario() {
        System.out.println("El salario de " + this.nombre + " es $" + this.salario);
    }
}
