/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList< >();
        helper(root, result);
        return result;
    }
    private void helper(TreeNode root, List<Integer> result) {
        if(root != null){
            result.add(root.val);
            if(root.left != null){
                helper(root.left, result);
            }
            if(root.right != null){
                helper(root.right, result);
            }
        }
    }
}