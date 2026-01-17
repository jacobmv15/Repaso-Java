public class Main {
    public static void main(String[] args) {
        
        // overload methods = methods that share the same name,
        //                    but different parameters
        //                    signature = name + parameters

        System.out.println(sumar(1, 2, 3, 4));

        String pizza = hornearPizza("Napolitana", "mozzarella", "atún");
        System.out.println(pizza);

    }

    static double sumar(double a, double b){
        return a + b;
    }

    static double sumar(double a, double b, double c){
        return a + b + c;
    }

    static double sumar(double a, double b, double c, double d){
        return a + b + c + d;
    }

    static String hornearPizza(String tipoDeBase){
        return "Base " + tipoDeBase;
    }

    static String hornearPizza(String tipoDeBase, String queso){
        return "Base " + tipoDeBase + " con " + queso;
    }

    static String hornearPizza(String tipoDeBase, String queso, String extra){
        return "Base " + tipoDeBase + " con " + queso + " y " +extra;
    }
}
