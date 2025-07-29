import java.util.*;

public class F09_BinaryTreeLeftView {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) {
            val = v;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tokens = sc.nextLine().split(" ");
        TreeNode root = buildTree(tokens);
        printLeftView(root);
    }

    // 利用 Queue 建樹（層序）
    public static TreeNode buildTree(String[] tokens) {
        if (tokens[0].equals("-1")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(tokens[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < tokens.length) {
            TreeNode curr = queue.poll();
            // left
            if (!tokens[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(tokens[i]));
                queue.add(curr.left);
            }
            i++;
            if (i >= tokens.length) break;
            // right
            if (!tokens[i].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(tokens[i]));
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }

    public static void printLeftView(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("LeftView:");

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (i == 0) System.out.print(" " + curr.val);
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
            }
        }
        System.out.println();
    }
}
