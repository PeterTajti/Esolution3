package OnlineBettingSystem;

public class Bet {
  private int betID;
  private int amount;
  private String player;
  private String contestant;

  Bet(int amount, String player, String contestant){
    this.betID = 1000+(int)(Math.random()*9000);
    this.amount = amount;
    this.player = player;
    this.contestant = contestant;
  }

  public String getContestant(){
    return contestant;
  }

  public int getAmount() {
    return amount;
  }

  public int getId() {
    return betID;
  }
}