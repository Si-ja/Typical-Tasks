package questions.prepare;

import java.util.ArrayList;
import java.util.List;

/**
 * Reference: https://code-exercises.com/programming/easy/21/convert-to-upper-case-java-8-lambdas-and-streams
 * Requirement: Write a method that converts all strings in a list to their upper case.
 */
public class ToUpperCaseConversion
{
    public static void main(String[] args)
    {
        ToUpperCaseConversion toUpperCaseConversion = new ToUpperCaseConversion();
        List<String> list = new ArrayList<String>();
        list.add("This is an example");
        list.add("wow");
        System.out.println(toUpperCaseConversion.upperCase(list));
    }

    /**
     * Convert information in the string to all UpperCase letters
     * @param list
     * @return
     */
    public List<String> upperCase(List<String> list)
    {
        List<String> answer = new ArrayList<String>();
        for (String text : list)
        {
            answer.add(text.toUpperCase());
        }
        return answer;
    }

}
