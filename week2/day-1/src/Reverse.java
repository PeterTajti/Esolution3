// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int [] aj = {3, 4, 5, 6, 7};

        int [] reverse = new int [5];

        for (int i = 0; i < aj.length; i++) {
            reverse[aj.length - i -1] = aj[i];
        }

        System.out.println(Arrays.toString(reverse));

    }

}
