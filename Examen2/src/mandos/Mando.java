package mandos;

/**
 * Clase base para todos los mandos a distancia
 */
public class Mando implements Comparable<Mando> {

    protected String modelo;
    protected double anchura;
    protected double altura;
    protected double precio;
    protected boolean encendido;

    public Mando(String modelo, double anchura, double altura, double precio) {
        this.modelo = modelo;
        this.anchura = anchura;
        this.altura = altura;
        this.precio = precio;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Mando) {
            Mando otro = (Mando) obj;
            return this.modelo.equals(otro.modelo);
        }
        return false;
    }

    @Override
    public int compareTo(Mando o) {
        return this.modelo.compareTo(o.modelo);
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
               ", Anchura: " + anchura +
               ", Altura: " + altura +
               ", Precio: " + precio +
               ", Encendido: " + encendido;
    }
}
