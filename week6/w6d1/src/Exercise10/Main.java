package Exercise10;//Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:
//
//Write a Stream Expression to find the foxes with green color!
//Write a Stream Expression to find the foxes with green color, and age less then 5 years!
//Write a Stream Expression to find the frequency of foxes by color!

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Fox> myFoxList = new ArrayList<>();

    Fox fox1 = new Fox("Vuk", "Green", 1);
    Fox fox2 = new Fox("Karak", "Green", 6);
    Fox fox3 = new Fox("Kag", "Green", 3);
    Fox fox4 = new Fox("Bob", "Green", 7);
    Fox fox5 = new Fox("Lily", "Red", 4);

    myFoxList.add(fox1);
    myFoxList.add(fox2);
    myFoxList.add(fox3);
    myFoxList.add(fox4);
    myFoxList.add(fox5);

    myFoxList.stream()
            .filter(fox -> fox.color == "Green")
            .forEach(fox -> System.out.println(fox.name));

    myFoxList.stream()
            .filter(fox -> fox.color == "Green")
            .filter(fox -> fox.age < 5)
            .forEach(fox -> System.out.println(fox.name));



    System.out.println(myFoxList.stream().collect(Collectors.groupingBy(fox -> fox.color, Collectors.counting())));

  }

}
