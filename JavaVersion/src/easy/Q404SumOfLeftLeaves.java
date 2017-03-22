package easy;

/**
 * Created by shhuang on 2017/3/7.
 */
public class Q404SumOfLeftLeaves {
    public static void main(String[] args){
        Q404SumOfLeftLeaves object = new Q404SumOfLeftLeaves();
        TreeNode root=new TreeNode(3);
        TreeNode left1=new TreeNode(9);
        TreeNode right1=new TreeNode(20);
        TreeNode right1Left=new TreeNode(15);
        TreeNode right1Right=new TreeNode(7);
        root.left=left1;
        root.right=right1;
        right1.left=right1Left;
        right1.right=right1Right;
        System.out.println(object.sumOfLeftLeaves(root));
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 0;
        int sum=0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null) return root.left.val+sumOfLeftLeaves(root.right);
        else return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }
}
