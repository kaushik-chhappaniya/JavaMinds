package DataStructures.Trees;

import java.util.ArrayList;

public class FindHeight {
    
	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(root == null)
		 return 0;
		 ArrayList<TreeNode<Integer>> rootChildren = root.children;
		 int count = 0;
		 for(int i = 0; i< rootChildren.size();i++){
			 count = Math.max(count, getHeight(rootChildren.get(i)));
		 }
		 return count + 1;
	}

}
