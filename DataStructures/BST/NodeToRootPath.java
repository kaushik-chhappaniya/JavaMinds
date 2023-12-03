package DataStructures.BST;

import java.util.ArrayList;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This class implements the path from a given node to the root of the tree
 */
public class NodeToRootPath{
    /**
     * @logic Create arraylist and if data =x add to result. Call on left and right. create arraylist left-op
     *  and if root!=null add it to left-op and return left-op same for right side
     * @param root
     * @param x
     * @return
     */
    public static ArrayList<Integer> nodetoRootPath(BinaryTreeNode<Integer> root, int x){
        if(root == null){ return null;}
        if(root.data == x){
            ArrayList<Integer> result = new ArrayList<Integer>();
            result.add(root.data);
            return result;
        }
        ArrayList<Integer> leftOutput = nodetoRootPath(root.left, x);
        if(leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
    }
        ArrayList<Integer> rightOutput = nodetoRootPath(root.right, x);
        if(rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    }
}


