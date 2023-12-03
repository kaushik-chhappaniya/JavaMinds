package DataStructures.BST;
/**
 * @author Kaushik Chhappaniya
 *
 * @email kkcanr@gmail.com
 */
/*
 * Implements the BST class consisting of methods for insert, remove, search and print.
 */
public class BSTClass {

        private BinaryTreeNode<Integer> root;
        private int size;
        
        public void insert(int data) {
            //Implement the insert() function
            root =  insertHelper(root, data);
            size++;
        }

        /**
         * @logic - recusively insert until the data is just >= or < to the root.data. Insertion will always takes place at the end.
         * @param root
         * @param data
         * @return node of the tree
         */
        private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
            if(root == null) {
                BinaryTreeNode<Integer> newRoot = new BinaryTreeNode<Integer>(data);
                return newRoot;
            }
            if( data>= root.data)
                root.right = insertHelper(root.right, data);
            else
                root.left = insertHelper(root.left, data);
            return root;
        }
        
        public void remove(int data) {
            //Implement the remove() function
            BSTDeleteReturns output = removeHelper(root, data);
            root = output.root;
            if(output.isDeleted){
                size--;
            }
        }

        /**
         * @logic :Remove and attach the largest element of that subtree
         * case 1 - 0 children present - return null
         * case 2 - left children present - remove x and return left subtree connected to root
         * case 3 - right children present - remove x and return right subtree connected to root
         * case 4 - Both children present - remove x and return left subtree and right with the largest
         *                                  elemtent on the right side and connect both to the root
         * @param root
         * @param x
         * @return class BSTDeleteReturns - returns the boolean isDeleted and the BSTnode
         */
        private static BSTDeleteReturns removeHelper(BinaryTreeNode<Integer> root, int x){
            if(root == null)
                return new BSTDeleteReturns(null,false);
            if(root.data < x){ // Connect the right subtree
                BSTDeleteReturns outputRight = removeHelper(root.right, x);
                root.right = outputRight.root;
                outputRight.root = root;
                return outputRight;
            }
            if(root.data > x){ // Connect the left subtree
                BSTDeleteReturns outputLeft = removeHelper(root.left, x);
                root.left = outputLeft.root;
                outputLeft.root = root;
                return outputLeft;
                }

            // 0 children
            if(root.left == null && root.right == null)
                return new BSTDeleteReturns(null, true);
            //Only left children
            if(root.left != null && root.right == null)
                return new BSTDeleteReturns(root.left, true);
            // Only right children
            if(root.left == null && root.right != null)
                return new BSTDeleteReturns(root.right, true);
            
            // Both children are present
            int rightMax = maximum(root.right);
            root.data = rightMax;
            BSTDeleteReturns outputRight = removeHelper(root.right, rightMax);
            root.right = outputRight.root;
            return new BSTDeleteReturns(root, true);
        }
        
        private static int maximum(BinaryTreeNode<Integer> root){
            if (root == null) return Integer.MIN_VALUE;
            int leftMax = maximum(root.left);
            int rightMax = maximum(root.right);
            return Math.max(root.data, Math.max(leftMax, rightMax));
            }

        public void printTree() {
            //Implement the printTree() function
            printHelper(root);
        }
        
        /**
         * @logic : call recusively until it reaches the leaf.
         * base case- if null print data, if left null print right data
         * @param root
         */
        private static void printHelper(BinaryTreeNode<Integer> root) {
            if(root == null) return;
            System.out.print(root.data + " ");
            if(root.left != null) 
            System.out.print("L:" + root.left.data + ", ");
            if(root.right != null) 
            System.out.print("R: " + root.right.data );
            System.out.println();
            printHelper(root.left);
            printHelper(root.right);
        }

        public boolean search(int data) {
            //Implement the search() function
            return isPresent(root, data);
        }

        /**
         * @logic : if root.data == x return true, else return false. if > data call root.right
         * @param root
         * @param data
         * @return
         */
        private boolean isPresent(BinaryTreeNode<Integer> root, int data) {
            if(root == null) return false;
            if(root.data == data) return true;
            if(root.data < data)
                return isPresent(root.right, data);
            else   
                return isPresent(root.left, data);
        
    }
}

/*
 *Clas to return the BST node and booleas is BST same time.  
 */
public class BSTDeleteReturns{
    BinaryTreeNode<Integer> root;
    boolean isDeleted;

    public BSTDeleteReturns(BinaryTreeNode<Integer> root, boolean isDeleted){
        this.root = root;
        this.isDeleted = isDeleted;
    }
}