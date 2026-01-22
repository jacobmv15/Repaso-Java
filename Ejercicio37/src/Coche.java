public class Coche {
    
    String marca = "Ford";
    String modelo = "Mustang";
    int año = 2025;
    double precio = 58000.99;
    boolean estaEncendido = false;

    void arrancar() {
        estaEncendido = true;
        System.out.println("Has arrancado el motor");
    }

    void apagar() {
        estaEncendido = false;
        System.out.println("Has apagado el motor");
    }

    void conducir() {
        System.out.println("Estás conduciendo un " + modelo);
    }

    void frenar() {
        System.out.println("Has frenado el " + modelo);
    }
}
