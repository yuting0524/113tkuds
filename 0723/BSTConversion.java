
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

class DLLNode {
    int val;
    DLLNode prev, next;
    DLLNode(int val) { this.val = val; }
}

public class BSTConversion {

    // BST 轉為排序雙向鏈表（中序）
    static DLLNode head = null, prev = null;

    public static DLLNode bstToDLL(TreeNode root) {
        head = null;
        prev = null;
        convert(root);
        return head;
    }

    private static void convert(TreeNode node) {
        if (node == null) return;
        convert(node.left);
        DLLNode curr = new DLLNode(node.val);
        if (prev == null) head = curr;
        else {
            prev.next = curr;
            curr.prev = prev;
        }
        prev = curr;
        convert(node.right);
    }

    // 陣列轉平衡 BST
    public static TreeNode sortedArrayToBST(int[] arr) {
        return build(arr, 0, arr.length - 1);
    }

    private static TreeNode build(int[] arr, int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        TreeNode node = new TreeNode(arr[m]);
        node.left = build(arr, l, m - 1);
        node.right = build(arr, m + 1, r);
        return node;
    }

    // 節點轉為「大於等於自身」的總和
    static int sum = 0;
    public static void convertToGreaterSum(TreeNode root) {
        if (root == null) return;
        convertToGreaterSum(root.right);
        sum += root.val;
        root.val = sum;
        convertToGreaterSum(root.left);
    }
}
