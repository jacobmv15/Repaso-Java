public class Coche {

    String modelo;
    String color;

    public Coche(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    void conducir() {
        System.out.println("Estás conduciendo un " + modelo + " de color " + color);
    }

}
