import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class TreePathProblems {

    public static List<List<Integer>> allRootToLeafPaths(TreeNode root) {
        List<List<Integer>> paths = new ArrayList<>();
        dfs(root, new ArrayList<>(), paths);
        return paths;
    }

    private static void dfs(TreeNode node, List<Integer> path, List<List<Integer>> result) {
        if (node == null) return;
        path.add(node.val);
        if (node.left == null && node.right == null) result.add(new ArrayList<>(path));
        else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
        path.remove(path.size() - 1);
    }

    public static boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == target;
        return hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val);
    }

    public static int maxPathSum(TreeNode root) {
        return maxSum(root);
    }

    private static int maxSum(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;
        if (node.left == null && node.right == null) return node.val;
        return node.val + Math.max(maxSum(node.left), maxSum(node.right));
    }
}
