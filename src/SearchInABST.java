public class SearchInABST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int val = 3;
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        bst(root,val);
    }

    private static TreeNode bst(TreeNode root, int val) {
        if(root==null) return root;
        if(root.val==val) return root;
        if (root.val<val) return bst(root.right,val);
        else return bst(root.left,val);
    }
}
