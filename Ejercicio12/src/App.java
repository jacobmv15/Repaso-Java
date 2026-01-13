import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)

        Scanner scanner = new Scanner(System.in);
        
        String email;
        String nombreDeUsuario;
        String dominio;

        System.out.print("Introduce tu correo electrónico: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            nombreDeUsuario = email.substring(0,email.indexOf("@"));
            dominio = email.substring(email.indexOf("@") + 1);

            System.out.println(nombreDeUsuario);
            System.out.println(dominio);
        }
        else{
            System.out.println("Tu correo no contiene \"@\"");
        }

        scanner.close();
    }
}
