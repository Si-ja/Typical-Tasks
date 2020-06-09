package questions.prepare;

/**
 * Check if the value presented is something that can be derived by going through values that start
 * from two and go up in the power of two (i.e. 2, 4, 8, 16 and so on)
 */
public class PowerOfTwoValue
{
    public static void main(String[] args)
    {
        System.out.println(assessBase(binaryConversion(42)));  // false
        System.out.println(assessBase(binaryConversion(512))); // true
        System.out.println(assessBase(binaryConversion(2)));   // true
        System.out.println(assessBase(binaryConversion(1)));   // false
        System.out.println(assessBase(binaryConversion(0)));   // true
    }

    /**
     * The tricks is actually very simple. All values that are derived from two to the power of two
     * in binary have a pattern (e.g. 2 = 10, 4 = 100, 8 = 1000 and so on). The pattern is that in
     * binary, each of expected values has the first values = 1 and everything else to 0. So the
     * conversion needs to be done to binary and a check made that first value is 1 and the remaining
     * are zeros. This method does the binary conversion.
     * @param value - value that needs to be evaluated for whether it is in the power two domain
     * @return A binary representation of a value, in a String format.
     */
    private static String binaryConversion(Integer value)
    {
        return Integer.toBinaryString(value);
    }

    /**
     * Assess the binary value, whether value is in the domain derived from the base of 2. This method
     * works with the String as it is easier to assess than with integers, as mathematical operations
     * are not necessary here, but cycle itterations are.
     * @param values a binary representation of a value in a String format.
     * @return
     */
    private static Boolean assessBase(String values)
    {
        if (values.length() <= 1){
            return false;
        }

        Integer amount_of_ones = 0;
        Boolean first_is_one = false;
        for (int i = 0; i < values.length(); i++)
        {
            if (i == 0 && values.charAt(i) == '1')
            {
                first_is_one = true;
            }
            Character temp_char = values.charAt(i);
            amount_of_ones += Integer.parseInt(temp_char.toString());
        }
        return amount_of_ones == 1 && first_is_one ? true : false;
    }
}