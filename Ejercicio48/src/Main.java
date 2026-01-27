public class Main {
    public static void main(String[] args)  {
        
        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass.

        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        Barca barca = new Barca();

        //coche.conducir();
        //bicicleta.conducir();
        //barca.conducir();

        Vehiculo[] vehiculos = {coche, bicicleta, barca};

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.conducir();
        }
    }
}
