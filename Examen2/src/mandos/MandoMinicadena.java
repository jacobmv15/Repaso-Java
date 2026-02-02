package mandos;

/**
 * Mando para minicadenas
 */
public class MandoMinicadena extends Mando implements ControlVolumen {

    private int volumen;

    public MandoMinicadena(String modelo, double anchura, double altura, double precio) {
        super(modelo, anchura, altura, precio);
        volumen = 20;
    }

    @Override
    public void subirVolumen() {
        volumen += 10;
    }

    @Override
    public void bajarVolumen() {
        volumen -= 10;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Volumen: " + volumen;
    }
}
