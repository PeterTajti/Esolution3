package LeaderboardSort;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Player player1 = new Player("John", 100);
    Player player2 = new Player("Jack", 500);
    Player player3 = new Player("Bob", 200);

    List<Player> playerlist = new ArrayList<>();
    playerlist.add(player1);
    playerlist.add(player2);
    playerlist.add(player3);

    playerlist.sort(Comparator.comparing(Player::getHighScore).reversed());

    for (int i = 0; i < playerlist.size(); i++) {
      System.out.println(playerlist.get(i).getName() + " " + playerlist.get(i).getHighScore());
    }



  }



}
