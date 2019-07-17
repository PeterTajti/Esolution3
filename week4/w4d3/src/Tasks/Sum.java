//Create a sum method in your class which has an ArrayList of Integers as parameter
//It should return the sum of the elements in the list
//Follow these steps:
//Add a new test case
//Instantiate your class
//create a list of integers
//use the assertEquals to test the result of the created sum method
//Run them

package Tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sum {

    //itt a tömblista típusát (jelen esetben int) a két kacsacsőr közé Nagy kezdőbetűvel adjuk meg, mert objuektumként kezeljük

    ArrayList<Integer> numberlist = new ArrayList<>();

    //amikor megadjuk a sum function paraméterénél hogy tömblistáról van szó ami int-ekkel dolgozik,
    //akkor oda is be kell írni a kacsacsőrbe hogy Integer!

    public int sum (ArrayList <Integer> numberlist) {

        int sum = 0;

            if (numberlist == null) {
                return 0;
            }

            for (int i = 0; i < numberlist.size(); i++)//a numberlist.size után kell a (), oda kell írni!
                sum += numberlist.get(i);
            return sum;


    }
}
