package questions.prepare;
import java.util.ArrayList;

public class FizzBuzz
{
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
     * Prepare values to adjust
     * @param amount - amount of values in the list to work through
     * @return List of values
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
            String answer = new String();
            answer += value % fizz_con == 0 ? this.fizz : "";
            answer += value % buzz_con == 0 ? this.buzz : "";
            answer += answer.isBlank() ? value.toString() : "";
            System.out.println(answer);
        }
    }
}
