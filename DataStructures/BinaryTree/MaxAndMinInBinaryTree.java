package DataStructures.BinaryTree;
	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}
	}

public class MaxAndMinInBinaryTree {

    private static Pair<Integer,Integer> maxMin=new Pair<Integer,Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);

	/**
	 * 
	 * @param root
	 * @return Maximum and minimum of the binary tree
	 */
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		getMinMaxhelper(root);
		return maxMin;
	}

	public static void  getMinMaxhelper(BinaryTreeNode<Integer> root){								
			 if (root==null)
            return;
		int rootData=root.data;
        int maxVal=maxMin.maximum;
        if (rootData>maxVal)
            maxMin.maximum=root.data;
        
        int minVal=maxMin.minimum;
        if (rootData<minVal)
            maxMin.minimum=root.data;
        getMinMaxhelper(root.left);
        getMinMaxhelper(root.right);
    }
	
}
