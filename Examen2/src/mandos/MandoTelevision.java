package mandos;

/**
 * Mando para televisiones
 */
public class MandoTelevision extends Mando implements ControlVolumen {

    private int canal;
    private int volumen;

    public MandoTelevision(String modelo, double anchura, double altura, double precio) {
        super(modelo, anchura, altura, precio);
        canal = 1;
        volumen = 10;
    }

    public void cambiarCanal() {
        canal++;
    }

    @Override
    public void subirVolumen() {
        volumen += 5;
    }

    @Override
    public void bajarVolumen() {
        volumen -= 5;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Canal: " + canal +
                ", Volumen: " + volumen;
    }
}
