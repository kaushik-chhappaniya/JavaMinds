package DataStructures.Trees;

public class SecondLargestElement {
    
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
		return findHelper(root).second;

	}

	private static Pair<TreeNode<Integer>> findHelper(TreeNode<Integer> root){
        if(root == null)
			return new Pair<TreeNode<Integer>>(null, null);
    
        Pair<TreeNode<Integer>> output = new Pair<TreeNode<Integer>>(root,null);
        for(TreeNode<Integer> node : root.children){
            Pair<TreeNode<Integer>> child = findHelper(node);
            if(child.first.data > output.first.data){
                if(child.second==null || child.second.data < output.first.data){
                    output.second = output.first;
                    output.first = child.first;
				}else{
					output.first = child.first;
					output.second = child.second;
				}
			} else if(child.first.data.equals(output.first.data) && child.second != null)
				output.second = child.second;
			else if(output.first.data != child.first.data && (output.second == null || child.first.data > output.second.data))
				output.second = child.first;
	}
	
	return output;
}

}

class Pair<T>{
	T first;
	T second;
	Pair(T first, T second){
		this.first = first;
		this.second = second;
	}
}