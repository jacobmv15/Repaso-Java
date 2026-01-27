public class Main {
    public static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Coche coche = new Coche("Charger", "Negro", 10000);

        // coche.modelo = "Corvette";

        coche.setColor("Azul");
        coche.setPrecio(-1);

        System.out.println(coche.getModelo() + " " + coche.getColor() + " " + coche.getPrecio());
    }
}
