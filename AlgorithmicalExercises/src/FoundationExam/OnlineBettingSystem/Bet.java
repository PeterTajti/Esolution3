package FoundationExam.OnlineBettingSystem;

import java.util.ArrayList;

public class Bet {

  private int betId;
  private int amount;
  private Player player;
  private Contestant contestant;

  public Bet(Contestant contestant, int amountOfBet) {

  }

  public Bet(Player player, Contestant contestant) {

    //1000 és 9999 közötti random szám

    this.betId = (int) (Math.random() * 9000) + 1000;
    this.amount = 0;
    this.player = player;
    this.contestant = contestant;


  }

  public int getAmount(int amount) {

    return amount;
  }
}

