public class Main {
    public static void main(String[] args)  {
        
        // static = Makes a variable or method belong to the class
        //          rather than to any specific object.
        //          Commonly used for utility methods or shared resources.

        Amigo amigo1 = new Amigo("Jesus");
        Amigo amigo2 = new Amigo("Jose");
        Amigo amigo3 = new Amigo("Antonio");
        Amigo amigo4 = new Amigo("Ana");
        Amigo amigo5 = new Amigo("Juana");

        Amigo.mostrarNumeroDeAmigos();

        //Método estático
        Math.round(3.99);
    }
}
