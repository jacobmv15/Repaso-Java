public class Main {
    public static void main(String[] args) {
        
        // overload constructors = Allow a class to have multiple constructors
        //                         with differents parameters lists.
        //                         Enable objects to be initialized in various ways.
        
        Usuario usuario1 = new Usuario("Bob Esponja");
        Usuario usuario2 = new Usuario("Patricio", "pestrella@asf.com");
        Usuario usuario3 = new Usuario("Marta", "chupelupe@asf.com", 17);
        Usuario usuario4 = new Usuario();

        System.out.println(usuario1.nombreUsuario);
        System.out.println(usuario1.email);
        System.out.println(usuario1.edad);
        System.out.println();

        System.out.println(usuario2.nombreUsuario);
        System.out.println(usuario2.email);
        System.out.println(usuario2.edad);
        System.out.println();

        System.out.println(usuario3.nombreUsuario);
        System.out.println(usuario3.email);
        System.out.println(usuario3.edad);
        System.out.println();

        System.out.println(usuario4.nombreUsuario);
        System.out.println(usuario4.email);
        System.out.println(usuario4.edad);
    }
}
