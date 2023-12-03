package DataStructures.BST;
import java.util.*;


public class MergeTwoBST {

    public static void printMergeTrees(BinaryTreeNode<Integer> root1,	BinaryTreeNode<Integer> root2) {
		ArrayList<Integer> temp1 = new ArrayList<>();
		storeInOrder(root1, temp1);
		ArrayList<Integer> temp2 = new ArrayList<>();
		storeInOrder(root2, temp2);
		ArrayList<Integer> ans = merge(temp1, temp2);
		BinaryTreeNode<Integer> result = SortedArrayToBST(ans,  ans.size(), 0, ans.size()-1);
		printTree(result);
	}
		private static void printTree(BinaryTreeNode<Integer> root) {
			// System.out.println("In print tree method");
			if (root == null) return;
			printTree(root.left);
			System.out.print(root.data + " ");
			printTree(root.right);
		}
		private static BinaryTreeNode<Integer> SortedArrayToBST(ArrayList<Integer> arr, int n, int start, int end){
			// System.out.println("In sorted array to bst method");
			if(start > end){return null;}
			int mid = (start+end)/2;
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr.get(mid));
			root.left = SortedArrayToBST(arr, n, start, mid-1);
			root.right = SortedArrayToBST(arr,n, mid+1, end);
			return root;
		} 
        private static ArrayList<Integer> merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		// System.out.println("In merge method");
            int arr1size = arr1.size();
            int arr2size = arr2.size();
            ArrayList<Integer> ans = new ArrayList<>();
            int i = 0, j = 0;
            while (i < arr1size && j < arr2size) {
                if (arr1.get(i) < arr2.get(j)) {
                    ans.add(arr1.get(i));
                    i++;
                } else {
                    ans.add(arr2.get(j));
                    j++;
                }
            }
            while (i < arr1size) {
                ans.add(arr1.get(i));
                i++;
            }
            while (j < arr2size) {
                ans.add(arr2.get(j));
                j++;
            }
            return ans;
        }
            
	private static void storeInOrder(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
		// System.out.println("In storeInOrder method");
		if(root != null) {
			storeInOrder(root.left, arr);
			arr.add(root.data);
			storeInOrder(root.right, arr);
		}
    }
}

