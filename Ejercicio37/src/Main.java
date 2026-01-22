public class Main {
    public static void main(String[] args) {
        
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Coche coche = new Coche();

        System.out.println(coche.marca);
        System.out.println(coche.modelo);
        System.out.println(coche.año);
        System.out.println(coche.precio);

        System.out.println(coche.estaEncendido);
        coche.arrancar();
        System.out.println(coche.estaEncendido);
        coche.apagar();
        System.out.println(coche.estaEncendido);

        coche.conducir();
        coche.frenar();
    }
}
