/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    Queue<TreeNode> bstTree;
    public BSTIterator(TreeNode root) {
        bstTree = new LinkedList<>();
        buildTree(root);
    }
    
    public int next() {
        TreeNode node = bstTree.poll();
        return node.val;
    }
    
    public boolean hasNext() {
        return !bstTree.isEmpty();
    }
    
    public void buildTree(TreeNode root){
        if(root == null){
            return;
        }
        buildTree(root.left);
        bstTree.offer(root);
        buildTree(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */