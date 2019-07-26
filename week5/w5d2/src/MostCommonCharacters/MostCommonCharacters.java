//package MostCommonCharacters;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.*;
//
//public class MostCommonCharacters {
//
//
//
//    public static void main(String[] args) {
//        static String targetFile = "countchar.txt";
//        theMostCommonCharacterInThisFile(targetFile);
//
//    }
//
//    private static void theMostCommonCharacterInThisFile(String filePath) {
//
//        ArrayList<String> list = new ArrayList<>();
//
//        int i = 1;
//
//        try {
//            File file = new File(filePath);
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                list.add(i - 1, scanner.nextLine());
//                i++;
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File does not exist!");
//        }
//
//        ArrayList<Character> kar = new ArrayList<>();
//        String temp;
//
//        for (int j = 0; j < list.size(); j++) {
//            temp = list.get(j);
//            char[] wut = temp.toCharArray();
//            for (int k = 0; k < wut.length; k++) {
//                kar.add(k, wut[k]);
//            }
//        }
//
//        HashMap<Character, Integer> mcc = new HashMap<>();
//
//        // counts the values based on same keys
//
//        for (i = 0; i < kar.size(); i++) {
//
//            if (mcc.containsKey(kar.get(i))) {
//                mcc.put(kar.get(i), mcc.get(kar.get(i)) + 1);
//            } else {
//                mcc.put(kar.get(i), 1);
//            }
//        }
//
//        System.out.println(mcc);
//
//        Map.Entry<Character, Integer> maxEntry = null;
//        Map.Entry<Character, Integer> secondMaxEntry = null;
//
//        for (Map.Entry<Character, Integer> entry : mcc.entrySet()) {
//            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
//                maxEntry = entry;
//            }
//            if (secondMaxEntry == null || entry.getValue() > secondMaxEntry.getValue() && entry.getValue() != maxEntry.getValue()) {
//                secondMaxEntry = entry;
//            }
//        }
//
//        System.out.println("\"" + maxEntry.getKey() + "\" " + ": " + maxEntry.getValue() + ",");
//        System.out.println("\"" + secondMaxEntry.getKey() + "\" " + ": " + secondMaxEntry.getValue());
//
//    }
//
//}