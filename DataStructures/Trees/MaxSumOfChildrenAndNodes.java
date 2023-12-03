package DataStructures.Trees;

public class MaxSumOfChildrenAndNodes {
    
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		if(root == null){
			return null;
		}
		// PairSum<Integer> ans = new PairSum(root, root.data);
		return sumHelper(root).root;
		}
	
	
	public static PairSum sumHelper(TreeNode<Integer> root){
		PairSum ans = new PairSum();
		ans.root = root;
		int sum = root.data;
		for(int i =0; i< root.children.size();i++){
			sum += root.children.get(i).data;
		}
		ans.sum = sum;
		for(int i = 0;i < root.children.size(); i++){
			PairSum temp = sumHelper(root.children.get(i));
			if(temp.sum > ans.sum){
				ans.sum = temp.sum;
				ans.root = temp.root;
			}
		}
		return ans;	
	}
}
