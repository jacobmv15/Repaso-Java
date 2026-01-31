public class Producto<T, U> {
    
    T objeto;
    U precio;
    
    public Producto(T objeto, U precio) {
        this.objeto = objeto;
        this.precio = precio;
    }

    public T getObjeto() {
        return objeto;
    }

    public U getPrecio() {
        return precio;
    }

}
