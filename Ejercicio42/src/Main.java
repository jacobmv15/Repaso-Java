public class Main {
    public static void main(String[] args)  {
        
        // Inheritance = One class inherits the attributes and methods from another class.
        //               Child <- Parent <- Grandparent

        Perro perro = new Perro();
        Gato gato = new Gato();
        Planta planta = new Planta();

        System.out.println(perro.estaVivo);
        System.out.println(gato.estaVivo);

        perro.comer();
        gato.comer();

        System.out.println(perro.vidas);
        System.out.println(gato.vidas);

        perro.hablar();
        gato.hablar();

        System.out.println(planta.estaVivo);
        planta.fotosintesis();
    }
}
