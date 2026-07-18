package algorithms;
/*
*Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
*A leaf is a node with no children.
*/
public class BinaryTreeNodePathSum {
    public boolean pathSum(TreeNode root, int targetSum){
        if (root == null)
            return false;

        int remaining = targetSum - root.val;

        if (root.left == null && root.right == null)
            return remaining == 0;

        return pathSum(root.left, remaining) || pathSum(root.right, remaining);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }
    TreeNode(int val){
        this.val =val;
    }
    TreeNode(int val, TreeNode left , TreeNode right){
        this.val = val;
        this.left = left;
        this.right =right;
    }

}
