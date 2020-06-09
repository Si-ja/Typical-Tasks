package questions.prepare;

/**
 * Check if the value is a prime number. Prime numbers are ones that can be divided by 1 and themselves
 * ONLY!
 */
public class PrimeNumber
{
    public static void main(String[] args)
    {
        System.out.println(checkPrime(10));   // false
        System.out.println(checkPrime(31.0)); // true
    }

    /**
     * Checking if any value is prime just requires to check if it perfectly divides
     * by any number that is not 1 or itself, without any remainders. Naturally, it only
     * makes sense to check if the value divides by anything that is half of it, because
     * beyond that there are no logical sense to check other values (i.e. consider dividing 10
     * by 5, would yield 2, but anything 5+ would yield a value that has a remainder, meaning
     * it cannot be divided perfectly in that range.
     * @param value value that we want to check on whether it is prime. This makes sense to be
     *              done only for integers. But we want to give users flexability and we will just
     *              allow for overloading by making several methods for this.
     * @return boolean value verifying whether a value is prime or not
     */
    private static Boolean checkPrime(Integer value)
    {
        // Do make a check, as if the value is smaller than 2, then it is not prime.
        if (value < 2)
        {
            return false;
        }
        // We will have to divide the value, so smart to type cast it into a float,
        // to allow for division operations, but also to save a bit on memory by not
        // turning it into a double that allows for a higher percision, but in our case
        // that is irrelevant
        Float evaluate_value = value.floatValue();
        for (int i = 2; i <= evaluate_value/2; i++)
        {
            // if there is no remainder after the division, then the value is prime
            if (evaluate_value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checking if any value is prime just requires to check if it perfectly divides
     * by any number that is not 1 or itself, without any remainders. Naturally, it only
     * makes sense to check if the value divides by anything that is half of it, because
     * beyond that there are no logical sense to check other values (i.e. consider dividing 10
     * by 5, would yield 2, but anything 5+ would yield a value that has a remainder, meaning
     * it cannot be divided perfectly in that range.
     * @param value value that we want to check on whether it is prime. This makes sense to be
     *              done only for integers. But we want to give users flexability and we will just
     *              allow for overloading by making several methods for this.
     * @return boolean value verifying whether a value is prime or not
     */
    private static Boolean checkPrime(Float value)
    {
        // Do make a check, as if the value is smaller than 2, then it is not prime.
        if (value < 2)
        {
            return false;
        }
        // We will have to divide the value, so smart to type cast it into a float,
        // to allow for division operations, but also to save a bit on memory by not
        // turning it into a double that allows for a higher percision, but in our case
        // that is irrelevant
        Float evaluate_value = value;
        for (int i = 2; i <= evaluate_value/2; i++)
        {
            // if there is no remainder after the division, then the value is prime
            if (evaluate_value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checking if any value is prime just requires to check if it perfectly divides
     * by any number that is not 1 or itself, without any remainders. Naturally, it only
     * makes sense to check if the value divides by anything that is half of it, because
     * beyond that there are no logical sense to check other values (i.e. consider dividing 10
     * by 5, would yield 2, but anything 5+ would yield a value that has a remainder, meaning
     * it cannot be divided perfectly in that range.
     * @param value value that we want to check on whether it is prime. This makes sense to be
     *              done only for integers. But we want to give users flexability and we will just
     *              allow for overloading by making several methods for this.
     * @return boolean value verifying whether a value is prime or not
     */
    private static Boolean checkPrime(Double value)
    {
        // Do make a check, as if the value is smaller than 2, then it is not prime.
        if (value < 2)
        {
            return false;
        }
        // We will have to divide the value, so smart to type cast it into a float,
        // to allow for division operations, but also to save a bit on memory by not
        // turning it into a double that allows for a higher percision, but in our case
        // that is irrelevant
        Float evaluate_value = value.floatValue();
        for (int i = 2; i <= evaluate_value/2; i++)
        {
            // if there is no remainder after the division, then the value is prime
            if (evaluate_value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
