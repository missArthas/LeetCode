/**
 * Created by shhuang on 2017/3/10.
 */
public class Q110BalanceBinaryTree {
    public static void main(String[] args) {
        Q110BalanceBinaryTree object=new Q110BalanceBinaryTree();
        TreeNode root=new TreeNode(1);
        TreeNode right=new TreeNode(2);

        TreeNode left=new TreeNode(3);
        left.left=new TreeNode(4);

        root.right=right;
        root.left=left;
        System.out.println(object.isBalanced(left));
    }

    public boolean isBalanced(TreeNode root) {
        int ldepth=depth(root.left);
        int rdepth=depth(root.right);
        if(ldepth-rdepth<=1&&ldepth-rdepth>=-1) return true;
        else return false;
    }

    public int depth(TreeNode root) {
        return 0;
    }
}
