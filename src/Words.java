import java.util.*;

public class Words {

    public void printAllWords(String[] words) {
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        System.out.printf("Amount of all words %s: %s\n", wordList.size(), wordList);
    }

    public void printUniqueWords(String[] words) {
        Set<String> wordSet = new LinkedHashSet<>(Arrays.asList(words));
        List<String> wordSetList = new ArrayList<>(wordSet);
        System.out.printf("Amount of unique words %s: %s\n", wordSetList.size(), wordSetList);
    }

    public void printRepeatingWords(String[] words) {
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        Map<String, Integer> myMap = new LinkedHashMap<>();
        for (String word : wordList) {
            if (myMap.get(word) == null) //myMap.merge(word, 1, Integer::sum);
                myMap.put(word, 1);
            else myMap.put(word, myMap.get(word) + 1);
        }
        System.out.println("Amount of repeated words: " + myMap);
    }

}
