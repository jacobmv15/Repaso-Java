package mandos;

/**
 * Mando para aire acondicionado
 */
public class MandoAireAcondicionado extends Mando implements ControlVelocidad {

    public enum Modo { FRIO, CALOR }

    private Modo modo;
    private int temperatura;
    private int velocidad;

    public MandoAireAcondicionado(String modelo, double anchura, double altura, double precio) {
        super(modelo, anchura, altura, precio);
        modo = Modo.FRIO;
        temperatura = 22;
        velocidad = 0;
    }

    public void cambiarModo() {
        if (modo == Modo.FRIO) {
            modo = Modo.CALOR;
        } else {
            modo = Modo.FRIO;
        }
    }

    public void cambiarTemperatura() {
        temperatura++;
    }

    @Override
    public void subirVelocidad() {
        if (velocidad < 5) {
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
               ", Modo: " + modo +
               ", Temperatura: " + temperatura +
               ", Velocidad: " + velocidad;
    }
}
