package questions.prepare;

public class PiratesCoconutsMonkey
{
    /**
     * The problem:
     *
     * Five men and a monkey were shipwrecked on an island. They spent the first night
     * gathering coconuts. During the night, one man woke up and decided to take his share
     * of the coconuts. He divided them into five piles. One coconut was left over so he gave
     * it to the monkey, then hid his share, put the rest back together, and went back to sleep.
     *
     * Soon a second man woke up and did the same thing. After dividing the coconuts into five
     * piles, one coconut was left over which he gave to the monkey. He then hid his share, put
     * the rest back together, and went back to bed. The third, fourth, and fifth man followed
     * exactly the same procedure. The next morning, after they all woke up, they divided the
     * remaining coconuts into five equal shares. This time no coconuts were left over.
     *
     * How many coconuts were there in the original pile?
     * Source: https://en.wikipedia.org/wiki/The_monkey_and_the_coconuts#:~:text=The%20monkey%20and%20the%20coconuts%20is%20a%20mathematical%20puzzle%20in,the%20original%20pile%20(fractional%20coconuts
     *
     * Problem: create a solver to solve this mathematical problem when the number of pirates varies
     */
    public static void main(String[] args)
    {
        // Don't go over 8. We are talking about insane number there
        Integer pirates = 5;
        System.out.println("For the case of " + pirates + " pirates, the amount of coconuts needs to be equal to: " + countCoconuts(pirates));
    }

    /**
     * Count how many coconuts there are when the number of pirates is known.
     * @param pirates - number of pirates participating.
     * @return coconuts - a number of coconuts present on the island
     */
    public static Integer countCoconuts(Integer pirates)
    {
        // Create trivial questions/solutions
        if (pirates <= 0)
        {
            return 0;
        }
        else if (pirates == 1)
        {
            return 2; // Because we need to account for the monkey
        }
        else
        {
            Integer coconuts = pirates; // Coconuts exist overall
            Boolean solved = false;
            Integer attempt = 1;
            Integer pile = pirates; // Pile exists and shrinks as each next pirate takes from it
            while (attempt <= pirates)
            {
                // Check if by dividing the coconuts among all pirates only 1 will be left
                // But consider that the pile analyzed does not consist of 1 coconut in general
                // As it cannot be futher divided
                if (pile % pirates == 1 && pile != 1)
                {
                    // If the condition is met, then consider how the second pirate will operate
                    // By moving to his actions
                    attempt++;
                    // Do also remove the share of the pirate analyzed initially from the total pile
                    // As the next pirate will be only dividing the pile he sees
                    pile -= (pile / pirates) + 1;
                }
                else
                {
                    // If the condition is not met then increase the pile by one coconut
                    coconuts++;
                    // Reset back the existing pile that could have had something taken from it
                    pile = coconuts;
                    // Go back to the very first pirate that took from the pile and start again
                    attempt = 1;
                    continue;
                }
            }
            return coconuts;
        }
    }
}
