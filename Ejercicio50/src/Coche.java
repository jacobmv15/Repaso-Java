public class Coche {
    
    private String modelo;
    private String color;
    private int precio;

    public Coche(String modelo, String color, int precio) {
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return "$" + precio;
    }

    public void setPrecio(int precio) {
        if (precio < 0) {
            System.out.println("El precio no puede ser menor que 0");
        } else {
            this.precio = precio;
        }
    }

}
