package FoundationExam.OnlineBettingSystem;

import java.util.ArrayList;


public class Player {
  private String name = "Henry";
  private int account = 100;
  private ArrayList<Bet> bets = new ArrayList<>();

  public Player() {

  }

  public void makeABet(Contestant contestant, int amountOfBet) {

    if (account >= amountOfBet) {

      Bet bet = new Bet(contestant, amountOfBet);
      bets.add(bet);

    }

  }

  public String getName() {

    return name;
  }

  public ArrayList getBets() {

    return bets;
  }

  public int getAccount() {

    return account;
  }

  public void setAccount(int account) {

    this.account = account;

  }
}
