import java.util.ArrayList;
public class List1 {
    public static void main(String... args) {

        ArrayList <String> stringek = new ArrayList<>();
        System.out.println(stringek + "\n");


        stringek.add("William");
        System.out.println(stringek);
        System.out.println();

        boolean isEmpty = stringek.isEmpty();
        System.out.println(isEmpty);
        System.out.println();

        stringek.add("John");
        stringek.add("Amanda");

        System.out.println(stringek.size());
        System.out.println();

        String getIt = stringek.get(2);
        System.out.println(getIt);
        System.out.println();

        for (int i = 0; i < stringek.size(); i++)
        System.out.println(stringek.get(i));
        System.out.println();

        int a = 1;

        for (int i = 0; i < stringek.size(); i++) {
            System.out.println(a + ". " + stringek.get(i));
            a++;
        }
        System.out.println();

        stringek.remove (1);

        for (int i = stringek.size() -1; i >= 0; i--) {
            System.out.println(stringek.get(i));
        }

        stringek.clear();
        System.out.println(stringek);
    }
}






