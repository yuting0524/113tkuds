class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class TreeDistance {

    // 任意兩節點距離
    public static int findDistance(TreeNode root, int a, int b) {
        TreeNode lca = lowestCommonAncestor(root, a, b);
        return depthFrom(lca, a, 0) + depthFrom(lca, b, 0);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, int a, int b) {
        if (root == null || root.val == a || root.val == b) return root;
        TreeNode left = lowestCommonAncestor(root.left, a, b);
        TreeNode right = lowestCommonAncestor(root.right, a, b);
        return (left != null && right != null) ? root : (left != null ? left : right);
    }

    private static int depthFrom(TreeNode node, int val, int depth) {
        if (node == null) return -1;
        if (node.val == val) return depth;
        int left = depthFrom(node.left, val, depth + 1);
        if (left != -1) return left;
        return depthFrom(node.right, val, depth + 1);
    }

    // 樹的直徑（任兩點最遠距離）
    static int diameter = 0;

    public static int treeDiameter(TreeNode root) {
        diameter = 0;
        depth(root);
        return diameter;
    }

    private static int depth(TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }

    // 找出距離根節點 k 距離的所有節點
    public static void printNodesAtDistance(TreeNode root, int k) {
        printK(root, k);
    }

    private static void printK(TreeNode node, int k) {
        if (node == null) return;
        if (k == 0) {
            System.out.print(node.val + " ");
            return;
        }
        printK(node.left, k - 1);
        printK(node.right, k - 1);
    }
}
