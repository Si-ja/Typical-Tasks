package questions.prepare;

public class BinaryTreeReversal
{
    public static void main(String[] args)
    {
        BinaryTreeReversal binaryTreeReversal = new BinaryTreeReversal();
        BinaryTree tree = binaryTreeReversal.generateTree();
        binaryTreeReversal.visualizeTree(tree);
        binaryTreeReversal.reverseTree(tree);
        System.out.println("\n--Reverse--\n");
        binaryTreeReversal.visualizeTree(tree);

    }

    /**
     * This method generates a 3 level deep binary tree with pre-determined numbmers in it.
     * Not in the most efficient manner. But here focus is not on the tree, but the method behind reversing it.
     * @return a prepared version of a BinaryTree
     */
    public BinaryTree generateTree()
    {
        BinaryTree tree = new BinaryTree();
        tree.root = 9;

        tree.left = new BinaryTree();
        tree.left.root = 8;
        tree.right = new BinaryTree();
        tree.right.root = 7;

        tree.left.left = new BinaryTree();
        tree.left.right = new BinaryTree();
        tree.right.left = new BinaryTree();
        tree.right.right = new BinaryTree();

        tree.left.left.root = 6;
        tree.left.right.root = 5;
        tree.right.left.root = 4;
        tree.right.right.root = 3;
        return tree;
    }

    /**
     * For the sake of the example, we can also generate a small preview of the tree as we know what we are working with.
     * Though for scalable solutions this will not really help. Roughly it gets the job done. But we want to focus on the
     * reversal aspect. Generation of scalable and working trees can be a topic of it's own separately.
     */
    public void visualizeTree(BinaryTree tree)
    {
        // Display the first level
        System.out.println("\t" + tree.root);
        System.out.println("   / \\");

        // Display the second level
        System.out.println("  " + tree.left.root + "   " +  tree.right.root);
        System.out.println(" / \\ " + "/ \\");

        // Display the third level
        System.out.println(tree.left.left.root + "  " +  tree.left.right.root + " " + tree.right.left.root + "  " +  tree.right.right.root);
    }

    /**
     * Reversing the tree in a recursive fashion.
     */
    public void reverseTree(BinaryTree tree)
    {
        if (tree == null)
        {
            return;
        }
        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;

        reverseTree(tree.left);
        reverseTree(tree.right);
    }
}

