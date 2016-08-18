package holding.ex20;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jack.zhang on 8/18/2016.
 */
public class VowelWord {
    private static Set<Character> vowelset = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    //static {
    //    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    //    for(char e: vowels)
    //        vowelset.add(e);
    //}
    public static int checkVowelCount(String world) {
        char[] wordchar = world.toCharArray();
        int count = 0;
        for(char w: wordchar) {
            if (vowelset.contains(w))
                count++;
        }
        return count;
    }
    public static HashMap<Character, Integer> checkEachVowelCount(String world) {
        char[] wordchar = world.toCharArray();
        HashMap<Character, Integer> vowelCount = new HashMap<Character, Integer>();
        for (char w : wordchar) {
            if (vowelset.contains(w)) {
                if (vowelCount.containsKey(w)) {
                    vowelCount.put(w, vowelCount.get(w) + 1);
                } else {
                    vowelCount.put(w, 1);
                }
            }
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        String str = "helllo";
        int count = checkVowelCount(str);
        System.out.println(count);

        HashMap<Character, Integer> vowelCount = checkEachVowelCount(str);
        System.out.println(vowelCount);
        for(char e: vowelCount.keySet())
            System.out.println("Vowel " + e + " count: " + vowelCount.get(e));
    }
}
