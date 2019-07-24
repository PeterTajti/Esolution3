package Sharpie;

public class Main {

    public static void main(String[] args) {

        Sharpie pen01 = new Sharpie();
        pen01.color = "red";
        pen01.width = 20;
        pen01.inkAmount = 100;

            for (int i = 0; i < 15; i++) {
                pen01.use();
            }

        System.out.println("In the pen01, which color is " + pen01.color + " and its width is " + pen01.width + "mm " + ", after 15 usings, there will be " + pen01.inkAmount + " ink left in it.");

    }

}
