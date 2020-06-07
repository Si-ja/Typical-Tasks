package questions.prepare;

/**
 * Class that helps to perform reversal of the String.
 */
public class StringReversal
{
    public static void main(String[] args)
    {
        String string1 = reverseString("taco cat");
        String string2 = reverseString("Is python better than Java?");
        String string3 = reverseString("how smart was to ask the last question?");

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }

    /**
     * Perform a reversal of a very simple string instances.
     * @param text string of text that you want to reverse
     * @return a reversed string is provided of the original input string
     */
    public static String reverseString(String text)
    {
        String answer = "";
        // Simple go backwards through the string and build a new one. In this case it is assumed the string should not be modified in any way
        for (int i = text.length() - 1; i >= 0; i--)
        {
            answer += text.charAt(i);
        }
        return answer;
    }
}
