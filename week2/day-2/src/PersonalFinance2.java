import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class PersonalFinance2 {

  public static void main(String[] args) {

    ArrayList<Integer> mySpending = new ArrayList<>();

    mySpending.add(0, 1000);
    mySpending.add(1, 1500);
    mySpending.add(2, 2000);
    mySpending.add(3, 3000);
    mySpending.add(4, 5000);

    System.out.println("The total spending is " + totalSpending(mySpending) + "$.");
    System.out.println("The greatest spending is " + greatestSpending(mySpending) + "$.");
    System.out.println("The cheapest spending is " + cheapestSpending(mySpending) + "$.");
    System.out.println("The average spending is " + averageOfSpending(mySpending) + "$.");

  }

  public static int totalSpending(ArrayList<Integer> input) {

    int sum = 0;

    for (int i = 0; i < input.size(); i++) {
      sum = sum + input.get(i);
    }
    return sum;
  }

  public static int greatestSpending(ArrayList<Integer> input) {

    int greatest = input.get(0);

    for (int spending : input) {
      if (spending > greatest) {
        greatest = spending;
      }
    }

    return greatest;
  }

  public static int cheapestSpending(ArrayList<Integer> input) {

    int cheapest = input.get(0);

    for (int spending : input) {
      if (spending < cheapest) {
        cheapest = spending;
      }
    }

    return cheapest;
  }

  public static int averageOfSpending(ArrayList<Integer> input) {

    int avgSpending = totalSpending(input) / input.size();

    return avgSpending;
  }


}
