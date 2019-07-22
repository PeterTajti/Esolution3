package MostCommonCharacter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacter {
    public static void main(String[] args) {

        Path filePath = Paths.get("countchar.txt");
        List<String> charList = readFile(filePath);
        HashMap<Character,Integer> charMap = countChar(charList);
        findTheMax(charMap);
    }

    private static HashMap<Character,Integer> findTheMax(HashMap<Character, Integer> charMap) {
        HashMap<Character,Integer> findTheMax = new HashMap<>();
        int max = 0;
        char a = 0;

        for (Map.Entry<Character,Integer> chars:charMap.entrySet()) {
            if (max<chars.getValue()){
                max = chars.getValue();
                a = chars.getKey();
            }
        }

        findTheMax.put(a,max);

        return findTheMax;
    }


    private static HashMap countChar(List<String> stringList) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        char [] charArray;

        for (String word:stringList) {
            charArray = word.toCharArray();
            for (char a:charArray) {
                if (!charMap.containsKey(a)){
                    charMap.put(a,1);
                } else {
                    charMap.put(a,charMap.get(a)+1);
                }
            }
        }

        return charMap;
    }


    private static List<String> readFile(Path filePath) {
        List<String> charList = new ArrayList<>();

        try {
            charList = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("The file does not exist!");
        }

        return charList;
    }
}