public class Usuario {

    String nombreUsuario;
    String email;
    int edad;

    

    public Usuario() {
        this.nombreUsuario = "Invitado";
        this.email = "No inicializado";
        this.edad = 0;
    }

    public Usuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.email = "No inicializado";
        this.edad = 0;
    }

    public Usuario(String nombreUsuario, String email) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.edad = 0;
    }

    public Usuario(String nombreUsuario, String email, int edad) {
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.edad = edad;
    }

    //CÓDIGO CORREGIDO
    /*public Usuario(String nombreUsuario) {
    this();
    this.nombreUsuario = nombreUsuario;
    }

    public Usuario(String nombreUsuario, String email) {
        this(nombreUsuario);
        this.email = email;
    }

    public Usuario(String nombreUsuario, String email, int edad) {
        this(nombreUsuario, email);
        this.edad = edad;
    }*/

}