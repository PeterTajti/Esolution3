package OnlineBettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private int account;
  private String name;
  private List<Bet> bets;

  Player(int account, String name){
    this.account = account;
    this.name = name;
    bets = new ArrayList<>();
  }

  public void makeBet(Contestant contestant, int amount){
    if (amount <= account) {
      Bet newBet = new Bet(amount, this.name, contestant.getName());
      bets.add(newBet);
      account -= amount;
    }
  }

  public void checkBets(Contestant winner){
    for(Bet ticket: bets){
      if(winner.getName().equals(ticket.getContestant())){
        System.out.println(name + " has won " + (ticket.getAmount()*2) + "$ money with the bet: " + ticket.getId());
        account += ticket.getAmount()*2;
      }
    }
  }
}
