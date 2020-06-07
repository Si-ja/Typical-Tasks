package questions.prepare;
import java.util.ArrayList;

public class FizzBuzz
{
    // Created words that we want to be displayed instead of particular dividable values without a remainder in a particular sequence of integers
    private String fizz = "Fizz";
    private Integer fizz_con = 3;

    private String buzz = "Buzz";
    private Integer buzz_con = 5;

    public static void main(String[] args)
    {
        FizzBuzz fizzbuzz = new FizzBuzz();
        ArrayList<Integer> values = fizzbuzz.generateNumbers(100);
        fizzbuzz.adjustList(values);
    }

    /**
     * Prepare a list of values that will have to be replaced in the FizzBuzz task
     * @param amount - amount of values in the list to work through
     * @return List of generated integer values
     */
    public ArrayList<Integer> generateNumbers(int amount)
    {
        ArrayList<Integer> values = new ArrayList<Integer>(amount);
        for (int i = 1; i <= amount; i++)
        {
            values.add(i);
        }
        return values;
    }

    /**
     * Adjust values to FizzBuzz standards
     * @param values - values list to transform
     */
    public void adjustList(ArrayList<Integer> values)
    {
        for (Integer value : values)
        {
            // Everything is build into a single string of information
            String answer = new String();
            answer += value % fizz_con == 0 ? this.fizz : "";
            answer += value % buzz_con == 0 ? this.buzz : "";
            // In the condition that a value cannot be replaced with the word Fizz, Buzz or FizzBuzz, a value is displayed
            answer += answer.isBlank() ? value.toString() : "";
            System.out.println(answer);
        }
    }
}
