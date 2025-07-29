class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class BSTValidation {

    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) return false;
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    // 假設不合法節點只有一對 swapped node，找出它們
    static TreeNode first = null, second = null, prev = new TreeNode(Integer.MIN_VALUE);

    public static void findBrokenNodes(TreeNode root) {
        first = second = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
    }

    private static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null && prev.val > node.val) {
            if (first == null) first = prev;
            second = node;
        }
        prev = node;
        inorder(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(15); // 應該錯了（比 10 大）
        root.right = new TreeNode(20);

        System.out.println("是否為合法 BST: " + isValidBST(root));
        findBrokenNodes(root);
        if (first != null && second != null) {
            System.out.println("違規節點: " + first.val + ", " + second.val);
        }
    }
}
