package questions.prepare;

public class RiceBagsCapacityBoolean
{
    /**
     * Excercise taken from: https://code-exercises.com/programming/medium/16/package-rice-bags
     * Conditions: Provided that you have a given number of small rice bags (1 kilo each) and big rice bags
     * (5 kilos each), write a method that returns true if it is possible to make a package with
     * goal kilos of rice.
     *
     * Input: (Integer big, Integer small, Integer goal)
     */
    public static void main(String[] args)
    {
        Integer goal1 = 32; Integer small_bag1 = 3; Integer big_bag1 = 5;   // false
        Integer goal2 = 56; Integer small_bag2 = 10; Integer big_bag2 = 3;  // false
        Integer goal3 = 7; Integer small_bag3 = 3; Integer big_bag3 = 1;    // true

        System.out.println("In the first case can we package our rice(?): " + packageRice(big_bag1, small_bag1, goal1));
        System.out.println("In the second case can we package our rice(?): " + packageRice(big_bag2, small_bag2, goal2));
        System.out.println("In the third case can we package our rice(?): " + packageRice(big_bag3, small_bag3, goal3));
    }

    /**
     * Check practically if amount of provided bags that we have are enough to fill the amount
     * in kilos of rice that we want to store. What I see as the easiest solution for this is, to
     * check how much volume we can store with our bags as is, and just see if that's smaller or
     * larger than the goal we have.
     * @param big How many big bags we have (5kg volume)
     * @param small How many small bags we have (1kg volume)
     * @param goal How many kg of rice we need to pack
     * @return a boolean value of whether we have enough bags to sort our rice or not
     */
    public static Boolean packageRice(Integer big, Integer small, Integer goal)
    {
        Integer volume_available = big * 5 + small;
        return volume_available >= goal ? true : false;
    }
}
