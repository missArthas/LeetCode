package easy;

/**
 * Created by shhuang on 2017/3/20.
 */
public class Q530MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args){
        Q530MinimumAbsoluteDifferenceInBST object = new Q530MinimumAbsoluteDifferenceInBST();

        TreeNode root=new TreeNode(1);
        TreeNode right=new TreeNode(3);
        TreeNode left=new TreeNode(2);
        root.right=right;
        right.left=left;

        System.out.println(object.getMinimumDifference(root));

    }



    public int getMinimumDifference(TreeNode root) {
        java.util.ArrayList<Integer> list=new java.util.ArrayList<Integer>();
        add(root,list);
        int min=65535;
        for(int i=0;i<list.size()-1;i++){
            int diff=Math.abs(list.get(i)-list.get(i+1));
            if(diff<min) min=diff;
        }
        return min;
    }

    public void add(TreeNode root, java.util.ArrayList<Integer> list){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            list.add(root.val);
            return;
        }
        add(root.left,list);
        list.add(root.val);
        add(root.right,list);
    }


}
