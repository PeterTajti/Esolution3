//Demonstrating power usage with OOP.
//I created a Battery class and three copies.
//Each object can store different amount power.
//The actions costs power, so the power level will drop.
//How much power will remain after the actions?

package Battery;

public class Main {

    public static void main(String[] args) {

        Battery mobilphone = new Battery();

        Battery tablet = new Battery();
        tablet.energylevel = 8000;

        Battery laptop = new Battery();
        laptop.energylevel = 300000;

//        mobilphone.downloadPicture();
//        mobilphone.downloadPicture();
//        mobilphone.downloadPicture();
//        mobilphone.playVideo();
//
//        tablet.downloadPicture();
//        tablet.downloadPicture();
//        tablet.downloadPicture();
//        tablet.playVideo();
//
//        laptop.downloadPicture();
//        laptop.downloadPicture();
//        laptop.downloadPicture();
//        laptop.playVideo();
//
//        System.out.println("Remaining energy of mobilphone : " + mobilphone.energylevel);
//        System.out.println("Remaining energy of tablet : " + tablet.energylevel);
//        System.out.println("Remaining energy of laptop : " + laptop.energylevel);
//
        mobilphone.recharge();
        tablet.recharge();
        laptop.recharge();

        System.out.println("Energy of mobilphone after 1 min of recharge : " + mobilphone.energylevel);
        System.out.println("Energy of tablet after 1 min of recharge : " + tablet.energylevel);
        System.out.println("Energy of laptop after 1 min of recharge : " + laptop.energylevel);

    }

}
