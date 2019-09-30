package FoundationExam.OnlineBettingSystem;

import java.util.ArrayList;

public class Race {
  private ArrayList<Contestant> contestants;
  private ArrayList<Player> players;
  String winner = "";

  public Race() {

    contestants = new ArrayList<>();
    players = new ArrayList<>();

  }

  public String startRace() {
    for (int i = 0; i < contestants.size(); i++) {
      contestants.get(i).setPlacement((int) (Math.random() * contestants.size() + 1));
      for (int j = 0; j < contestants.size(); j++) {
        if (contestants.get(i).getPlacement() == contestants.get(j).getPlacement()) {

          contestants.get(i).setPlacement((int) (Math.random() * contestants.size() + 1));


        }

      }

    }

    for (int k = 0; k < contestants.size(); k++) {

      System.out.println(contestants.get(k).toString());

    }

//    for (int i = 0; i < players.size(); i++) {
//
//      for (int j = 0; j < players.get(i).getBets().size(); j++) {
//
//        if (players.get(i).getBets().get(j).equals(contestants.get(0))) {
//
//          players.get(i).setAccount(players.get(i).getAccount() + players.get(i).getBets().get(j).getAmount() * 2);
//
//          winner = players.get(i).getName() + "has won " + players.get(i).getBets().get(j).getAmount() * 2 + " with the bet: " + players.get(i).getBets().get(j).getBetId();
//
//        }
//
//      }
//
//    }

    return winner;

  }

}
