package questions.prepare;

/**
 * Simple class that tries to immitate a very simple structure of a binarry tree, where there is a root node and a
 * left and right nodes. The left and the right nodes are treated as their own root nodes to the further following
 * tree structure. In this example, the class just needs to be stacked and re-stacked to build a deeper tree. This is
 * at most basic form the tree can be made into.
 */
public class BinaryTree
{
    public Integer root;
    public BinaryTree left;
    public BinaryTree right;
}
