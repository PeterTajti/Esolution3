package OnlineBettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Contestant> contestantList = new ArrayList<>();
    Contestant jozsi = new Contestant(-1, "Józsi");
    Contestant bela = new Contestant(-1, "Béla");
    Contestant toni = new Contestant(-1, "Tóni");
    contestantList.add(jozsi);
    contestantList.add(bela);
    contestantList.add(toni);
    List<Player> players = new ArrayList<>();
    Player gyuri = new Player(100,"Gyuri");
    gyuri.makeBet(jozsi,10);
    gyuri.makeBet(bela,60);
    gyuri.makeBet(toni,30);
    players.add(gyuri);
    Race localRace = new Race(contestantList, players);
    localRace.startRace();
  }
}
