public class Main {
    public static void main(String[] args)  {
        
        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Persona persona = new Persona("Harry", "Potter");
        
        Estudiante estudiante = new Estudiante("Tom", "Riddle", 3.25);

        Empleado empleado = new Empleado("Albus", "Dumbledore", 50000);

        persona.mostrarNombre();

        estudiante.mostrarNombre();
        System.out.println(estudiante.notaMedia);
        estudiante.mostrarMedia();

        empleado.mostrarSalario();
    }
}
