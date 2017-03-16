/**
 * Created by shhuang on 2017/3/10.
 */
public class Q111MinDepthOfBinaryTree {

    public static void main(String[] args) {
        Q111MinDepthOfBinaryTree object=new Q111MinDepthOfBinaryTree();
        TreeNode root=new TreeNode(1);
        TreeNode right=new TreeNode(2);

        TreeNode left=new TreeNode(3);
        left.left=new TreeNode(4);

        root.right=right;
        root.left=left;
        System.out.println(object.minDepth(left));
    }

    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        else if(root.left!=null&&root.right==null) return minDepth(root.left)+1;
        else if(root.right!=null&&root.left==null) return minDepth(root.right)+1;
        else return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }
}
