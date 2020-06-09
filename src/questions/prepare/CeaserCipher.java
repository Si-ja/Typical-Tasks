package questions.prepare;

/**
 * Excercise taken from: https://code-exercises.com/programming/medium/23/ceasar-cipher
 * Concept: The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely
 * communicate with his generals. Each letter is replaced by another letter N positions down the
 * english alphabet. For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'.
 * In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
 * Implement a decoder for the Ceasar cipher where N = 5.
 *
 * Re-looking at it now, I see how it can be improved with while loops, since in the decoder part
 * there is one weird correction that needs to be done, when 'a' character is not displayed
 * TODO: potentially fix with the while loops.
 */
public class CeaserCipher
{
    // To keep track of where the rotation needs to happen we can prepare variable beforehand
    private final int LETTER_A = (int) 'a';
    private final int LETTER_Z = (int) 'z';
    private final int SPACE = (int) ' ';

    public static void main(String[] args)
    {
        CeaserCipher ceaserCipher = new CeaserCipher();
        Integer N = 55;
        String phrase1 = "Hello There";
        String phrase2 = "Can anyone wield such power";
        System.out.println("Coding phrase [" + phrase1 + "] with " + N + " rotation gives: [" + ceaserCipher.cipher(phrase1, N) + "] and back -> [" + ceaserCipher.cipher(ceaserCipher.cipher(phrase1, N), -N) + "]");
        System.out.println("Coding phrase [" + phrase2 + "] with " + N + " rotation gives: [" + ceaserCipher.cipher(phrase2, N) + "] and back -> [" + ceaserCipher.cipher(ceaserCipher.cipher(phrase2, N), -N) + "]");
    }

    /**
     * Cipher that encodes information backwards and forwards
     * @param text something that you want to encode or decode
     * @param rotation the key value you must know to decide into which direction would the
     *                 letters be rotated in the alphabet
     * @return the encoded or decoded message
     */
    public String cipher(String text, Integer rotation)
    {
        String message = "";
        // Bring the rotation into the range we can operate with
        int operational_range = this.LETTER_Z - this.LETTER_A + 1;
        int rotation_abs = Math.abs(rotation);
        while (rotation_abs > operational_range)
        {
            rotation_abs -= operational_range;
        }
        // When we decrease the range, we know that we are moving inside of only one alphabet distance
        for (int i = 0; i < text.length(); i++)
        {
            int to_cipher = 0;
            int letter_int = (int) text.toLowerCase().charAt(i);
            // If it is a space, it is a special case that needs to be maintained
            if (letter_int == SPACE)
            {
                message += " ";
                continue;
            }
            // If the value increases, check if the increase is possible, otherwise adjust for it
            if (rotation < 0)
            {
                if (letter_int - rotation_abs >= this.LETTER_A )
                {
                    to_cipher = letter_int - rotation_abs;
                    message += String.valueOf((char) to_cipher);
                }
                else
                {
                    to_cipher = this.LETTER_Z - (this.LETTER_A - (letter_int - rotation_abs) - 1);
                    message += String.valueOf((char) to_cipher);
                }
            }
            else
            {
                if (letter_int + rotation_abs <= this.LETTER_Z)
                {
                    to_cipher = letter_int + rotation_abs;
                    message += String.valueOf((char) to_cipher);
                }
                else
                {
                    to_cipher = this.LETTER_A + (letter_int + rotation_abs) - this.LETTER_Z - 1;
                    message += String.valueOf((char) to_cipher);
                }
            }
        }
        return message;
    }
}
