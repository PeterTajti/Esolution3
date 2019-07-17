package Tests;

import Tasks.Sum;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumTest {


    @Test
    public void testFourElements () {

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

    @Test

    public void testNoElements () {

        Sum sum1 = new Sum();

        ArrayList<Integer> numberlist = new ArrayList<>();

        int expected = 0;
        int actual = sum1.sum(numberlist);

        assertEquals(expected, actual);

        //vagyis ebben az esetben, ha nem megy be semmi, akkor is olvasható eredményt ad ki, hisz visszaadja a nullát

    }

    @Test

    public void testOneElement () {

        Sum sum1 = new Sum();

        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.add(5);


        int expected = 5;
        int actual = sum1.sum(numberlist);

        assertEquals(expected, actual);
    }

    @Test

    public void testNoElementAndNullReturn () {

        Sum sum1 = new Sum();

        ArrayList<Integer> numberlist = new ArrayList<>();
//aztán itt nem teszem bele a négy számot a tömblistába

        //expectednek 0-t adok meg hogy a Sum classban megírt dolog null-t adjon vissza
        int expected = 1000;
        int actual = sum1.sum(null);

        assertEquals(expected, actual);
    }

}
