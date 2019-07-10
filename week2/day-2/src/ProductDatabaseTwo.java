import java.util.HashMap;

public class ProductDatabaseTwo {

    public static void main(String[] args) {

        HashMap<String, Integer> productHash = new HashMap<>();

        productHash.put("Eggs", 200);
        productHash.put("Milk", 200);
        productHash.put("Fish", 400);
        productHash.put("Apples", 150);
        productHash.put("Chicken", 550);

        lessThan(productHash, 201);
        moreThan(productHash, 150);

    }

    public static void lessThan(HashMap<String, Integer> input, int price) {
        for (String a : input.keySet()){
            if (price > input.get(a)) {
                System.out.println(a);
            }
        }
    }

    public static void moreThan(HashMap<String, Integer> input, int price) {
        for (String y : input.keySet()){
            if (price < input.get(y)) {
                System.out.println(y + " : " + input.get(y));
            }
        }
    }
}