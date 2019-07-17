package Tests;

import Tasks.Apple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getAppleTest {

    //a teszt eset egy mini main függvény gyakorlatilag,
    // ezért az a jobb ha helyben hozunk létre egy példányt hozzá (benne)

    @Test
    public void test01 () {
        Apple alma1= new Apple();

        String expected = ("apple");
        String actual = alma1.getApple();

        assertEquals(expected, actual);
    }

    //a test02 nevű tesztesetet szándékosan elrontjuk, hogy hibát jelezzen

     @Test
        public void test02 () {
            Apple alma1= new Apple();

            String expected = ("almafa");
            String actual = alma1.getApple();

            assertEquals(expected, actual);
        }

    @Test
    public void test03 () {
        Apple alma1= new Apple();

        String expected = ("apple");
        String actual = alma1.getApple();

        assertEquals(expected, actual);
    }

}
