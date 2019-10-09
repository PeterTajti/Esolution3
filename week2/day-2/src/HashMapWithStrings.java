import java.util.HashMap;

public class HashMapWithStrings {

  public static void main(String[] args) {

    HashMap<String, String> spells = new HashMap<>();

    spells.put("Fireball", "100");
    spells.put("Frostbolt", "80");
    spells.put("Arcane Missile", "25");

    System.out.println(findDamageBySpellType(spells, "Fireball"));
    System.out.println(findSpellByDamage(spells, "80"));
    dmgList(spells, "Fireball");
  }

  public static String findDamageBySpellType(HashMap<String, String> input, String spellname) {

    String a = "";
    a = input.get(spellname);
    return a;
  }


  public static String findSpellByDamage(HashMap<String, String> input, String spelldamage) {

    for (String b : input.keySet()) {
      if (spelldamage.equals(input.get(b))) {
        return b;
      }
    }
    return null;
  }

  public static void dmgList(HashMap<String, String> input, String spellname) {
    boolean a = false;
    if (input.containsKey(spellname) == a) {
      System.out.println("Oops! This spell is not in the hashmap.");
    } else {
      System.out.println("Its Ok! This spell is in the hashmap.");
    }
  }
}






