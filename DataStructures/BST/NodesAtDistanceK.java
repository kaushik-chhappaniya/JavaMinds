package DataStructures.BST;

public class NodesAtDistanceK {
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
		printNodes(root, node, k);
	}
	   public static int printNodes(BinaryTreeNode<Integer> root, int node, int k)
	    {if (root==null)
            return -1;
        
        int rootData=root.data;
        if (rootData == node)
        {
            printNodesAtDistanceK(root, k);
            return 0;
        }
        
        int leftSubTreeDist = 0, rightSubTreeDist = 0;
        
        leftSubTreeDist = printNodes(root.left,node,k);
        if (leftSubTreeDist!=-1)
        {
            if(leftSubTreeDist+1==k)
            {
                System.out.println(rootData);
            }
            else
            {
                rightSubTreeDist=k-(leftSubTreeDist+1)-1;
                printNodesAtDistanceK(root.right, rightSubTreeDist);
            }
            return leftSubTreeDist+1;
        }
        
        rightSubTreeDist = printNodes(root.right,node,k);
        if (rightSubTreeDist!=-1)
        {
            if(rightSubTreeDist+1==k)
            {
                System.out.println(rootData);
            }
            else
            {
                leftSubTreeDist=k-(rightSubTreeDist+1)-1;
                printNodesAtDistanceK(root.left, leftSubTreeDist);
            }
            return rightSubTreeDist+1;
        }
        return -1;
    }
    
    public static void printNodesAtDistanceK(BinaryTreeNode<Integer> root, int k)
    {
        if (root==null || k<0)
        	return;
        
        if (k == 0)  
        { 
            System.out.println(root.data); 
            return; 
        }
        
        printNodesAtDistanceK(root.left,k-1);
        printNodesAtDistanceK(root.right,k-1);
    }

}
