public class Main {
    public static void main(String[] args) {
        
        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Estudiante estudiante1 = new Estudiante("Bob Esponja", 30, 3.2);
        Estudiante estudiante2 = new Estudiante("Patricio Estrella", 34, 1.5);
        Estudiante estudiante3 = new Estudiante("Juan", 27, 4.0);

        System.out.println(estudiante1.nombre);
        System.out.println(estudiante1.edad);
        System.out.println(estudiante1.notaMedia);
        System.out.println(estudiante1.estaMatriculado);

        System.out.println(estudiante2.nombre);
        System.out.println(estudiante2.edad);
        System.out.println(estudiante2.notaMedia);
        System.out.println(estudiante2.estaMatriculado);

        System.out.println(estudiante3.nombre);
        System.out.println(estudiante3.edad);
        System.out.println(estudiante3.notaMedia);
        System.out.println(estudiante3.estaMatriculado);

        estudiante1.estudiar();
        estudiante2.estudiar();
        estudiante3.estudiar();
    }
}
