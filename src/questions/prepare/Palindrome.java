package questions.prepare;
import java.util.Scanner;

/**
 * Check if a string of text is read the same forwards and backwards
 */
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String userText = "";
        String example1 = "Taco cat";
        String example2 = "Potatoes";
        System.out.println("Is the word " + example1 + " a palindrome of itself: " + checkPalindrome(example1));
        System.out.println("Is the word " + example2 + " a palindrome of itself: " + checkPalindrome(example2));

        // Make a safety case if the user does not input anything or inputs spaces:
        while (userText.isEmpty() || userText.isBlank())
        {
            System.out.print("You can check your own case as well (empty cases are not excepted): ");
            userText = scanner.nextLine();
        }
        System.out.println("Is the word " + userText + " a palindrome of itself: " + checkPalindrome(userText));
        scanner.close();
    }

    /**
     * Check if a string is a palindrome,
     * @param text - string that needs to be checked
     * @return Status in a form of a boolena of whether the string is a palindrome or not
     */
    private static Boolean checkPalindrome(String text)
    {
        return cleanString(text).matches(reverseString(cleanString(text)));
    }

    /**
     * Before the string is checked for whether it is a palindrome of itself or not
     * it is a good idea to clean the string and pre-process it.
     * @param text string of text
     * @return a clean instance of a string
     */
    private static String cleanString(String text)
    {
        // Lower case the string and remove all of the spaces and non alphanumeric characters
        return text.toLowerCase().replaceAll("[^a-z0-9 -]", "").replaceAll(" ", "");
    }

    /**
     * Reverse the string of information
     * @param text input string
     * @return reversed String
     */
    private static String reverseString(String text)
    {
        String output = "";
        // Performing the most basic of reversals
        for (int i = text.length() - 1; i >= 0; i--)
        {
            output += text.charAt(i);
        }
        return output;
    }
}