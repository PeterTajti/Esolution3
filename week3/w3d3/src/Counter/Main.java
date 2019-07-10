package Counter;

public class Main {

    public static void main (String [] args){

    Counter c1 = new Counter(5);

        System.out.println(c1.x);

        c1.add(5);
        System.out.println(c1.x);

        c1.add();
        System.out.println(c1.x);

        System.out.println(c1.get());

        c1.reset();
        System.out.println(c1.get());

    }

}
