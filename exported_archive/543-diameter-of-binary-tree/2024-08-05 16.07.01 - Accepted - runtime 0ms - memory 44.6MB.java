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

    private int largeDia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return largeDia;
    }

    private int height(TreeNode node){
       if(node == null) return 0;

       int left_height = height(node.left);
       int right_height = height(node.right);
       int diameter = left_height + right_height;

       largeDia = Math.max(largeDia, diameter);

       return 1 + Math.max(left_height, right_height);
    }
}