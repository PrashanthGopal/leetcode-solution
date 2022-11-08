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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return new TreeNode();
        }
        
        return createBST(0, nums.length-1, nums);
    }
    
    private TreeNode createBST(int start, int end, int[] nums){
        if(start <= end){
            int mid = (start + end ) / 2;
            
            TreeNode node = new TreeNode(nums[mid]);
            node.left = createBST(start, mid-1, nums);
            node.right = createBST(mid+1, end, nums);
            return node;
        }
        return null;
    }
}