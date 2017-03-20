package easy;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q226InvertBinaryTree {

    public static void main(String[] args) {
        Q226InvertBinaryTree object=new Q226InvertBinaryTree();
        TreeNode root=new TreeNode(1);
        TreeNode right=new TreeNode(2);

        TreeNode left=new TreeNode(3);
        left.left=new TreeNode(4);

        root.right=right;
        root.left=left;

        System.out.println(object.invertTree(root));
    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        if(root.right==null&&root.left==null) return root;
        TreeNode tr=null;
        TreeNode tl=null;
        if(root.right!=null) tr=invertTree(root.right);
        if(root.left!=null) tl=invertTree(root.left);
        root.right=tl;
        root.left=tr;
        return root;
    }
}
