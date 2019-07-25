package FleetOfThings;
public class FleetOfThings {
    public static void main(String[] args) {

        Fleet fleet1 = new Fleet();

         Thing thing1 = new Thing ("Get milk");
         Thing thing2 = new Thing ("Remove the obstacles");
         Thing thing3 = new Thing("Stand up");
         Thing thing4 = new Thing("Eat lunch");

         fleet1.add (thing1);
         fleet1.add (thing2);

        fleet1.add (thing3);
        thing3.complete();

        fleet1.add (thing4);
        thing4.complete();

        System.out.println(fleet1);
    }
}
