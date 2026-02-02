package mandos;

/**
 * Mando para aspiradoras
 */
public class MandoAspiradora extends Mando implements ControlVelocidad {

    private int velocidad;

    public MandoAspiradora(String modelo, double anchura, double altura, double precio) {
        super(modelo, anchura, altura, precio);
        velocidad = 0;
    }

    @Override
    public void subirVelocidad() {
        if (velocidad < 3) {
            velocidad++;
        }
    }

    @Override
    public void bajarVelocidad() {
        if (velocidad > 0) {
            velocidad--;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Velocidad: " + velocidad;
    }
}
