package questions.prepare;

public class RiceBagsCapacityInteger
{
    /**
     * Excercise taken from: https://code-exercises.com/programming/hard/17/package-rice-bags-part-2
     * Conditions: Provided that you have a given number of small rice bags (1 kilo each) and big rice
     * bags (5 kilos each), write a method that returns the minimum number of small bags necessary
     * to package goal kilos of rice. Return -1 if it is not possible to package the required rice
     * amount with the bags provided.
     *
     * Input: (Integer big, Integer small, Integer goal)
     */
    public static void main(String[] args)
    {
        Integer goal1 = 32; Integer small_bag1 = 3; Integer big_bag1 = 5;   // -1
        Integer goal2 = 56; Integer small_bag2 = 10; Integer big_bag2 = 3;  // -1
        Integer goal3 = 8; Integer small_bag3 = 3; Integer big_bag3 = 1;    // 3

        System.out.println("Amount of small bags of rice we need to fill the order in case 1: " + getNumberSmallBags(big_bag1, small_bag1, goal1));
        System.out.println("Amount of small bags of rice we need to fill the order in case 2: " + getNumberSmallBags(big_bag2, small_bag2, goal2));
        System.out.println("Amount of small bags of rice we need to fill the order in case 3: " + getNumberSmallBags(big_bag3, small_bag3, goal3));

    }

    /**
     * Check how many small rice bags we need to fill the requirement to meet the goal
     * of filling every bag we have with rice. I assume the easiest way is to just check
     * of whether the big bags do not already cover the task at hand and then whether the
     * amout of small bags is enough to fill the requirement we have.
     * @param big How many big bags we have (5kg volume)
     * @param small How many small bags we have (1kg volume)
     * @param goal How many kg of rice we need to pack
     * @return an integer value of how many small rice bags we need to fulfil our requirements
     */
    public static Integer getNumberSmallBags(Integer big, Integer small, Integer goal)
    {
        Integer volume_remaining = goal - big * 5;
        return volume_remaining > small ? -1 : goal - big * 5;
    }
}
