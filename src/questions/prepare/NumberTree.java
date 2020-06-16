package questions.prepare;

/**
 * Draw a number tree with n levels. Each level number should be represented with it's own value.
 */

public class NumberTree
{
    public static void main(String[] args)
    {
        // Number of digits have been accounted. So no visual issues should occur, no matter
        // How many digits each level has
        drawTree(100);
    }

    /**
     * Draw a value you tree of n levels
     * @param n - amount of levels in integers that need to be drawn
     */
    public static void drawTree(Integer n)
    {
        // If the uer wants a tree with 0 or less levels, then we return nothing
        // Such trees do not exist in our task.
        if (n <= 0)
        {
            return;
        }
        // We want to acocunt for spaces between values
        String space = " ";
        Integer max_digits = amountOfDigits(n);
        Integer digits_accountability = max_digits - 1; // Different amount of levels require a different
                                                        // amount of spaces to account for

        // Itterate through each level
        for (Integer i = 0; i < n; i++)
        {
            // Add as many spaces as backwards proportionally needed to the level we are accessing
            Integer backwards_i = n - 1;
            while (backwards_i > i)
            {
                for (int j = 1; j <= max_digits; j++)
                {
                    System.out.print(space);
                }
                backwards_i--;
            }
            // Print as many value representing the level as needed
            for (int j = 1; j <= i + 1; j++)
            {
                System.out.print((i + 1));
                Integer current_value_digits = amountOfDigits(i + 1);
                for (int k = current_value_digits; k <= max_digits + digits_accountability; k++)
                {
                    System.out.print(space);
                }
            }
            // Go to the new line and repeat the process
            System.out.print("\n");
        }
    }

    /**
     * Check amount of digits in an integer value
     * @param value some value that needs to be analyzed for amount of digits it holds
     * @return amount of digits the value has (Integer)
     */
    public static Integer amountOfDigits(Integer value)
    {
        Integer answer = 0;
        while(value != 0)
        {
            value /= 10;
            answer++;
        }
        return answer;
    }
}
