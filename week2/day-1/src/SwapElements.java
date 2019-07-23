import java.util.Arrays;
public class SwapElements {
    public static void main(String[] args) {

        String[] abc = {"first", "second", "third"};
        String[] box1 = new String[1];
        box1[0] = abc[0];
        abc[0] = abc[2];
        abc[2] = box1[0];
        System.out.println(Arrays.toString(abc));
    }
}
