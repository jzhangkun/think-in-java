package holding.ex21;

import java.util.*;

/**
 * Created by jack.zhang on 8/18/2016.
 */
public class WordCounter {
    public static void main(String[] args) {
        String sentence = "The world is full of words and full of lies";
        Map<String, Integer> wordCounter = new HashMap<String, Integer>();
        for(String w: sentence.split(" ")) {
            if (wordCounter.containsKey(w)) {
                wordCounter.put(w, wordCounter.get(w) + 1);
            } else {
                wordCounter.put(w, 1);
            }
        }
        Set<String> wordset = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        wordset.addAll(wordCounter.keySet());

        //Collections.sort(new ArrayList<String>((Collection)wordCounter.keySet()));

        for(String w: wordset)
            System.out.println(w + " : " + wordCounter.get(w));

    }
}
