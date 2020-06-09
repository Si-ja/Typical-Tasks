package questions.prepare;

/**
 * Check how many nodes does the tree that is being worked on has. Here effectivness of creating
 * trees is not considered, only evaluation of existing nodes in them.
 */
public class TreeNodes
{
    public static void main(String[] args)
    {
        BinaryTree binaryTree = generateBinaryTree();
        BinaryTree alternativeTree = generateAlternativeTree();

        System.out.println("There are " + countActiveNodes(binaryTree) + " nodes in the Binary 3 level tree.");
        System.out.println("There are " + countActiveNodes(alternativeTree) + " nodes in the AlternativeBinary 3 level tree.");
    }

    /**
     * Produce a Binary tree with 3 levels (i.e. 7 active nodes)
     * @return a BinaryTree instance
     */
    private static BinaryTree generateBinaryTree()
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
     * Generate an alternative version of a binary tree, where there are 3 levels,
     * but only 4 active nodes.
     * @return an alteation of a BinaryTree instance
     */
    private static BinaryTree generateAlternativeTree()
    {
        BinaryTree tree = new BinaryTree();
        tree.root = 55;

        tree.left = new BinaryTree();
        tree.left.root = 100;

        tree.left.left = new BinaryTree();
        tree.left.left.root = -1;
        tree.left.right = new BinaryTree();
        tree.left.right.root = -60;

        return tree;
    }

    /**
     * Count amount of active nodes in the tree. Which is performed using the recursive approach.
     * Basically, node can be populated if node in it exists, as we have a condition that root
     * of the tree, which is an individual node, must exist for the node to exist.
     * @param tree - a tree with nodes that needs to be evaluated
     * @return an Integer value of how many tree nodes actually have values in them
     */
    private static Integer countActiveNodes(BinaryTree tree)
    {
        if (tree == null)
        {
            return 0;
        }
        else
        {
            return 1 + countActiveNodes(tree.left) + countActiveNodes(tree.right);
        }
    }


}
