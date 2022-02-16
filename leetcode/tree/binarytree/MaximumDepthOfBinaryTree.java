package tree.binarytree;

//104. Maximum Depth of Binary Tree
public class MaximumDepthOfBinaryTree {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        return depth;
    }
}
