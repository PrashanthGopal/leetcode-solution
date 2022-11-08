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
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root);
    }
    
    public boolean isMirror(TreeNode t){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(t.left);
        q.offer(t.right);
        
        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null){
                continue;
            }
            else if(t1 == null || t2 == null){
                return false;
            }
            else if (t1.val != t2.val){
                return false;
            }
            q.offer(t1.left);
            q.offer(t2.right);
            q.offer(t1.right);
            q.offer(t2.left);
        }
        return true;
    }
} */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }else if(t1 == null || t2 == null){
            return false;
        }else if(t1.val != t2.val){
            return false;
        } else{
            return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
        }
    }
}