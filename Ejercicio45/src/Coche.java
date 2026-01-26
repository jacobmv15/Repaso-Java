public class Coche {
    
    String marca;
    String modelo;
    int año;
    String color;

    public Coche(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + ", " + this.color + " del " + this.año;
    }
    
}
