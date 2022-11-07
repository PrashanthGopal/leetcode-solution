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
class Solution {
    Integer prevVal = null;
    Integer min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return min;
        }
        
        getMinimumDifference(root.left);
        if(prevVal != null){
            int minVal = root.val - prevVal;
            min = Math.min(minVal, min);
        }
        
        
        prevVal = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    }
}