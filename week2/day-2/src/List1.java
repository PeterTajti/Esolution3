//Create an empty list which will contain names (strings)
//Print out the number of elements in the list
//Add William to the list
//Print out whether the list is empty or not
//Add John to the list
//Add Amanda to the list
//Print out the number of elements in the list
//Print out the 3rd element
//Iterate through the list and print out each name
//William
//John
//Amanda
//Iterate through the list and print
//1. William
//2. John
//3. Amanda
//Remove the 2nd element
//Iterate through the list in a reversed order and print out each name
//Amanda
//William
//Remove all elements

import java.util.ArrayList;

public class List1 {

    public static void main(String... args) {



        ArrayList <String> stringek = new ArrayList<>();
        System.out.println(stringek);

        stringek.add("William");
        System.out.println(stringek);

        boolean isEmpty = stringek.isEmpty();
        System.out.println(isEmpty);

        stringek.add("John");
        stringek.add("Amanda");

        System.out.println(stringek.size());

        String getIt = stringek.get(2);
        System.out.println(getIt);

        for (int i = 0; i < stringek.size(); i++)
        System.out.println(stringek.get(i));

//Iterate through the list and print
//1. William
//2. John
//3. Amanda

        int a = 1;

        for (int i = 0; i < stringek.size(); i++) {
            System.out.println(a + ". " + stringek.get(i));
            a++;
        }


//Remove the 2nd element
//Iterate through the list in a reversed order and print out each name
//Amanda
//William


        stringek.remove (1);

        for (int i = stringek.size() -1; i >= 0; i--) {
            System.out.println(stringek.get(i));
        }


        stringek.clear();
        System.out.println(stringek);



    }


    }






