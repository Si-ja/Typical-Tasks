package questions.prepare;

/**
 * References: https://code-exercises.com/programming/easy/10/factorial
 * Write a method that calculates the factorial of a given number.
 * Factorial is the product of all positive integers less than or equal to n.
 * For example, factorial(4) = 4x3x2x1 = 24.
 * TIP: To make it more interesting, try to do it recursively.
 */
public class Factorial
{
    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(3));
        System.out.println(factorial.factorial(10));
    }

    /**
     * Method that in a recursive fashion delivers a factorial of the number n
     * @param n an Integer value of which the factorial is being searched
     * @return an answer what is a factorial of the value n as an Integer
     */
    public Integer factorial(Integer n)
    {
        Integer answer = 1;
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
}
