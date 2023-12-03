package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 * This class implements the methods for calculating sum of all nodes
 */
public class SumOfNodes {
    public static int sumOfAllNode(TreeNode<Integer> root){
		 if (root == null)
            return 0;
		Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();

		q.add(root);
		int sum = root.data;
		while(!q.isEmpty()){
			TreeNode<Integer> front  = q.poll();
			for(int i = 0; i < front.children.size(); i++){
				q.add(front.children.get(i));
				sum += front.children.get(i).data;
			}
		}
        return sum;

	}
}
