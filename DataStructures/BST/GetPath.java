package DataStructures.BST;

import java.util.ArrayList;

public class GetPath {
    

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int x){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/  if(root == null){ return null;}
        if(root.data == x){
            ArrayList<Integer> result = new ArrayList<Integer>();
            result.add(root.data);
            return result;
        }
        ArrayList<Integer> leftOutput = getPath(root.left, x);
        if(leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
    }
        ArrayList<Integer> rightOutput = getPath(root.right, x);
        if(rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;
    
	}
}
