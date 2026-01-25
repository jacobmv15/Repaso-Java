public class Main {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Mustang", "Rojo");
        Coche coche2 = new Coche("Cybertruck", "Gris");
        Coche coche3 = new Coche("Pick-up", "Negra");

        Coche[] coches = {coche1, coche2, coche3, new Coche("Bugatti", "Verde")};

        for (Coche coche : coches) {
            coche.conducir();
        }
    }
}
