public enum Dia {
    
    LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);

    private final int NUMERO_DIA;

    Dia(int NUMERO_DIA) {
        this.NUMERO_DIA = NUMERO_DIA;
    }

    public int getNumeroDia() {
        return NUMERO_DIA;
    }
}