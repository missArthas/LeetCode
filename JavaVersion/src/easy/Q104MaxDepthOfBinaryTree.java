package easy;

/**
 * Created by shhuang on 2017/3/10.
 */
public class Q104MaxDepthOfBinaryTree {

    public static void main(String[] args) {
        Q104MaxDepthOfBinaryTree object=new Q104MaxDepthOfBinaryTree();
        TreeNode root=new TreeNode(1);
        TreeNode right=new TreeNode(2);

        TreeNode left=new TreeNode(3);
        left.left=new TreeNode(4);

        root.right=right;
        root.left=left;

        System.out.println(object.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
