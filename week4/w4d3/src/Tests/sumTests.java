package Tests;

import Tasks.Sum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumTests {


    @Test
    public void test1 () {

        //létre kell hozni a Sum-nak is egy példányát mert az is egy class ???
        Sum sum1 = new Sum();

        ArrayList<Integer> numberlist = new ArrayList<>();

        numberlist.add(5);
        numberlist.add(10);
        numberlist.add(20);
        numberlist.add(55);

        int expected = 90;
        int actual = sum1.sum(numberlist);

        assertEquals(expected, actual);

    }

}

//Create different tests where you test your method with:
//an empyt list
//a list that has one element in it
//a list that has multiple elements in it
//a null
//Run them
//Fix your code if needed