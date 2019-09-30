package FileManipulation_Week3.SwearWords;


public class SwearWordsMain {
  public static void main(String[] args) {

    String file = "swear";
    String[] swearWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};

    SwearWordsFunction.removeSwearWords(file, swearWords);
  }

}
