package questions.prepare;
import java.util.HashMap;

public class AnagramCheck
{
    public static void main(String[] args) {
        String sentence1 = "Hello";
        String sentence2 = "Bye";
        Boolean answer1 = checkAnagram(sentence1, sentence2);
        System.out.println("Is " + sentence1 + " an anagram of " + sentence2 + "?\nAnswer: " + answer1);

        System.out.println();

        String sentence3 = "Tom Marvolo Riddle";
        String sentence4 = "I am Lord Voldemort";
        Boolean answer2 = checkAnagram(sentence3, sentence4);
        System.out.println("Is " + sentence3 + " an anagram of " + sentence4 + "?\nAnswer: " + answer2);
    }

    /**
     * Before checking if we are working with an anagram of 2 strings or now - it's smart to pre-process strings anc clean them.
     * @param sentence - sentence that we want to clean.
     * @return String of a clean sentence that is lower cased and only has alphanumeric characters
     */
    public static String cleanString(String sentence)
    {
        return sentence.toLowerCase().replaceAll(" ", "").replaceAll("[^A-Za-z0-9]", "");
    }

    /**
     * A method that prepares a HashMap for each sentence that is passed to it.
     * @param sentence - a String of information that needs to be turned into a HashMap
     * @return HashMap {Character, Integer} representing the sentence Hashed.
     */
    public static HashMap<Character, Integer> prepareHashMap(String sentence)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < sentence.length(); i++)
        {
            if (map.containsKey(sentence.charAt(i)))
            {
                map.put(sentence.charAt(i), map.get(sentence.charAt(i)) + 1);
            }
            else
            {
                map.put(sentence.charAt(i), 1);
            }
        }
        return map;
    }

    /**
     * Check if two strings are anagrams of each other. In python such approach would be most easily done with dictionaries,
     * Where in java working around HashMaps seems to be the easiest solution.
     * @param sentence1 - sentence one that you want to compare to sentence two for anagram(ic presence)
     * @param sentence2 - sentence two that you want to compare to sentence one for anagram(ic presence)
     * @return Boolean of either the sencences being anagrams or not
     */
    public static Boolean checkAnagram(String sentence1, String sentence2)
    {
        // Clean and Hash sentences or words needed for analysis
        HashMap<Character, Integer> map1 = prepareHashMap(cleanString(sentence1));
        HashMap<Character, Integer> map2 = prepareHashMap(cleanString(sentence2));

        // Compare two HashMaps if they hold the same type dictionaries
        return map1.equals(map2);
    }
}
