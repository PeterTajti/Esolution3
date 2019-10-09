import java.util.HashMap;
public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> telephoneBook = new HashMap<>();

        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(needPhoneNumber(telephoneBook, "John K. Miller"));
        System.out.println(needName(telephoneBook, "307-687-2982"));
        numberList(telephoneBook, "Chris E. Myers");
        numberList(telephoneBook, "William A. Lathan");
    }

    public static String needPhoneNumber(HashMap<String, String> input, String name) {
        String a = "";
        a = input.get(name);
        return a;
    }

    public static String needName (HashMap<String, String> input, String number) {

        for (String b : input.keySet()){
            if (number.equals(input.get(b))) {
                return b;
            }
        }
        return null;
    }
    //a "b" változóval végigjárjuk a hashmap keyset-jét, vagyis ciklusonként a "b" az ember neve lesz.
    // az input.get(b) a "b" névhez tartozó telefonszámot veszi ki,
    // amit összehasonlít a "number" paraméterrel, és ha egyezik a kettő, akkor az "a"-ban tárolja a "b"-t.



    public static void numberList (HashMap<String, String> input, String name) {
        boolean a = false;
        if (input.containsKey(name) == a) {
            System.out.println("You don't have this contact's number.");
        } else {
            System.out.println("This name is in the telephonebook.");
        }
    }
}