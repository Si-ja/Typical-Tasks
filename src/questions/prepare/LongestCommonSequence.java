package questions.prepare;

/**
 * Referenced from: https://code-exercises.com/programming/hard/5/longest-common-sequence
 * Task: Given two strings, write a method that finds the longest common sub-sequence.
 */

public class LongestCommonSequence
{
    public static void main(String[] args)
    {
        LongestCommonSequence longestCommonSequence = new LongestCommonSequence();
        String answer = longestCommonSequence.findLongestCommonSequence("abattd", "gdgeaba");
        System.out.println(answer); // returns "aba"
    }

    public String findLongestCommonSequence(String s1, String s2)
    {
        // Can be also done with s2.contains() at the step 2. But I learned that too late...
        // 1. Take the components of one string for as many itterations as we need
        for (int i = s1.length(); i >= 1 ; i--)
        {
            int s1_start = 0;
            int s1_end = i;
            while (s1_end <= s1.length())
            {
                String temp_s1 = s1.substring(s1_start, s1_end);
                // 2. Compare our string to any possible sequential letter combination in string 2
                int s2_size = s1_end - s1_start;
                int s2_start = 0;
                int s2_end = s2_size;
                while (s2_end <= s2.length())
                {
                    String temp_s2 = s2.substring(s2_start, s2_end);
                    Boolean match = temp_s1.matches(temp_s2);
                    if (match)
                    {
                        return temp_s1;
                    }
                    s2_start++;
                    s2_end++;
                }
                s1_start++;
                s1_end++;
            }
        }
        return "";
    }
}


