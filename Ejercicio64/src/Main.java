public class Main {
    public static void main(String[] args) {

        // Generics = A concept where you can write a class, interface, or method
        // that is compatible with different data types.
        // <T> type parameter (placeholder that gets replaced with a real type)
        // <String> type argument (specifies the type)

        Caja<Double> caja = new Caja<>();

        caja.setObjeto(5.13);

        System.out.println(caja.getObjeto());

        Producto<String, Double> producto1 = new Producto<>("Manzana", 0.5);
        Producto<String, Integer> producto2 = new Producto<>("Entrada", 5);


        System.out.println(producto1.getPrecio());
        System.out.println(producto2.getPrecio());
    }
}
