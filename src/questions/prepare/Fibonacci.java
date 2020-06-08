package questions.prepare;
import java.util.ArrayList;

/**
 * Produce and print the Fibonacci sequence
 */
public class Fibonacci
{
    public static void main(String[] args)
    {
        // Keeping this as a reference point:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610 (16 numbers of the Fibonacci sequence)
        ArrayList<Integer> sequence = generateSequence(5);
        displaySequence(sequence);

        // Or the execution can happen in a more compact way
        displaySequence(generateSequence(10));
        displaySequence(generateSequence(15));
    }

    /**
     * A method that generates a sequence of Fibonacci numbers to a certain amount
     * @param amount how many values we wish to be generated
     * @return The ArrayList of Fibonacci values
     */
    public static ArrayList<Integer> generateSequence(Integer amount)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        Integer value_0 = 0;
        Integer value_1 = 1;

        // Create couple of fail check conditions, if the user provides an amount value of less than 2
        if (amount == 0)
        {
            output.add(value_0);
            return output;
        }
        else if (amount == 1)
        {
            output.add(value_0);
            output.add(value_1);
            return output;
        }
        else if (amount < 0)
        {
            return output;
        }
        else
        {
            // Build a list with Fibonacci values if the user passes a value larger than 2
            for (int i = 0; i < amount; i++)
            {
                if (i == 0)
                {
                    output.add(value_0);
                }
                else if (i == 1)
                {
                    output.add(value_1);
                }
                else
                {
                    Integer temp_value = value_1;
                    value_1 += value_0;
                    value_0 = temp_value;
                    output.add(value_1);
                }
            }
        }
        return output;
    }

    /**
     * Method allowing to display the sequence of values in the array list.
     * @param values - ArrayList of generated values for the Fibonacci sequence
     */
    public static void displaySequence(ArrayList<Integer> values)
    {
        System.out.print("First " + values.size() + " values of the Fibonacci sequence are: ");
        for (Integer value : values)
        {
            System.out.print(value.toString() + ", ");
        }
        System.out.println();
    }
}
