public class Cuboid {

    public static void main(String[] args) {

// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

        double w = 80;
        double l = 10;
        double h = 120;

        double  s = ((w * l) * 2 + (w * h) * 2 + (l * h) * 2);
        System.out.println(s + " (mertekegyseg) is the value of the surface");

        double v = (w * l * h);
        System.out.println(v + " (mertekegyseg) is the value of the volume");
    }
}


