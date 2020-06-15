package questions.prepare;
import java.util.ArrayList;
import java.util.List;

/**
 * Reference: https://code-exercises.com/programming/easy/20/average-value-java-8-lambdas-and-streams
 * Write a method that returns the average of a list of integers.
 */

public class AverageValue
{
    public static void main(String[] args)
    {
        AverageValue averageValue = new AverageValue();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(100);
        System.out.println(averageValue.average(list));
        System.out.println(averageValue.average2(list));
    }

    public Double average(List<Integer> list)
    {
        Double accumulator = 0.0;
        for (int i = 0; i < list.size(); i++)
        {
            accumulator += list.get(i);
        }
        return accumulator / list.size();
    }

    // Method suggested for Java 8 by the website from which the task has been taken
    public Double average2(List<Integer> list)
    {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}
