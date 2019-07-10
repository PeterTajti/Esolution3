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

        thing3.complete();
         fleet1.add (thing3);

        thing4.complete();
         fleet1.add (thing4);



        // - In the main method create a fleet

        // - Achieve this output:
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet1);
    }
}
