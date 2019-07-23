import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 5, 10, 15, 20, 25};

        System.out.println(subInt(1, myArray));
        System.out.println(subInt(9, myArray));
    }
        private static ArrayList<String> subInt(int a, int [] b) {

            ArrayList<String> result = new ArrayList<>();

            String check = new String();
            for (int i = 0; i < b.length; i++) {
                check = Integer.toString(b[i]);
                if (check.contains(Integer.toString(a))){
                    result.add(Integer.toString(i));
                }
            }
            return result;

        }

}

