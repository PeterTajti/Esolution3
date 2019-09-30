package FileManipulation_Week3.Births;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthsFunctions {

  public static int mostProdYear(String fileName) {

    //15. új változók a max érkékre és kulcsra
    int maxValue = 0;
    int maxKey = 0;

    try {

      //1. létrehozzuk ezt az üres listát mert késöbb kelleni fog
      List<String> linesContent = null;
      //2. file neve mint elérési útvonal
      Path fileContentPath = Paths.get(fileName);
      //3. beolvassuk a filet.
      linesContent = Files.readAllLines(fileContentPath);
      //4. csinálunk egy listát a éveknek
      ArrayList<Integer> yearOfBirth = new ArrayList<>();
      //5. csinálunk egy hashmapet az év-előfordulás pároknak
      HashMap<Integer, Integer> yearOfBirthOccurance = new HashMap<>();


      //6. for loop, megvizsgáljuk a beolvasott szüveget teljes hosszában...
      for (int i = 0; i < linesContent.size(); i++) {
        //7. ...majd csinálunk egy változót melyben kivesszük a szöveg i-edik elemét(ami az első sor),
        //majd pontosvessző mentén feldaraboljuk, és vesszük az 1-es indexét, ami lesz a dátum, itt még String.
        String date = linesContent.get(i).split(";")[1];
        //8. ezután a date-et felradarboljuk kötőjel mentén, majd integerré alakítjuk, és a 0-dik indexét vesszük
        //ami az évszám
        Integer year = Integer.parseInt(date.split("-")[0]);

        //9. ezután hozzá adjuk ezt az évszámot a korábban létrehozott arraylisthez.
        yearOfBirth.add(year);

        //10. ezek után a for loop ujraindul és felúlírja a date és year változót, amiket szintén hozzá adunk a listához
        //és így tovább...
      }

      //11. for each loop. végig megyünk egy kulcsal az egész array listen, itt adjuk hozzá a list tartalmát
      //a hashmaphez.
      for (Integer key : yearOfBirth) {
        //12. az értéke egyenlő a hashmap ben található key-k értékével
        Integer value = yearOfBirthOccurance.get(key);
        //13. key = key, value ha még nincs a hashmapben(==null) akkor set 1, ha már van benne akkor +1
        yearOfBirthOccurance.put(key, (value == null) ? 1 : value + 1);
      }

      //14. létrehozunk egy új hashmapet entrytket és végig megyünk a minden évet tartalmazó hashmapen
      for (Map.Entry<Integer, Integer> mostBirhtsInAYear : yearOfBirthOccurance.entrySet()) {

        //16. ha az aktuális hashmap entry értéke nagyobb mint a maxValue(ami elsőként biztos az lesz)...
        if (mostBirhtsInAYear.getValue() > maxValue) {
          //17. ...akkor az uj érték egyenlő lesz az entry értékével, ha késöbb találunk egy nagyobb értékű entryt
          //akkor autómatikusan az lesz az uj max érték.
          maxValue = mostBirhtsInAYear.getValue();
          //18. a legnagyobb értékű kulcsunk
          maxKey = mostBirhtsInAYear.getKey();

        }

      }


    } catch (IOException e) {

      System.out.println("no file");


    }


    //19. return a legnagyobb értékkel rendelkező kulcsot
    System.out.println(maxKey);
    return maxKey;

  }
}
