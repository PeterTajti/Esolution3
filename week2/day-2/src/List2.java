//Create a list ('List A') which contains the following values
//Apple, Avocado, Blueberries, Durian, Lychee

//Create a new list ('List B') with the values of List A
//Print out whether List A contains Durian or not

//Remove Durian from List B
//Add Kiwifruit to List A after the 4th element
//Compare the size of List A and List B
//Get the index of Avocado from List A
//Get the index of Durian from List B
//Add Passion Fruit and Pomelo to List B in a single statement
//Print out the 3rd element from List A

import java.util.ArrayList;
import java.util.Arrays;

public class List2 {

    public static void main(String... args) {

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        System.out.println(listA);

//Create a new list ('List B') with the values of List A
//Print out whether List A contains Durian or not

        ArrayList<String> listB = new ArrayList<>(listA);

        boolean contains = listA.contains("Durian");
        System.out.println(contains);

//Remove Durian from List B
//Add Kiwifruit to List A after the 4th element
//Compare the size of List A and List B

    listB.remove("Durian");
    listA.add(4, "Kiwifruit");
        System.out.println(listA);

        System.out.println(listA.size() == listB.size());

//Get the index of Avocado from List A
//Get the index of Durian from List B

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

//Add Passion Fruit and Pomelo to List B in a single statement
//Print out the 3rd element from List A

        listB.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
        System.out.println(listA.get(2));


    }

}
