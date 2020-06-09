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
        Integer N = 30;
        String phrase1 = "Hello There";
        String phrase2 = "Can anyone wield such power";
        System.out.println("Coding phrase [" + phrase1 + "] with " + N + " rotation gives: [" + ceaserCipher.coder(phrase1, N) + "] and back -> [" + ceaserCipher.decode(ceaserCipher.coder(phrase1, N), N) + "]");
        System.out.println("Coding phrase [" + phrase2 + "] with " + N + " rotation gives: [" + ceaserCipher.coder(phrase2, N) + "] and back -> [" + ceaserCipher.decode(ceaserCipher.coder(phrase2, N), N) + "]");
    }

    /**
     * Implement the decoder of the coded sentences
     * @param code String of information that needs to be decoded
     * @param rotation a rotation in the Cipher algorithm
     * @return the sentence that was encoded
     */
    private String decode(String code, Integer rotation)
    {
        String decode = "";
        for (int i = 0; i < code.length(); i++)
        {
            int to_uncipher = 0;
            int letter_int = (int) code.toLowerCase().charAt(i);
            if (letter_int == SPACE)
            {
                decode += " ";
                continue;
            }
            if (rotation <= letter_int - this.LETTER_A)
            {
                to_uncipher += letter_int - rotation;
                decode += String.valueOf((char) to_uncipher);
            }
            else
            {
                int letters_range = this.LETTER_Z - this.LETTER_A + 1;
                int decrease_current_rot = rotation - (letter_int - this.LETTER_A);
                int range_ramainder = this.LETTER_Z - (decrease_current_rot % letters_range) + 1;
                if (range_ramainder > this.LETTER_Z)
                {
                    to_uncipher = this.LETTER_A;
                }
                else
                {
                    to_uncipher = range_ramainder;
                }
                decode += String.valueOf((char) to_uncipher);
            }

        }
        return decode;
    }

    /**
     * It only seems fitting for me to implement the encoder as well. Otherwise, honestly
     * what is the point and how will you check properly the decoder.
     * @param text String of text that you want to encode with Ceaser Cipher
     * @param rotation an Integer value in the rotation cycle for Ciphering
     * @return an encoded String of text
     */
    private String coder(String text, Integer rotation)
    {
        String encoded = "";
        for (int i = 0; i < text.length(); i++)
        {
            int to_cipher = 0;
            int letter_int = (int) text.toLowerCase().charAt(i);
            if (letter_int == SPACE)
            {
                encoded += " ";
                continue;
            }
            if (rotation <= this.LETTER_Z - letter_int)
            {
                to_cipher = letter_int + rotation;
                encoded += String.valueOf((char) to_cipher);
            }
            else {
                int letters_range = this.LETTER_Z - this.LETTER_A + 1;
                int decrease_current_rot = rotation - (this.LETTER_Z - letter_int);
                int range_ramainder = this.LETTER_A + (decrease_current_rot % letters_range) - 1;
                to_cipher = range_ramainder;
                encoded += String.valueOf((char) to_cipher);
            }
        }

        return encoded;
    }
}
