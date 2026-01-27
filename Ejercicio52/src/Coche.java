public class Coche {

    String modelo;
    int año;
    Motor motor;

    public Coche(String modelo, int año, String tipoMotor) {
        this.modelo = modelo;
        this.año = año;
        this.motor = new Motor(tipoMotor);
    }

    void arrancar() {
        motor.arrancar();
        System.out.println("El " + modelo + " está arrancado");
    }

}