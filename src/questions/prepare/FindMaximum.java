package questions.prepare;

/**
 * Reference: https://code-exercises.com/programming/easy/18/find-maximum
 * Write a method that returns the largest integer in the list.
 * You can assume that the list has at least one element.
 */
public class FindMaximum
{
    public static void main(String[] args)
    {
        FindMaximum findMaximum = new FindMaximum();
        Integer[] list = {1, 2, 3, 4, 5};
        System.out.println(findMaximum.maximum(list));
    }

    public Integer maximum(Integer[] list)
    {
        int max = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] > max)
            {
                max = list[i];
            }
        }
        return max;
    }
}
