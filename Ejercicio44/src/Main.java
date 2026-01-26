public class Main {
    public static void main(String[] args)  {
        
        // Method overriding = When a subclass provides its own implementation of a method that is already defined.
        //                     Allows for code reusability and give specific implementations.

        Perro perro = new Perro();
        Gato gato = new Gato();
        Pescado pescado = new Pescado();

        perro.moverse();
        gato.moverse();
        pescado.moverse();
    }
}
