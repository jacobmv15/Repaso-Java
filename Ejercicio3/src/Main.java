public class Main {
    public static void main(String[] args) {
        
        // ARITHMETIC OPERATIONS

        int x = 10;
        int y = 3;
        int z;

        //z = x + y;
        //z = x - y;
        //z = x * y;
        //z = x / y;
        z = x % y;

        //System.out.println(z);


        // AUGMENTED ASSIGNMENT OPERATOR
        x = 10;
        y = 1;

        //x += y;
        //x -= y;
        //x *= y;
        //x /= y;
        x %= y;

        //System.out.println(x);

        // INCREMENT AND DECREMENT OPERATORS

        x = 1;

        //x++;
        //x--;

        //System.out.println(x);

        // ORDER OF OPERATIONS (P(Paréntesis)-E(Exponentes)-M(Multiplicación)-D(División)-A(Suma)-S(Resta))
        
        double result = 3 + 4 * (7 - 5) / 2.0;
        
        System.out.println(result);
    }
}
