import java.util.ArrayList;
public class List1 {
    public static void main(String... args) {

        ArrayList <String> stringek = new ArrayList<>();
        System.out.println(stringek);

        stringek.add("William");
        System.out.println(stringek);

        boolean isEmpty = stringek.isEmpty();
        System.out.println(isEmpty);

        stringek.add("John");
        stringek.add("Amanda");

        System.out.println(stringek.size());

        String getIt = stringek.get(2);
        System.out.println(getIt);

        for (int i = 0; i < stringek.size(); i++)
        System.out.println(stringek.get(i));

        int a = 1;

        for (int i = 0; i < stringek.size(); i++) {
            System.out.println(a + ". " + stringek.get(i));
            a++;
        }

        stringek.remove (1);

        for (int i = stringek.size() -1; i >= 0; i--) {
            System.out.println(stringek.get(i));
        }

        stringek.clear();
        System.out.println(stringek);
    }
}






