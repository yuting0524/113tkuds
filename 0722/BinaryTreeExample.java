class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeExample {
    
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public static boolean search(TreeNode root, int target) {
        if (root == null) return false;
        if (root.data == target) return true;
        return search(root.left, target) || search(root.right, target);
    }

    public static void main(String[] args) {
        // 建立修改後的測試樹:
        //
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        //      /
        //     6
        //    /
        //   7
        //  /
        // 9

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.left.left = new TreeNode(7);
        root.left.right.left.left.left = new TreeNode(9);  // 加入節點 9

        System.out.print("前序走訪: ");
        preOrder(root); // 1 2 4 5 6 7 9 3
        System.out.println();

        System.out.println("樹的高度: " + getHeight(root));   // 5
        System.out.println("節點總數: " + countNodes(root));  // 8
        System.out.println("搜尋 9: " + search(root, 9));     // true
        System.out.println("搜尋 10: " + search(root, 10));   // false
    }
}
