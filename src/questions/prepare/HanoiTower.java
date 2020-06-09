package questions.prepare;

/**
 * Class for solving of the Hanoi Tower problem
 */
public class HanoiTower
{
    public static void main(String[] args)
    {
        Hanoi(3, "Left", "Middle", "Right");
    }

    /**
     * Generate an instance of Hanoi tower moving figures. Essentially, it's about the recursive
     * motion that goes into this problem. Consider that there are 3 towers and all of them are utilized
     * when pieces are moved. Do also consider that when there are an even amount of pieces, one type
     * of moves are made, and when odd, a slightly different strategy is utilized. To understand this
     * problem faster, it is really recommended to understand how to move the pieces in the first place.
     * @param n - amount of pieces that the tower has
     * @param _from Initial position from which a certain piece is moved
     * @param _aux an auxilary position through which a certain piece moves
     * @param _to  the final destination to which the piece moves.
     */
    private static void Hanoi(int n, String _from, String _aux, String _to)
    {
        // Consider we need an escape condition
        if (n == 0)
        {
            //Do nothing. There are no more pieces to consider that need to be moved,
            //So we just stop
            return;
        }
        else // If there are pieces left that need to be moved from a certain pillar, then we
             // need to continue with our recursive approach
        {
            // Evaluate what moves need to be made if we want to move the whole stack of pieces
            // before the last piece. The auxilary pillar now becomes the destination one.
            Hanoi(n - 1, _from, _to, _aux);
            printMove(_from, _to);
            // Then we are moving the stack that we moved from the auxilary position as it is located
            // Now in that spot, to the destination
            Hanoi(n - 1, _aux, _from, _to);
        }
    }

    /**
     * We want to visualize how the pieces move over time. Even though there are 3 pillars,
     * the pieces can only move from one pillar to another. This is what we want print.
     * @param _from what pillar does the piece move from originally
     * @param _to what pillar the piece moves to originally
     */
    private static void printMove(String _from, String _to)
    {
        System.out.println("Move the piece from the " + _from + " tower to the " + _to + " tower.");
    }
}
