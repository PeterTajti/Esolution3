package SwearWords;

public class Main {
  public static void main(String[] args) {
    String file = "C:\\Users\\izs\\greenfox\\isteneszsolt\\Practice\\src\\SwearWords\\swear.txt";
    String[] swearWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};

    SwearWordsFunction.removeSwearWords(file, swearWords);



  }
}
