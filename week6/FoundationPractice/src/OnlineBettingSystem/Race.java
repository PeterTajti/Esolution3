package OnlineBettingSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
  private List<Contestant> contestants;
  private List<Player> players;

  Race(List<Contestant> contestants, List<Player> players){
    this.contestants = contestants;
    this.players = players;
  }

  public void startRace(){
    Contestant winner = getWinnerFromRanRace();
    for (Player player : players){
      player.checkBets(winner);
    }
  }

  public Contestant getWinnerFromRanRace(){
    List<Integer> randomPlacements = new ArrayList<>();
    for (int i = 0; i < contestants.size(); i++) {
      randomPlacements.add(i+1);
    }
    Collections.shuffle(randomPlacements);
    for (int i = 0; i < contestants.size(); i++) {
      contestants.get(i).setPlacement(randomPlacements.get(i));
    }
    // we have a placement
    //List<Contestant> orderedContestants = new ArrayList<>();
    Contestant winner = null;
    for (int i = 0; i < contestants.size(); i++) { // this is the placement index I am looking for
      for (int j = 0; j < contestants.size(); j++) { // this is the contestant I am looking at
        if(contestants.get(j).getPlacement() == i+1){
          //orderedContestants.add(contestants.get(j));
          System.out.println(contestants.get(j));
          if(i == 0){
            winner = contestants.get(j);
          }
        }
      }
    }
    return winner;
  }
}


