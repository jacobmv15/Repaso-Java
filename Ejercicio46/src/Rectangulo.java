public class Rectangulo extends Forma {
    
    double lenght;
    double width;

    public Rectangulo(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double area() {
        return lenght * width;
    }
}
