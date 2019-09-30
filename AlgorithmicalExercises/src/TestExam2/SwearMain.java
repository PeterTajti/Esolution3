package TestExam2;

public class SwearMain {

  public static void main(String[] args) {

    String fileName = "swear.txt";
    String[] swearWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};

    SwearFunctions.removeSwearWords(fileName,swearWords);
  }
}
