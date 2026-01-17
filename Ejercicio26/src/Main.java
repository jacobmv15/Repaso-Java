public class Main {

    static int x = 3; //Variable de clase
    public static void main(String[] args) {
        
        // variable scope = where a variable can be accessed

        int x = 1; // Variable local

        System.out.println(x);

        hazAlgo();

        System.out.println(Main.x);
    }

    static void hazAlgo(){
        int x = 2; // Variable local
        System.out.println(x);
    }
}
