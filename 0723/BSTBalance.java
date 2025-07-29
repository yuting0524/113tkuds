class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class BSTBalance {

    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private static int height(TreeNode node) {
        if (node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        if (lh == -1 || rh == -1 || Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
    }

    public static int balanceFactor(TreeNode node) {
        if (node == null) return 0;
        return heightSingle(node.left) - heightSingle(node.right);
    }

    private static int heightSingle(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(heightSingle(node.left), heightSingle(node.right));
    }

    public static TreeNode mostUnbalanced(TreeNode root) {
        return findWorst(root, new int[]{0});
    }

    private static TreeNode findWorst(TreeNode node, int[] maxDiff) {
        if (node == null) return null;
        int bf = Math.abs(balanceFactor(node));
        TreeNode leftWorst = findWorst(node.left, maxDiff);
        TreeNode rightWorst = findWorst(node.right, maxDiff);
        if (bf > maxDiff[0]) {
            maxDiff[0] = bf;
            return node;
        }
        return leftWorst != null ? leftWorst : rightWorst;
    }
}
