package questions.prepare;

/**
 * Reference: https://code-exercises.com/programming/easy/13/linear-search
 * Problem: Write a method that returns the index of the first occurrence of given integer in a list.
 * Assume that the index of the first element in the list is zero.
 * If the number does not exist return -1.
 */

public class LinearSearch
{
    public static void main(String[] args)
    {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] list = {3, 1, 3, 2, 6, 9, 7, 6};
        System.out.println(linearSearch.search(6, list));
    }

    public int search(Integer n, Integer[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].equals(n))
            {
                return i;
            }
        }
        return -1;
    }
}
