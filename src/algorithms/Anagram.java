package algorithms;

import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author MC03353
 */
public class Anagram {

    public static boolean anagramSolution(String s1, String s2) {
        // Cleaning the strings (remove white spaces and convert to lowercase)
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        // Check every char of s1 and removes first occurence of it in s2
        for (int i = 0; i < s1.length(); i++) {
            if (s2.equals("")) {
                return false;  // s2 is already empty : not an anagram
            }
            s2 = s2.replaceFirst(Pattern.quote("" + s1.charAt(i)), "");
        }

        // if s2 is empty we have an anagram
        return s2.equals("");
    }

}
