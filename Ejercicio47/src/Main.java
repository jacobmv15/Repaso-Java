public class Main {
    public static void main(String[] args) {
        
        // Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
        //             Supports multiple inheritance-like behavior.

        Conejo conejo = new Conejo();
        Aguila aguila = new Aguila();
        Pescado pescado = new Pescado();

        conejo.huir();
        aguila.cazar();
        pescado.cazar();
        pescado.huir();
    }
}
