package w7d1spring.bankofsimba.Models;

import java.util.ArrayList;
import java.util.List;

public class Database {

  List<BankAccount> listOfBankAccounts;

  public Database() {
    listOfBankAccounts = new ArrayList<>(); //itt létrehozom a leendő Table üres listát a konstruktorral
    fillList();
  }

  BankAccount account1 = new BankAccount("Simba", 2000, "Lion");
  BankAccount account2 = new BankAccount("Alpha", 500, "Tiger");
  BankAccount account3 = new BankAccount("Beta", 200, "Panther");
  BankAccount account4 = new BankAccount("Gamma", 150, "Gepard");
  BankAccount account5 = new BankAccount("Delta", 100, "Cat");

  public List<BankAccount> getListOfBankAccounts() {
    return listOfBankAccounts;
  }

  public void fillList () {
    listOfBankAccounts.add(account1);
    listOfBankAccounts.add(account2);
    listOfBankAccounts.add(account3);
    listOfBankAccounts.add(account4);
    listOfBankAccounts.add(account5);}

}
