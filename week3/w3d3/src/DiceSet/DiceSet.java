package DiceSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);

            }

        return dice;

    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {


        DiceSet kockak = new DiceSet();

//        System.out.println(diceSet.getCurrent());

       kockak.roll();

       for (int i =0; i < 6; i++) {

                while (kockak.getCurrent(i)  != 6) {
                    kockak.reroll(i);
                    kockak.getCurrent(i);

                    }

               }

        System.out.println(kockak.getCurrent());

           }

       }


//        System.out.println(diceSet.getCurrent());
//       System.out.println(diceSet.getCurrent(5));
//        diceSet.reroll();
//        System.out.println(diceSet.getCurrent());
//      diceSet.reroll(4);
//      System.out.println(diceSet.getCurrent());

