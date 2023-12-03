package DataStructures.BinaryTree;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
public class NodesWithoutSiblings {
    /**
     * Prints nodes without siblings.
     * @param root
     */
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if(root == null) return;
        if(root.left != null && root.right == null)
            System.out.print(root.left.data + " ");
        if(root.left == null && root.right != null)
            System.out.print(root.right.data + " ");
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }
}
