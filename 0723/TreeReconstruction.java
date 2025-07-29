
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class TreeReconstruction {

    public static TreeNode buildFromPreIn(int[] preorder, int[] inorder) {
        return helperPreIn(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode helperPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe) return null;
        TreeNode root = new TreeNode(pre[ps]);
        int i = is;
        while (in[i] != pre[ps]) i++;
        int leftLen = i - is;
        root.left = helperPreIn(pre, ps + 1, ps + leftLen, in, is, i - 1);
        root.right = helperPreIn(pre, ps + leftLen + 1, pe, in, i + 1, ie);
        return root;
    }

    public static TreeNode buildFromPostIn(int[] post, int[] inorder) {
        return helperPostIn(post, 0, post.length - 1, inorder, 0, inorder.length - 1);
    }

    private static TreeNode helperPostIn(int[] post, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe) return null;
        TreeNode root = new TreeNode(post[pe]);
        int i = is;
        while (in[i] != post[pe]) i++;
        int leftLen = i - is;
        root.left = helperPostIn(post, ps, ps + leftLen - 1, in, is, i - 1);
        root.right = helperPostIn(post, ps + leftLen, pe - 1, in, i + 1, ie);
        return root;
    }
}
