public class Motor {

    String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    void arrancar() {
        System.out.println("Has arrancado el motor " + tipo);
    }
    
}
