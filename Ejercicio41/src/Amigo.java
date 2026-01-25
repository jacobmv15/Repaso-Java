public class Amigo {
    
    static int numeroDeAmigos = 0;
    String nombre;

    public Amigo(String nombre) {
        this.nombre = nombre;
        numeroDeAmigos ++;
    }

    static void mostrarNumeroDeAmigos() {
        System.out.println("Tienes un total de " + numeroDeAmigos + " amigos");
    }
    
}
