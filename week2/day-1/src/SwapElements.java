
import java.util.Arrays;

public class SwapElements {


    public static void main(String[] args) {

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`



        String[] abc = {"first", "second", "third"};

        String[] box1 = new String[1];

        box1[0] = abc[0];

        abc[0] = abc[2];

        abc[2] = box1[0];

        System.out.println(Arrays.toString(abc));




    }

}