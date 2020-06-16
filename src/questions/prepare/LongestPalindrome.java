package questions.prepare;

/**
 * Reference: https://code-exercises.com/programming/hard/4/longest-palindrome-in-word
 * A palindrome is a word which reads the same backward or forward.
 * 'abcba' is a palindrome.
 * Write a method that returns the longest palindrome substring of a given string.
 */

public class LongestPalindrome
{
    public static void main(String[] args)
    {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.findLongestPalindrome("THISzxcvbnmmnbvcxzTHIS"));
    }

    /**
     * A method that returns the longest palindrome inside of a string of text, assuming it exists.
     * 1 letter is not considered to be a palindrome, because it can be any letter in the text.
     * Such case is ommited.
     * @param word - string of data
     * @return the longest palindrome found in the string
     */
    public String findLongestPalindrome(String word)
    {
        // First clean the string by removing all spaces
        word = word.replaceAll(" ", "");
        int word_len = word.length();
        String palindrome = "";
        // What the concept is: parts of the text are evaluated for whether they are palindromes or not.
        // This is done as a human would do: consider evaluating whether 2 letters next to each other
        // Are palindromes and evaluate it for the whole text. Then do this for 3 letters and so on
        // To the maximum value of how many letters the text has (up to the whole word). For efficiency
        // This is performed in the backwards motion - starting from the largest letters combination
        // And going down to 2.
        for (int i = word_len; i > 1; i--)
        {
            int word_start = 0;
            int word_end = i;
            while (word_end <= word_len)
            {
                Boolean compare = compareReversedStrings(word.substring(word_start, word_end));
                if (compare)
                {
                    palindrome = word.substring(word_start, word_end);
                    return palindrome;
                }
                word_start++;
                word_end++;
            }
        }
        return palindrome;
    }

    /**
     * A method that reverses a string and checks whether it is a palindrome
     * @param text - original text
     * @return a value indicating whether the text analyzed is a palindrome
     */
    public static Boolean compareReversedStrings(String text)
    {
        //Reverse the string
        String text_rev = "";
        for (int i = text.length(); i > 0; i--)
        {
            text_rev += text.charAt(i - 1);
        }
        // Compare two string
        Boolean answer = text.matches(text_rev);
        return answer;
    }
}
