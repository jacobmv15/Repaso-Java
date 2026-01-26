public class Main {
    public static void main(String[] args)  {
        
        // .toString() = Method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Coche coche1 = new Coche("Ford", "Mustang", 2025, "Rojo");
        Coche coche2 = new Coche("Chevrolet", "Corvette", 2026, "Azul");

        System.out.println(coche1);
        System.out.println(coche2);
    }
}
