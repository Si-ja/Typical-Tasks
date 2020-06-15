package questions.prepare;

/* Simply implement a method that sums 2 numbers together
 * Referenced from: https://code-exercises.com/programming/easy/1/sum-of-two-numbers
 */
public class NumbersSum
{
    public static void main(String[] args)
    {
        NumbersSum numbersSum = new NumbersSum();
        System.out.println(numbersSum.sum(40, 2));
        System.out.println(numbersSum.sum(10000, 20000));
    }

    /**
     * Method that sums 2 integer numbers together.
     * @param i an Integer value
     * @param j an Integer value
     * @return a sum in a form of an Integer value
     */
    public Integer sum(Integer i, Integer j)
    {
        return i + j;
    }
}
