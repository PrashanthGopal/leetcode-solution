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

/*
public List<Integer> inorderTraversal(TreeNode root) {
	List<Integer> res = new LinkedList<Integer>();
	if (root == null) return res;
	
	Stack<TreeNode> stack = new Stack<TreeNode>();
	TreeNode cur = root;
	while (cur != null || !stack.isEmpty()) { 
		while (cur != null) {// Travel to each node's left child, till reach the left leaf
			stack.push(cur);
			cur = cur.left;				
		}		 
		cur = stack.pop(); // Backtrack to higher level node A
		res.add(cur.val);  // Add the node to the result list
		cur = cur.right;   // Switch to A'right branch
	}
	return res;
}

*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }
    public void inorder(TreeNode node, List<Integer> result){
        if(node == null){
            return;
        }
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}
