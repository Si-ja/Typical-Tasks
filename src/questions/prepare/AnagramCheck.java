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
     * Check if two strings are anagrams of each other. In python such approach would be most easily done with dictionaries,
     * Where in java working around HashMaps seems to be the easiest solution.
     * @param sentence1 - sentence one that you want to compare to sentence two for anagram(ic presence)
     * @param sentence2 - sentence two that you want to compare to sentence one for anagram(ic presence)
     * @return Boolean of either the sencences being anagrams or not
     */
    public static Boolean checkAnagram(String sentence1, String sentence2)
    {
        String clean_sentence1 = cleanString(sentence1);
        String clean_sentence2 = cleanString(sentence2);

        // Keep track of how many instances each letter has in a sentence
        HashMap<Character, Integer> dictionary_sentence1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> dictionary_sentence2 = new HashMap<Character, Integer>();

        for (int i = 0; i < clean_sentence1.length(); i++)
        {
            if (dictionary_sentence1.containsKey(clean_sentence1.charAt(i)))
            {
                dictionary_sentence1.put(clean_sentence1.charAt(i), dictionary_sentence1.get(clean_sentence1.charAt(i)) + 1);
            }
            else
            {
                dictionary_sentence1.put(clean_sentence1.charAt(i), 1);
            }
        }

        for (int i = 0; i < clean_sentence2.length(); i++)
        {
            if (dictionary_sentence2.containsKey(clean_sentence2.charAt(i)))
            {
                dictionary_sentence2.put(clean_sentence2.charAt(i), dictionary_sentence2.get(clean_sentence2.charAt(i)) + 1);
            }
            else
            {
                dictionary_sentence2.put(clean_sentence2.charAt(i), 1);
            }
        }

        // Compare two HashMaps if they hold the same type dictionaries
        return dictionary_sentence1.equals(dictionary_sentence2);
    }
}
