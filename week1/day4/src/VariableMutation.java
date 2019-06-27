public class VariableMutation {

    public static void main(String[] args) {
        int a = 3;

        // make the "a" variable's value bigger by 10
        a = a+10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b-7;
        System.out.println(b);

        int c = 44;
        c = c*2;
        // please double c's value

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d/5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e*e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        if (f1 < f2)
        System.out.println("igaz, vagyis 123 kisebb mint 345");
        if (f1 > f2)
        System.out.println("hamis, vagyis 123 nem nagyobb mint 345");



        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        if (g2*2 > g1)
            System.out.println("igaz, vagyis 200*2 nagyobb mint 350");
        if (g2*2 < g1)
            System.out.println("hamis, mert 200*2 nem kisebb mint 350");

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)

        boolean hbool = (h%11 ==0);
        System.out.println("a h-nak nem osztója a 11");




        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        if (i1 > Math.pow(3, 2))
        System.out.println("igaz, 10 nagyobb mint 3*3");
        if (i1 < Math.pow(3, 3))
        System.out.println("igaz, 10 kisebb mint 3*3*3");


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        boolean jbool = (j%3 ==0);
        System.out.println("1521 osztható 3-val");
        boolean jbool2 = (j%5 ==0);
        System.out.println("1521 nem osztható 5-vel");
    }

}
