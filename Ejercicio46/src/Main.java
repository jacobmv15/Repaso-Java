public class Main {
    public static void main(String[] args) {
        
        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(4, 5);
        Rectangulo rectangulo = new Rectangulo(6, 7);

        System.out.println(circulo.area());
        System.out.println(triangulo.area());
        System.out.println(rectangulo.area());
    }
}
