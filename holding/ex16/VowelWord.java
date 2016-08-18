package holding.ex16;



import java.lang.reflect.Array;
import java.util.*;

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
    public static void main(String[] args) {
        String str = "helllo";
        int count = checkVowelCount(str);
        System.out.println(count);
    }
}
