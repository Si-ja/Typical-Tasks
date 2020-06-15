package questions.prepare;

/**
 * Reference: https://code-exercises.com/programming/easy/7/sum-multiples-of-three-and-five
 * The task: Given a number n, write a method that sums all multiples of three and
 *           five up to n (inclusive).
 */

public class MultiplesSum
{
    public static void main(String[] args)
    {
        MultiplesSum multiplesSum = new MultiplesSum();
        System.out.println(multiplesSum.sum(15));
        System.out.println(multiplesSum.sum(0));
        System.out.println(multiplesSum.sum(110));
    }

    /**
     * A method that sums all multiples of 3s and 5s up to the value n.
     * @param n Value up to which summation happens as an Integer
     * @return an Integer value representing the sum of calculations performed in the method
     */
    public Integer sum(Integer n)
    {
        Integer answer = 0;
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                answer += i;
            }
        }
        return answer;
    }
}
