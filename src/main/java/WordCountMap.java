
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        HashMap<String, Integer> wordCountMap = new HashMap<>(); // HashMap to hold the occurence of each word.
        String[] wordTokens = words.split(" "); // Split the string into individual words, and store them in an array.
        
        // Loop over the word array.
        for(int i = 0; i < wordTokens.length; i++) {
            if(wordCountMap.containsKey(wordTokens[i])) { // If the HashMap already has the current word...
                wordCountMap.put(wordTokens[i], wordCountMap.get(wordTokens[i]) + 1); // ...increment its count in the HashMap.
            } else { // Else, this is the word's first occurence in the map.
                wordCountMap.put(wordTokens[i], 1); // So, add the new word, and set its count to 1.
            }
        }

        return wordCountMap;
    }
}
