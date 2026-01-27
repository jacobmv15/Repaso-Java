public class Pescado implements Depredador, Presa {

    @Override
    public void cazar() {
        System.out.println("El pescado está cazando");
    }

    @Override
    public void huir() {
        System.out.println("El pescado está huyendo");
    }
}
