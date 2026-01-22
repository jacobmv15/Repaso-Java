public class Estudiante {
    
    String nombre;
    int edad;
    double notaMedia;
    boolean estaMatriculado;

    Estudiante(String nombre, int edad, double notaMedia) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.estaMatriculado = true;
    }

    void estudiar() {
        System.out.println(this.nombre + " está estudiando");
    }
}
